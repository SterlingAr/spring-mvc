package pcbuild.abstractbuildfactories;

import pcbuild.producttype.Hardware;
import pcbuild.producttype.Software;

/**
 * To create a build I need one of these objects
 *  */
public abstract class PcBuildFactory {
	
	public abstract Hardware createHardwareObject();
	public abstract Software createSoftwareObject();

}
