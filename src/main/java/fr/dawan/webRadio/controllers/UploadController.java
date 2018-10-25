package fr.dawan.webRadio.controllers;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;

@Controller
public class UploadController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/upload")
	public String getUpload() {
		return "upload";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public String handleFileUpload(@RequestParam("nomArtiste") String nomArtiste,
			@RequestParam("titreMorceau") String titreMorceau, @RequestParam("file") MultipartFile file,
			RedirectAttributes redirectAttributes) {

		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.EU_WEST_3)
				.withCredentials(new ProfileCredentialsProvider()).build();

		String bucket_name = "mp3webradio-benjixxx";

		try {
			InputStream is = file.getInputStream();

			// save on s3 with public read access
			s3.putObject(new PutObjectRequest(bucket_name, titreMorceau, is, new ObjectMetadata())
					.withCannedAcl(CannedAccessControlList.PublicRead));

			// get a reference to the image Object
			S3Object s3Object = s3.getObject(new GetObjectRequest(bucket_name, titreMorceau));

			// add to model
			redirectAttributes.addAttribute(s3Object.getObjectContent().getHttpRequest().getURI().toString());

			System.out.println(s3Object.getObjectContent().getHttpRequest().getURI().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (AmazonServiceException e) {
			e.printStackTrace();
		}
		return "upload";
	}
}
