package de.dhbw.tinf12b3.weather;

public class Main {

	public static void main(final String[] arguments) {
		final SkyObject yellowThing = new Sun();
		final SkyObject mistyThing = new Cloud();
		yellowThing.appear();
		mistyThing.appear();
		final SkyObject[] onStage = new SkyObject[] {
				yellowThing,
				mistyThing,
		};
		for (SkyObject each : onStage) {
			each.vanish();
		}

		final Weatherman kachel = new Weatherman();
		kachel.talkAbout(yellowThing);
		kachel.talkAbout(mistyThing);
		for (SkyObject each : onStage) {
			kachel.talkAbout(each);
		}
	}
}
