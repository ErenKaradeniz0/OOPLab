package week10.inter;
public class Cat implements Interface1 {

	@Override
	public void Speak() {
		System.out.println("Meaoww");
		
	}

	@Override
	public void Walk() {
		System.out.println("I can walk as a Cat");
		
	}

	@Override
	public void Swim() {
		System.out.println("I cant swim as a Cat!! HELP ME");
		
	}

}
