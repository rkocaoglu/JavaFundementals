package methodoverridding;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.hareket());
		
		Snake snake = new Snake();
		System.out.println(snake.hareket());
	}

}
