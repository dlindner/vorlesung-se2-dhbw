package de.dhbw.tinf12.mock;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.IAnswer;
import org.hamcrest.EasyMock2Matchers;
import org.hamcrest.core.Is;
import org.junit.Test;

public class GeigerCounterTest {
	@Test
	public void startsWithZero() throws Exception {
		final GeigerCounter target = new GeigerCounter();
		assertThat(target.getCounts(), is(0));
	}

	@Test
	public void observesRadioactivity() throws Exception {
		final GeigerCounter target = new GeigerCounter();
		final RadioactiveElement testUran =
				EasyMock.createMock(RadioactiveElement.class);
		testUran.addDecayListener(
				(DecayListener) EasyMock.anyObject());
		EasyMock.expectLastCall().once();
		EasyMock.replay(testUran);

		target.observe(testUran);

		EasyMock.verify(testUran);
	}

	@Test
	public void countsEveryImpulse() {
		final GeigerCounter target = new GeigerCounter();
		final RadioactiveElement testUran = new RadioactiveElement() {
			@Override
			public void startDecaying() {
				// do nothing
			}
			@Override
			public void addDecayListener(DecayListener l) {
				l.isDecayed();
			}
		};
		target.observe(testUran);

		assertThat(target.getCounts(), is(1));
	}
}
