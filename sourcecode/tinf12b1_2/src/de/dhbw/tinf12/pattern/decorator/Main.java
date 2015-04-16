package de.dhbw.tinf12.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Staatseigentum gadget = new Inspector();
		Staatseigentum flyer = new Fluggerät(gadget);
		Staatseigentum eyes = new XRayEyes(flyer);
		Staatseigentum fly2 = new Fluggerät(eyes);

		fly2.herrsche();
	}
}
