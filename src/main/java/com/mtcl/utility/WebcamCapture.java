package com.mtcl.utility;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

/**
 * Example of how to take single picture.
 * 
 * @author Mukul Tripathi
 */
public class WebcamCapture {

	public BufferedImage takeImage(){
		// get default webcam and open it
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(new Dimension(640, 480));
		webcam.open();

		// get image
		BufferedImage image = webcam.getImage();
		// Generate sting filename
		String name = String.format("face-%d.png", System.currentTimeMillis());
		
		try {
			// save image to JPG file
			ImageIO.write(image, "png", new File(name));

			System.out.format("File %s has been saved\n", name);

		} catch (IOException t) {
			t.printStackTrace();
		}
		
		webcam.close();

		return image;
	}
}
