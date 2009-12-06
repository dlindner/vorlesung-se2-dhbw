package de.dhbw.tit07.progress;

import java.io.File;

import de.dhbw.tit07.progress.gui.Visualization;
import de.dhbw.tit07.progress.model.WorkUnit;
import de.dhbw.tit07.progress.model.Step;
import de.dhbw.tit07.progress.model.Task;

public final class Main {

	private Main() {
		super();
	}

	public static void main(String[] args) throws Exception {
		Visualization gui = new Visualization();
		Task determineCharacters = new Task("count the characters of all filenames");
		determineCharacters.addProgressListener(gui);
		determineCharacters.addSteps(new CrawlAndCount());
		gui.show();
		determineCharacters.perform();
		determineCharacters.printStatistics();
	}

	private static class CrawlAndCount implements Step {
		public CrawlAndCount() {
			super();
		}

		@Override
		public void perform(WorkUnit work) throws Exception {
			CharacterCountCrawler crawler = new CharacterCountCrawler();
			File whatToCrawl = File.listRoots()[0];
			crawler.crawl(whatToCrawl, work);
			work.finished();
			System.out.println(crawler.toString());
		}
	}
}
