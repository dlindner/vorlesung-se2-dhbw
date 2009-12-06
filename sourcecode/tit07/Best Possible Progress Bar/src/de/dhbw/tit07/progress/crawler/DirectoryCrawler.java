package de.dhbw.tit07.progress.crawler;

import java.io.File;
import java.io.IOException;

import de.dhbw.tit07.progress.helper.ParameterCheck;
import de.dhbw.tit07.progress.model.WorkUnit;

public abstract class DirectoryCrawler {

	public DirectoryCrawler() {
		super();
	}

	public void crawl(File directory, WorkUnit work) throws IOException {
		ParameterCheck.ensurePresence(directory);
		File[] files = directory.listFiles();
		if (null == files) {
			return;
		}
		iterateThroughFiles(files, work);
	}

	protected void iterateThroughFiles(File[] files, WorkUnit work) throws IOException {
		WorkUnit[] steps = work.createParts(files.length);
		for (int i = 0; i < files.length; i++) {
			handle(files[i], steps[i]);
			steps[i].finished();
		}
	}

	protected void handle(File file, WorkUnit step) throws IOException {
		if (file.isDirectory()) {
			performOnDirectory(file);
			crawl(file, step);
			return;
		}
		if (file.isFile()) {
			performOnFile(file);
		}
	}

	protected abstract void performOnFile(File file) throws IOException;

	protected abstract void performOnDirectory(File directory) throws IOException;
}
