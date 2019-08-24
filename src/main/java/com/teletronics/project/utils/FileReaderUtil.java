package com.teletronics.project.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.core.io.ClassPathResource;

public class FileReaderUtil {

	public String readFile() {
		
		String content = "";
		
		try {
			ClassPathResource resource = new ClassPathResource("readme.md");
			InputStream inputStream = resource.getInputStream();
			content=read(inputStream);
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}
	private static String read(InputStream input) throws IOException {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
            return buffer.lines().collect(Collectors.joining("\n"));
        }
    }
}
