package shapefactory;

public class ColorsFactory extends AbstractFactory {

	@Override
	Colors getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
