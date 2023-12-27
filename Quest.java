package com.issue;

class Base{
	public void display() {
		System.out.println("Base");
	}
}
class Drived extends Base{
	public void display() {
		System.out.println("Drived");
	}
}

public class Quest {
	
	public static  void dodisplay(Drived drived) {
		drived.display();
	}

	public static void main(String[] args) {
		Base base=new Base();
		Base drived=new Drived();
		Drived d=new Drived();
		base.display(); //Base
		drived.display(); //Drived
		d.display(); //drived
		Quest.dodisplay(d);//base

	}

}
