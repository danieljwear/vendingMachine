package VendMachine;

public class Product {
	private String rowcode;
	private String group;
	private int stock;
	
	public Product(String position, String kind, int inventory) {
		this.rowcode = position;
		this.group = kind;
		this.stock = inventory;
	}
	
	public void setRowcode(String position) {
		rowcode = position;
	}
	
	public String getRowcode() {
		return rowcode;
	}
	
	public void setGroup(String kind) {
		group = kind;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setStock(int inventory) {
		stock = inventory;
	}
	
	public void decreaseStock() {
		this.stock--;
	}
	
	public int getStock() {
		return stock;
	}
	
	public String toString() {
		return "product position " + rowcode + " Type of product " + group + " Stock quantity " + stock;
	}

}
