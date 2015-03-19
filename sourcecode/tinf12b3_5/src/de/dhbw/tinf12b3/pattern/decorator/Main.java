package de.dhbw.tinf12b3.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		final Frau meine = new Frau();
		final Kontostand geld = new Kontostand(meine);
		final Reinlichkeit sauber = new Reinlichkeit(geld);
		final Reinlichkeit sauber2 = new Reinlichkeit(sauber);
		final Reinlichkeit sauber3 = new Reinlichkeit(sauber2);
		final Humor fröhlich = new Humor(sauber3);

		final Handlungsfähig geschöpf = fröhlich;
		geschöpf.handle();
	}

}
