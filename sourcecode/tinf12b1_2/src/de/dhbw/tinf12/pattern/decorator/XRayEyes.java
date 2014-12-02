package de.dhbw.tinf12.pattern.decorator;

public class XRayEyes extends Feature {

	public XRayEyes(Staatseigentum sockel) {
		super(sockel);
	}

	@Override
	public void herrsche() {
		super.herrsche();
		System.out.println("... mit durchdringendem Blick.");
	}
}
