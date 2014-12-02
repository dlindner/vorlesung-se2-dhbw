package de.dhbw.tinf12.intro;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		final $ bielefeld = new ICE();
		final TGV dgpaidhaidh = new TGV();
		final List<$> meine = new ArrayList<$>() {{
			add((ICE) bielefeld);
			add(dgpaidhaidh);
		}};

		bielefeld.benutzeToilette();
		dgpaidhaidh.benutzeToilette();
		for ($ each : meine) {
			each.benutzeToilette();
		}

		final Depot depot = new Depot();
		depot.reinige(bielefeld);
		depot.reinige(dgpaidhaidh);
		for ($ each : meine) {
			depot.reinige(each);
		}
		try {
			Thread.currentThread().sleep(300000L);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
