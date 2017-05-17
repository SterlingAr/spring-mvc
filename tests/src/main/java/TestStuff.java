
public class TestStuff {

	public static void main(String[] args) {

		AbstractFactoryHardwareSoftware factory = HardwareSoftwareFactoryProducer.getCategoryProduct("Hardware");

		Hardware cpu = factory.getHardware(HardwareTypes.CHIPSET);
		Hardware memory = factory.getHardware(HardwareTypes.MEMORY);

		System.out.println(cpu.getClass() + "\n \n" + memory.getClass());
	}

}
