package week10.inter;

public class Dog implements Interface1{

	@Override
	public void Speak() {
		System.out.println("Hav-hav");
	}

	@Override
	public void Walk() {
		System.out.println("I can walk as a Dog");
		
	}

	@Override
	public void Swim() {
		System.out.println("I can swim as a dog");
		
	}

}
