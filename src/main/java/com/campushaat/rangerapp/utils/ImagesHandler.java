//package com.campushaat.rangerapp.utils;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//import org.glassfish.jersey.media.multipart.BodyPartEntity;
//import org.glassfish.jersey.media.multipart.FormDataBodyPart;
//
//public class ImagesHandler {
//	
//	// Upload images from Byte Image format
//	public ArrayList<String> uploadImgeToAmazonS3(ArrayList<byte[]> byteImages) {
//		ArrayList<String> imageUrls = new ArrayList<>();
//		if(byteImages==null) {
//			return imageUrls;
//		}
//		else if(byteImages.isEmpty()) {
//			return imageUrls;
//		}
//
//		for(int i=0;i<byteImages.size();i++){
//			imageUrls.add(uploadSingleImageToAmazonS3(byteImages.get(i)));
//		}
//		return imageUrls;
//	}
//	
//	// Upload single image from Byte Image format
//	public String uploadImgeToAmazonS3(byte[] byteImage) {
//		String imageUrls = new String();
//		if(byteImage==null) {
//			return imageUrls;
//		}
//		else if(byteImage.length==0) {
//			return imageUrls;
//		}
//
//		return uploadSingleImageToAmazonS3(byteImage);
//	}
//	
//	public String uploadSingleImageToAmazonS3(byte[] byteImages) {
//		String imageUrls="";
//		if(byteImages.length==0) return imageUrls;
//		
//		imageUrls = generateUniqueName();
//		InputStream tempImage = new ByteArrayInputStream(byteImages); 
//		
//		// Don't comment below line as it contains the code to upload images to the server
//		String S3Response = new amazonS3().storeDataInS3(imageUrls, tempImage, byteImages.length);
//		imageUrls = Constants.amazonBaseUrl+Constants.bucketS3Malik+"/"+imageUrls;
//		return imageUrls;
//	}
//
//	public static ArrayList<String> uploadDocumentToS3(List<FormDataBodyPart> bodyParts){
//		ArrayList<String> documentUrls=new ArrayList<>();
//		if(bodyParts==null) {
//			return documentUrls;
//		}
//		else if(bodyParts.size()==0) {
//			return documentUrls;
//		}
//
//		for(int i=0;i<bodyParts.size();i++) {
//			BodyPartEntity bodyPartEntity = (BodyPartEntity) bodyParts.get(i).getEntity();
//			InputStream inputStream = bodyPartEntity.getInputStream();
//			documentUrls.add(uploadSingleDocumentToAmazonS3(inputStream));
//		}
//		return documentUrls;
//	}
//	
//	// Upload images from FormDataBodyPart Image format
//	public ArrayList<String> uploadImgeToAmazonS3(List<FormDataBodyPart> bodyParts) {
//		
//		ArrayList<String> imageUrls=new ArrayList<>();
//		if(bodyParts==null) {
//			return imageUrls;
//		}
//		else if(bodyParts.size()==0) {
//			return imageUrls;
//		}
//		
//		for(int i=0;i<bodyParts.size();i++) {
//			BodyPartEntity bodyPartEntity = (BodyPartEntity) bodyParts.get(i).getEntity();
//			InputStream inputStream = bodyPartEntity.getInputStream();
//			imageUrls.add(uploadSingleImageToAmazonS3(inputStream));
//		}	
//		return imageUrls;
//	}
//	
//	public String uploadImgeToAmazonS3(FormDataBodyPart bodyParts) {
//		
//		String imageUrls="";
//		if(bodyParts==null) {
//			return imageUrls;
//		}
//		
//		BodyPartEntity bodyPartEntity = (BodyPartEntity) bodyParts.getEntity();
//		InputStream inputStream = bodyPartEntity.getInputStream();
//		imageUrls = imageUrls + uploadSingleImageToAmazonS3(inputStream);
//		return imageUrls;
//	}
//
//	// Upload single pdf document from InputStream data
//	public static String uploadSingleDocumentToAmazonS3(InputStream inputStream) {
//		String docUrl="";
//		if(inputStream == null) return docUrl;
//
//		docUrl = generateUniqueName("pdf");
//
//		// Fake code simulating the copy
//		// You can generally do better with nio if you need...
//		// And please, unlike me, do something about the Exceptions :D
//		byte[] buffer = new byte[1024];
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		int len;
//		int total=0;
//		try {
//			while ((len = inputStream.read(buffer)) > -1 ) {
//				baos.write(buffer, 0, len);
//				total+=len;
//			}
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		try {
//			baos.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		InputStream temp = new ByteArrayInputStream(baos.toByteArray());
//
//		// Don't comment below line as it contains the code to upload images to the server
//		String S3Response = new amazonS3().storeDataInS3(docUrl, temp, total);
//		docUrl = Constants.amazonBaseUrl + Constants.bucketS3Malik + "/" + docUrl;
//		return docUrl;
//	}
//
//
//	// Upload single image from InputStream data
//	public String uploadSingleImageToAmazonS3(InputStream inputStream) {
//		String imageUrl="";
//		if(inputStream == null) return imageUrl;
//		
//		imageUrl = generateUniqueName();
//		
//		// Fake code simulating the copy
//		// You can generally do better with nio if you need...
//		// And please, unlike me, do something about the Exceptions :D
//		byte[] buffer = new byte[1024];
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		int len;
//		int total=0;
//		try {
//			while ((len = inputStream.read(buffer)) > -1 ) {
//			    baos.write(buffer, 0, len);
//			    total+=len;
//			}
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			baos.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		InputStream temp = new ByteArrayInputStream(baos.toByteArray()); 
//		
//		// Don't comment below line as it contains the code to upload images to the server
//		String S3Response = new amazonS3().storeDataInS3(imageUrl, temp, total);
//		imageUrl = Constants.amazonBaseUrl + Constants.bucketS3Malik + "/" + imageUrl;
//		return imageUrl;
//	}
//
//	private String generateUniqueName() {
//		
//		String imageUrls;
//		UUID unique = java.util.UUID.randomUUID();
//		String dateUrl = DateTimeHandler.CurrentTimeStampF2();
//		imageUrls = unique.toString() + "-" + dateUrl + ".jpg";
//		return imageUrls;
//	}
//
//	private static String generateUniqueName(String format) {
//
//		String url;
//		UUID unique = java.util.UUID.randomUUID();
//		String dateUrl = DateTimeHandler.CurrentTimeStampF2();
//		url = unique.toString() + "-" + dateUrl + "." + format;
//		return url;
//	}
//}
