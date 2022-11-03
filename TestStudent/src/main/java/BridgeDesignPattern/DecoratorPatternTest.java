package BridgeDesignPattern;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream icecream = new HoneyDecorator(new
				NuttyDecorator(new SimpleIcecream()));
				System.out.println(icecream.makeIcecream());

	}

}
