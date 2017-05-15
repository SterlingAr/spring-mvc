

package tests;

import java.util.UUID;

abstract class Product {
	
	protected UUID id;
	
	protected String manufacturer;
	
	public Product(){}
	
	public Product(String manufacturer){
		this.manufacturer = manufacturer;
		id = UUID.randomUUID();
	}
	
	@Override
	public String toString(){
		return "Manufacturer: " + manufacturer + " \nUUID: " + id;
	}
	
	abstract void creatingProduct();

}
//
class Cpu extends Product {
	
	public Cpu(String manufacturer){
		super(manufacturer);
	}
	
	@Override
	void creatingProduct() {
		System.out.println("Inside Cpu::creatingProduct()");
	}

}

class RamMemory extends Product {
	
	public RamMemory(String manufacturer){
		super(manufacturer);
	}

	@Override
	void creatingProduct() {
		System.out.println("Inside RamMemory::creatingProduct()");
	}
	
	@Override
	public String toString(){
		return "Manufacturer: " + manufacturer + " \nUUID: " + id;
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
		return new Cpu("Intel");
	}

	public RamMemory createRamMemory() {
		return new RamMemory("kingston");
	}

	@Override
	public Os createOs() {
		// TODO Auto-generated method stub
		return null;
	}

}

class SoftwareProduct extends ProductFactory{

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
enum ProductCategory{
	
	HARDWARE,SOFTWARE
	
}

abstract class ProductFactory {
	
	private static final HardwareProduct HARDWARE_FACTORY = new HardwareProduct();
	private static final SoftwareProduct SOFTWARE_FACTORY = new SoftwareProduct();
	
	static ProductFactory getFactory(ProductCategory category){
		ProductFactory factory = null;
		switch(category){
		case HARDWARE: factory =  HARDWARE_FACTORY;break;
		case SOFTWARE: factory =  SOFTWARE_FACTORY;break;
		
		}
		
		return factory;
		
	}
	
	public abstract Cpu createCpu();
	public abstract RamMemory createRamMemory();
	public abstract Os createOs();

}

	


