package pcbuild;

import java.util.UUID;

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
		return "Manufacturer: " + manufacturer + " \nUUID: " + id + "\ncategory:" + category + "\ntype: "+type;
	}

	abstract void creatingProduct();

}

//
class Cpu extends Product {

	public Cpu(String manufacturer, String category, String type) {
		super(manufacturer, category, type);
	}

	@Override
	void creatingProduct() {
		System.out.println("Inside Cpu::creatingProduct()");
	}

}

class RamMemory extends Product {

	public RamMemory(String manufacturer, String category, String type) {
		super(manufacturer, category, type);

	}

	@Override
	void creatingProduct() {
		System.out.println("Inside RamMemory::creatingProduct()");
	}



}

class Os extends Product {

	@Override
	void creatingProduct() {
		System.out.println("Inside Os::creatingProduct()");

	}

}
//

//
class HardwareProduct extends ProductFactory {

	public Cpu createCpu() {
		return new Cpu("Intel", "Hardware", "Chipset");
	}

	public RamMemory createRamMemory() {
		return new RamMemory("kingston", "Hardware", "Memory");
	}

	@Override
	public Os createOs() {
		// TODO Auto-generated method stub
		return null;
	}

}

class SoftwareProduct extends ProductFactory {

	public Os createOs() {
		return new Os();
	}

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RamMemory createRamMemory() {
		// TODO Auto-generated method stub
		return null;
	}

}

//
enum ProductCategory {

	HARDWARE, SOFTWARE

}

abstract class ProductFactory {

	private static final HardwareProduct HARDWARE_FACTORY = new HardwareProduct();
	private static final SoftwareProduct SOFTWARE_FACTORY = new SoftwareProduct();

	static ProductFactory getFactory(ProductCategory category) {
		ProductFactory factory = null;
		switch (category) {
		case HARDWARE:
			factory = HARDWARE_FACTORY;
			break;
		case SOFTWARE:
			factory = SOFTWARE_FACTORY;
			break;

		}

		return factory;

	}

	public abstract Cpu createCpu();

	public abstract RamMemory createRamMemory();

	public abstract Os createOs();

}
