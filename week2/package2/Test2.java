package week2.package2;

import week2.package1.Circle;

//import week2.package1.Circle;  part c
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(); //part b
		c.radius=12;
		System.out.println(c.calculate_area());
		System.out.println(c.calculate_perimeter());
	}

}
