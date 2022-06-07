package week10.inter;

import java.util.ArrayList;

public class InterE {

	public static void main(String[] args) {
		
		Interface1 interface1;
		
		ArrayList<Interface1> animallist;
		animallist=new ArrayList<Interface1>();
		
		for (int i = 0; i < 10; i++) {
			
			if(i%2==0)
				interface1=new Cat();
			else
				interface1=new Dog();
			
			animallist.add(interface1);
		}
		
		for (Interface1 in1 : animallist) {
			
			if (in1 instanceof Cat) {
				in1.Speak();
				in1.Walk();
				in1.Swim();
			} 
			else if (in1 instanceof Dog) {
				in1.Speak();
				in1.Walk();
				in1.Swim();
			}
		}

	}

}
