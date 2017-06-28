package shapefactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Colors getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {

		if (shape == null) {
			return null;
		}

		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

}
