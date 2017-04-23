import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Factory: ");
		Scanner sc=new Scanner(System.in);
		String f = sc.next();
		
		FactoryProducer fp=new FactoryProducer();
		AbstractFactory factory=fp.getFactory(f);
		
		System.out.print(factory.getClass().getName());
		System.out.println();
		
		String inp = sc.next();
		
		if (factory.getClass().getName().equals("ShapeFactory")){
			Shape sh=factory.getShape(inp);
			sh.draw();
		}
		else if (factory.getClass().getName().equals("ColorFactory")) {
			Color col=factory.getColor(inp);
			col.fill();
		}
	}

}
