package VendMachine;

public class Chips extends Product {
	private String name;
	protected double price;
	
	public Chips(String position, String kind, int inventory, String brand, double cost) {
		
		super(position, kind, inventory);
		this.name = brand;
		this.price = cost;
	}
	
	public void setName(String brand) {
		name = brand;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double cost) {
		price = cost;
	}
	
	public double getPrice() {
		return price;
	}	

}
