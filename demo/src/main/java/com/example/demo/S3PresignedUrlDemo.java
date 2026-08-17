package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.presigner.S3Presigner;
import software.amazon.awssdk.services.s3.presigner.model.GetObjectPresignRequest;
import software.amazon.awssdk.services.s3.presigner.model.PresignedGetObjectRequest;
import software.amazon.awssdk.regions.Region;
import java.time.Duration;
import java.net.URL;

public class S3PresignedUrlDemo {
    public static void main(String[] args) {
        try (S3Presigner presigner = S3Presigner.builder()
                .region(Region.US_EAST_1) // change to your bucket's actual region
                .build()) {

            GetObjectRequest getObjectRequest = GetObjectRequest.builder()
                    .bucket("aws-s3-learning-demo")
                    .key("dummy.txt")
                    .build();

            GetObjectPresignRequest presignRequest = GetObjectPresignRequest.builder()
                    .signatureDuration(Duration.ofMinutes(15))
                    .getObjectRequest(getObjectRequest)
                    .build();

            PresignedGetObjectRequest presignedRequest = presigner.presignGetObject(presignRequest);
            URL url = presignedRequest.url();

            System.out.println("Presigned URL: " + url);
            System.out.println("Generated at: " + java.time.LocalDateTime.now());
        }
    }
}