package org.bike;

public class BikedDetails2 extends BikeInfo{

	@Override
	public void speed() {
System.out.println("Bike Speed is 70kmph  ");		
	}

	@Override
	public void weight() {
System.out.println("Bike wieght is 150kg ");		
	}
public static void main(String[] args) {
	BikedDetails2 b = new BikedDetails2 ();
	b.speed();
	b.weight();
}
}
