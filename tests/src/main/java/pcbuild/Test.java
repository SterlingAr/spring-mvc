package pcbuild;

import java.util.ArrayList;
import java.util.List;

	

public class Test {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();

		ProductFactory factory = ProductFactory.getFactory(ProductCategory.HARDWARE);

		Product cpu = factory.createCpu();
		Product cpu1 = factory.createCpu();
		Product cpu2 = factory.createCpu();
		Product cpu3 = factory.createCpu();
		
		ProductFactory factory2 = ProductFactory.getFactory(ProductCategory.SOFTWARE);

		
		Product rm1 = factory.createRamMemory();
		
		Product rm2 = factory.createRamMemory();

		cpu.creatingProduct();
		products.add(cpu);
		products.add(cpu1);
		products.add(cpu2);
		products.add(cpu3);
		products.add(rm1);
		products.add(rm2);
		
		products.forEach(product -> {
			System.out.println(product.toString());
		});
	}

}
