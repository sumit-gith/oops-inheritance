class Animal {
	void eat() {
		System.out.println("Animal need to eat food");
	}
	void sleep() {
		System.out.println("Animal need adeauate sleep");
	}
}

class Bird extends Animal {
	@Override
	void eat() {
		System.out.println("Bird need food eat");
	}
	@Override
	void sleep() {
		System.out.println("Bird need adequate sleep");
	}
	void fly() {
		System.out.println("Bird can fly in the sky");
	}
}

public class inheritance_1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}
