package fr.dawan.webRadio.controllers;

import java.io.InputStream;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class ConnexionBucket {

	private static String bucket_name = "mp3webradio-benjixxx";

	public static String bucketUrl = "https://s3.eu-west-3.amazonaws.com/mp3webradio-benjixxx/";

	public static InputStream getObjectFromBucket(String fileKeyName) throws Exception {
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.EU_WEST_3)
				.withCredentials(new ProfileCredentialsProvider()).build();
		S3Object object = s3.getObject(bucket_name, fileKeyName);
		InputStream objectData = object.getObjectContent();
		return objectData;
	}
<<<<<<< HEAD
=======

	/*
	 * AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
	 * .withRegion(clientRegion) .withCredentials(new ProfileCredentialsProvider())
	 * .build();
	 * 
	 * // Get an object and print its contents.
	 * System.out.println("Downloading an object"); fullObject =
	 * s3Client.getObject(new GetObjectRequest(bucketName, key));
	 * System.out.println("Content-Type: " +
	 * fullObject.getObjectMetadata().getContentType());
	 * System.out.println("Content: ");
	 * displayTextInputStream(fullObject.getObjectContent());
	 */
>>>>>>> branch 'master' of https://github.com/ProjetWebRadio/projetWebRadio

}
