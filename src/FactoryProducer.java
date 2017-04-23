
public class FactoryProducer {
	private AbstractFactory factory;
	public AbstractFactory getFactory(String factoryName){
		if(factoryName.equals("Shape")){
			factory=new ShapeFactory();
		}
		else if(factoryName.equals("Color")){
			factory=new ColorFactory();
		}
		else{
			System.out.println("No such factory found...");
		}
		return factory;
	}
}
