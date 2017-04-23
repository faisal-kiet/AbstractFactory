
public class ColorFactory implements AbstractFactory {
private Color col;
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color.equals("Red")){
			col=new Red();
		}
		else if (color.equals("Green")){
			col=new Green();
		}
		else if (color.equals("Blue")){
			col=new Blue();
		}
		else{
			System.out.println("No color found...");
		}
		return col;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
