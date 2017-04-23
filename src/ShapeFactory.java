
public class ShapeFactory implements AbstractFactory {
private Shape sh;
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if (shape.equals("Square")){
			sh=new Square();
		}
		else if (shape.equals("Circle")){
			sh=new Circle();
		}
		else if (shape.equals("Triangle")){
			sh=new Triangle();
		}
		else{
			System.out.println("No shape found...");
		}
		return sh;
	}

}
