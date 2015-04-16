package de.dhbw.tinf12.gol;

public class Rules {

	public static boolean nextState(boolean isAlive, int numberOfAliveNeighbours) {
		if (!isAlive && (2 == numberOfAliveNeighbours)) {
			return false;
		}
		return (!underpopulated(numberOfAliveNeighbours) && !overpopulated(numberOfAliveNeighbours));
	}

	private static boolean overpopulated(int aliveNeighbours) {
		return aliveNeighbours > 3;
	}

	private static boolean underpopulated(int aliveNeighbours) {
		return aliveNeighbours < 2;
	}
}
