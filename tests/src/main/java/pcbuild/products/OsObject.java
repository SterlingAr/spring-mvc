package pcbuild.products;

import pcbuild.producttype.Software;

public class OsObject implements Software{

	public OsObject(){
		creatingSoftwareComponents();
	}
	
	@Override
	public void creatingSoftwareComponents() {
		
		System.out.println("Inside OsObject::creatingSoftwareComponents()");
	}

}
