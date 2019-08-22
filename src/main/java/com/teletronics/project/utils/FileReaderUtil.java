package com.teletronics.project.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.util.ResourceUtils;

public class FileReaderUtil {

	public String readFile() {
		String content = "";
		try {
			File file = ResourceUtils.getFile("classpath:HELP.md");
			// Read File Content
			content = new String(Files.readAllBytes(file.toPath()));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return content;
	}

}
