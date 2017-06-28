
public class TestStuff {

	public static void main(String[] args) {

		AbstractFactoryHardwareSoftware factory = HardwareSoftwareFactoryProducer.getCategoryProduct("Hardware");
		AbstractFactoryHardwareSoftware factory2 = HardwareSoftwareFactoryProducer.getCategoryProduct("software");

		Product cpu = (Product) factory.getHardware(HardwareTypes.CHIPSET);
		Product memory = (Product) factory.getHardware(HardwareTypes.MEMORY);
		
		Product cpu2 = (Product) factory.getHardware(HardwareTypes.CHIPSET);
		
		Software soft = factory2.getSoftware(SoftwareTypes.OS);
		
		System.out.println(cpu2.getClass().getSuperclass() + "\n \n" + memory.getClass() + "\n" + soft.getClass().getSuperclass());
		System.out.println(soft.toString());
		
		Product ram = new RamMemory("ss","asda","sdas");
		
	}

}
