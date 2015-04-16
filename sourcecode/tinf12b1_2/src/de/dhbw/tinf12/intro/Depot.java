package de.dhbw.tinf12.intro;

class Depot {

	public Depot() {
		super();
	}

	public void reinige($ zug) {
		System.out.println("Dampfstrahler");
	}

	public void reinige(ICE ice) {
		System.out.println("Noch perfekt sauber");
	}

	public void reinige(TGV tgv) {
		System.out.println("Füge Chanel No.5 hinzu");
	}
}
