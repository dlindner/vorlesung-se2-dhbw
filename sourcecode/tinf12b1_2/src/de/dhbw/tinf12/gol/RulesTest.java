package de.dhbw.tinf12.gol;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesTest {

	@Test
	public void deathByUnderpopulation() {
		assertFalse(Rules.nextState(true, 1));
		assertFalse(Rules.nextState(true, 0));
	}

	@Test
	public void livesOn() {
		assertTrue(Rules.nextState(true, 2));
		assertTrue(Rules.nextState(true, 3));
	}

	@Test
	public void deathByOvercrowding() {
		assertFalse(Rules.nextState(true, 4));
		assertFalse(Rules.nextState(true, 5));
		assertFalse(Rules.nextState(true, 6));
		assertFalse(Rules.nextState(true, 7));
		assertFalse(Rules.nextState(true, 8));
	}

	@Test
	public void birth() {
		assertTrue(Rules.nextState(false, 3));
	}

	@Test
	public void noZombiesPlease() {
		assertFalse(Rules.nextState(false, 2));
	}
}
