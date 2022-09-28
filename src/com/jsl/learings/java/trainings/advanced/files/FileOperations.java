package com.jsl.learings.java.trainings.advanced.files;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperations {
	private static final Logger logger = Logger.getLogger("FileOperations");

	public static void printListOfFilesInDirRecursive() {
		try {
			Stream<Path> stream = Files.walk(Paths.get("../javatrainings"));
			List<Path> allList = stream.collect(Collectors.toList());
			Stream<Path> files = allList.stream();
			Stream<Path> directories = allList.stream();
			directories.parallel().filter(Files::isDirectory).forEach(System.out::println);
			files.parallel().filter(file -> file.getName(file.getNameCount() - 1).toString().contains(".xml")).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void tryWithResources() {
		Path p = Paths.get("src", "resources", "somefile.txt");
		String s = "This is the large contents of a file";
		try (BufferedWriter writer = Files.newBufferedWriter(p)) {
			writer.write(s);
		} catch (IOException e) {
			logger.info("bjb" + e.getMessage());
		}

	}

}
