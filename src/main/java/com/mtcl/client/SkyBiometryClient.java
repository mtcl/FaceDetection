package com.mtcl.client;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.ws.rs.core.MediaType;

import com.mtcl.model.Root;
import com.mtcl.utility.WebcamCapture;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.MultiPart;
import com.sun.jersey.multipart.impl.MultiPartWriter;

public class SkyBiometryClient {

	public static void main(String[] args) {
		try {

			ClientConfig cc = new DefaultClientConfig();
			cc.getClasses().add(MultiPartWriter.class);
			Client client = Client.create(cc);

			//put correct keys here
			String api_key = "bb6a75cdda9542ac93fce337c539ac111";
			String api_secret = "060b3895eb534a62bbbbdba93cc2175c1";

			final String BASE_URI = "http://api.skybiometry.com/fc/";
			WebResource service = client.resource(BASE_URI);

			ByteArrayOutputStream bas = new ByteArrayOutputStream();
			WebcamCapture webcamCapture = new WebcamCapture();
			BufferedImage bi = webcamCapture.takeImage();
			ImageIO.write(bi, "png", bas);
			byte[] facePic = bas.toByteArray();

			FormDataBodyPart apiKeyBodyPart = new FormDataBodyPart("api_key", api_key);
			FormDataBodyPart apiSecretBodyPart = new FormDataBodyPart("api_secret", api_secret);
			//FormDataBodyPart facePicBodyPart = new FormDataBodyPart("files", facePic,MediaType.APPLICATION_OCTET_STREAM_TYPE);
			FormDataBodyPart facePicBodyPart = new FormDataBodyPart("urls", "http://www.sweetlilmzmia.com/wp-content/uploads/2012/03/tumblr_lwzzauv8M51qdsjhwo1_1280.jpg");
			FormDataBodyPart attributesBodyPart = new FormDataBodyPart("attributes", "eyes");

			// Construct a MultiPart with two body parts
			MultiPart multiPart = new MultiPart();
			multiPart.bodyPart(apiKeyBodyPart).bodyPart(apiSecretBodyPart).bodyPart(facePicBodyPart)
					.bodyPart(attributesBodyPart);

			// POST the request //
			ClientResponse response = service.path("faces/detect").accept("application/json")
					.type(MediaType.MULTIPART_FORM_DATA_TYPE).post(ClientResponse.class, multiPart);

			if (response.getStatus() != 200) {
				System.out.println(response.getEntity(String.class));
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			} else {
				Root root = response.getEntity(Root.class);

				System.out.println("Response Status : " + root.getStatus());

				System.out.println("Person's eye is: ");

				System.out.println(root.getPhotos().get(0).getTags().get(0).getAttributes().getEyes().getValue());
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}