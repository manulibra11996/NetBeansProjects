package com.arelance.empleos.helpper;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileHelpper {

	public static String guardarArchivo(MultipartFile multipartFile, String ruta) {
		try {
			String nombreOriginal = multipartFile.getOriginalFilename();
			nombreOriginal.replace(" ", "-");
			File imageFile = new File(ruta + nombreOriginal);
			multipartFile.transferTo(imageFile);
			return nombreOriginal;
		} catch (IllegalStateException | IOException e) {
			System.err.println("Error: "+ e.getMessage());
			return null;
		}

	}

}
