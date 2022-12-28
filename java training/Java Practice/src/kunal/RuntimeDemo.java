package kunal;
//Java Runtime Polymorphism with Multilevel Inheritance
class Animal{
	static void eat() {
		System.out.println("Animal eat");
	}
}
class Dog extends Animal{
static void eat() {
		System.out.println("Dog Eat");
	}
}
class BabyDog extends Dog{
static void eat() {
		System.out.println("BabyDog Eat");
	}
}
public class RuntimeDemo {
public static void main(String[] args) {
	Animal animal = new Animal();
	animal.eat();
	Animal animal2=new Dog();
	animal2.eat();
	Dog animaBabyDog=new BabyDog();
	animaBabyDog.eat();
}
}

