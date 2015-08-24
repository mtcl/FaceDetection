package com.mtcl.camera;

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

	public static void main(String[] args) throws IOException {
		// get default webcam and open it
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(new Dimension(640, 480));
		webcam.open();

		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
		ImageIO.write(image, "JPG", new File("face.jpg"));
		webcam.close();
	}
}
