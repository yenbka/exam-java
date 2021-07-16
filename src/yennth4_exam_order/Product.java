package yennth4_exam_order;

public class Product {
	protected int id;
	protected String name;
	protected float price;
	public Product() {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void display() {
		System.out.println("id: " + id + "|Name:"+name+"|Price:"+price);
	}
      
}