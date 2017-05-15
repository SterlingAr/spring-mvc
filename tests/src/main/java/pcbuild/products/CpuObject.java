package pcbuild.products;

import pcbuild.producttype.Hardware;

public class CpuObject implements Hardware {
	
	public CpuObject(){
		creatingHardwareComponents();
	}

	@Override
	public void creatingHardwareComponents() {
		
		System.out.println("Inside CpuObject::creatingHardwareComponents()");
		
	}
	

}
