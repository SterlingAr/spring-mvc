import java.util.UUID;

interface Hardware {
	void creatingProduct();
}

interface Software {
	void creatingProduct();
}

///
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

///
class Cpu extends Product implements Hardware {

	public Cpu(String manufacturer, String category, String type) {
		super(manufacturer, category, type);
	}

	public void creatingProduct() {

	}

}

class RamMemory extends Product implements Hardware {

	public RamMemory(String manufacturer, String category, String type) {
		super(manufacturer, category, type);
	}

	@Override
	public void creatingProduct() {

	}

}

class Os extends Product implements Software {

	public Os(String manufacturer, String category, String type) {
		super(manufacturer, category, type);
	}

	@Override
	public void creatingProduct() {

	}

}

///
abstract class AbstractFactoryHardwareSoftware {

	abstract Hardware getHardware(HardwareTypes type);

	abstract Software getSoftware(SoftwareTypes type);

}

enum HardwareTypes {

	MEMORY, CHIPSET, MOTHERBOARD

}

enum SoftwareTypes {
	OS, PROGRAM
}

// individual factorie
class HardwareFactory extends AbstractFactoryHardwareSoftware {

	@Override
	Hardware getHardware(HardwareTypes type) {

		switch (type) {

		case MEMORY:
			return new RamMemory("Test", "Test", "Test");

		case CHIPSET:
			return new Cpu("Test", "Test", "Test");

		default:
			break;

		}

		return null;

	}

	@Override
	Software getSoftware(SoftwareTypes type) {
		return null;
	}

}

class SoftwareFactory extends AbstractFactoryHardwareSoftware {

	@Override
	Hardware getHardware(HardwareTypes type) {
		return null;
	}

	@Override
	Software getSoftware(SoftwareTypes types) {

		switch (types) {

		case OS:
			return new Os("Guindous", "Guindous", "Guindous");

		default:
			break;

		}

		return null;
	}

}

//
class HardwareSoftwareFactoryProducer {

	public static AbstractFactoryHardwareSoftware getCategoryProduct(String category) {

		switch (category.toLowerCase()) {
		case "hardware":
			return new HardwareFactory();
		case "software":
			return new SoftwareFactory();
		}

		return null;
	}

}



