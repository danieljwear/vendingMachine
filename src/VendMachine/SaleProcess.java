package VendMachine;

public class SaleProcess {
	protected double insertMoney;
	protected double price;
	protected double returnChange;
	
	public double SaleProduct(double moneyIn, double price) {
		returnChange = moneyIn - price;
		return returnChange;
	}
	
	public void setInsertMoney(double moneyIn) {
		insertMoney = moneyIn;
	}
	
	public double getInsertMoney() {
		return insertMoney;
	}
	
	public void setPrice(double value) {
		price = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setReturnChange(double change) {
		returnChange = change;
	}
	
	public double getReturnChange() {
		return returnChange;
	}
	
	boolean enoughCredit() {
		if (this.returnChange > 0)
			return true;
		else return false;
	}

}
