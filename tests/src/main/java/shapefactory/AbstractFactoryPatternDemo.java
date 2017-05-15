package shapefactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		
		//get shape factory
		AbstractFactory shapeFactory  = FactoryProducer.getFactory("SHAPE");
		
		//get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//call draw method of Shape Circle
		shape1.draw();
		
		
		
	}

}
