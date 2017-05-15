import java.util.UUID;

interface Hardware {
	void creatingProduct();
}

abstract class Product {

	protected UUID id;

	protected String manufacturer;

	protected String category;

	protected String type;

	public Product() {
	}

	public Product(String manufacturer, String category, String type) {
		this.manufacturer = manufacturer;
		this.category = category;
		this.type = type;
		id = UUID.randomUUID();
	}

	@Override
	public String toString() {
		return "Manufacturer: " + manufacturer + " \nUUID: " + id + "\ncategory:" + category + "\ntype: " + type;
	}


}

class Cpu extends Product implements Hardware {

	public Cpu(String manufacturer, String category, String type) {
		super(manufacturer, category, type);
	}

	
	public void creatingProduct() {

	}

}
