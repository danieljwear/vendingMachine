
package VendMachine;

// Still need export to an extrenal document

// Needs try & catch

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class vendingMachineTest {
  public vendingMachineTest() {
  }

  public static void main(String[] args) {
    SaleProcess Sale = new SaleProcess();
    Soda cocaCola1 = new Soda("A1", "Drinks", 10, "Diet Coke", 1.75D);
    Soda cocaCola2 = new Soda("A2", "Drinks", 10, "Coke", 1.75D);
    Chips fritoLays1 = new Chips("A3", "Snacks", 10, "Doritos", 1.25D);
    Chips fritoLays2 = new Chips("A4", "Snacks", 10, "Ruffles", 1.25D);
    System.out.print("\n************ Menu of products to select from ****************");
    System.out.println("\n-------------------------------------------------------------");
    System.out.println("[A1] Diet Coke  [A2] Coke       [A3] Doritos     [A4] Ruffles");
    System.out.println("|price: $1.75|  |price: $1.75|  |price: $1.25|  |price: $1.25|");
    System.out.println("-------------------------------------------------------------");
    Scanner getMoney = new Scanner(System.in);
    System.out.print("\nPlease insert money: ");
    double moneyIn = getMoney.nextDouble();
    double minMoney = 1.25;
    if (moneyIn < minMoney) {
      do {
        double moreNeeded = minMoney - moneyIn;
        System.out.print("\nPlease insert $" + moreNeeded + " more to start your transaction. Please insert money: ");
        moneyIn = getMoney.nextDouble();
        break;
      } while (moneyIn < minMoney);
    }

    Scanner getChoice = new Scanner(System.in);
    System.out.print("\nPlease select your choice from the menu: ");
    String choice = getChoice.nextLine().toUpperCase();
    switch (choice.hashCode()) {
    case 2064:
      if (choice.equals("A1")) {
        Sale.price = cocaCola1.getPrice();
        Sale.returnChange = Sale.SaleProduct(moneyIn, Sale.price);
        if (Sale.enoughCredit()) {
          displayChoice(cocaCola1.getName(), cocaCola1.getPrice(), Sale.getReturnChange());
          cocaCola1.decreaseStock();
        }

        return;
      }
      break;
    case 2065:
      if (choice.equals("A2")) {
        Sale.price = cocaCola2.getPrice();
        Sale.returnChange = Sale.SaleProduct(moneyIn, Sale.price);
        if (Sale.enoughCredit()) {
          displayChoice(cocaCola2.getName(), cocaCola2.getPrice(), Sale.getReturnChange());
          cocaCola2.decreaseStock();
        }

        return;
      }
      break;
    case 2066:
      if (choice.equals("A3")) {
        Sale.price = fritoLays1.getPrice();
        Sale.returnChange = Sale.SaleProduct(moneyIn, Sale.price);
        if (Sale.enoughCredit()) {
          displayChoice(fritoLays1.getName(), fritoLays1.getPrice(), Sale.getReturnChange());
          fritoLays1.decreaseStock();
        }

        return;
      }
      break;
    case 2067:
      if (choice.equals("A4")) {
        Sale.price = fritoLays2.getPrice();
        Sale.returnChange = Sale.SaleProduct(moneyIn, Sale.price);
        if (Sale.enoughCredit()) {
          displayChoice(fritoLays2.getName(), fritoLays2.getPrice(), Sale.getReturnChange());
          fritoLays2.decreaseStock();
        }

        return;
      }
    }

    System.out.println("\nYou made an invalid selection, please try again \n");
    System.out.println("Returning money \n...\n...\nPlease collect your " + moneyIn + " change\n");
  }

  public static void displayChoice(String Brand, double Price, double Change) {
    System.out.println("\n**********************");
    System.out.println("**** Sale Summary ****");
    System.out.println("**********************");
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println(timestamp);
    System.out.println("\nYou selected: " + Brand);
    System.out.println("The costs is: " + Price);
    System.out.println("Your change is: " + Change);
    System.out.println("\nThank you for your purchase!");
  }


   try{
      
      FileWriter fw = new FileWriter("receipt.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      bw.write(timestamp);
      bw.newLine();
      bw.write("selected: " + Brand);
      bw.newLine();
      bw.write("costs is: " + Price);
      bw.close();
      fw.close();
    
      
    }catch(IOException e1){}
    
    
    
    try{
      
      FileReader fr = new FileReader("receipt.txt");
      BufferedReader br = new BufferedReader(fr);
      
      String line = br.readLine();
      
      while(line!=null){
        
        System.out.println(line);
        line = br.readLine();
        
      }
      
      br.close();
      fr.close();
    
      
    }catch(IOException e2){}


  }
}

}