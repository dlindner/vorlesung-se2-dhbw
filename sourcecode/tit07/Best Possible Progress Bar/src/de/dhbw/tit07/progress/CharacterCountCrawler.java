package de.dhbw.tit07.progress;

import java.io.File;
import java.io.IOException;

import de.dhbw.tit07.progress.crawler.DirectoryCrawler;

public class CharacterCountCrawler extends DirectoryCrawler {

	private int totalCharacters;

	public CharacterCountCrawler() {
		super();
		this.totalCharacters = 0;
	}

	protected void addNameToTotalCharacters(String name) {
		this.totalCharacters += name.length();
	}

	@Override
	protected void performOnDirectory(File directory) throws IOException {
		addNameToTotalCharacters(directory.getName());
	}

	@Override
	protected void performOnFile(File file) throws IOException {
		addNameToTotalCharacters(file.getName());
	}

	@Override
	public String toString() {
		return "Counted a total of " + this.totalCharacters + " characters.";
	}
}
