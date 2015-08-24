package com.mtcl.client;

import java.net.URL;

import com.mtcl.model.Root;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {

	public static void main(String[] args) {
		try {

			Client client = Client.create();
			
			String api_key = "insert_api_key_here";
			String api_secret = "insert_api_secret_here";
			
			URL urlBase = new URL(
					"http://api.skybiometry.com/fc/faces/detect.json?api_key=");
			URL urlPic = new URL("http://seedmagazine.com/images/uploads/attractive_article.jpg");
			//URL urlPic = new URL("http://cdn.img42.com/a438f6bd0498b0725bd20b83e003b332.jpeg");
			String url = urlBase.toString() + api_key + "&api_secret=" +api_secret + "&urls=" + urlPic.toString() + "&attributes=eyes";
			System.out.println(url);

			WebResource webResource = client.resource(url);

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			Root root = response.getEntity(Root.class);

			System.out.println("Person's eye is: ");
			
			System.out.println(root.getPhotos().get(0).getTags().get(0).getAttributes().getEyes().getValue());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}