package com.example.azure;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;

public class BlobSasExample {

    public static void main(String[] args) {
        String accountUrl = "https://<storage-account-name>.blob.core.windows.net";
        String sasToken = "<your-sas-token>";
        String containerName = "<container-name>";

        // Build client using SAS token
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
            .endpoint(accountUrl)
            .sasToken(sasToken)
            .buildClient();

        BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);

        System.out.println("Connected to container: " + containerClient.getBlobContainerName());

        // Example 1: List blobs in the container
        for (BlobItem blobItem : containerClient.listBlobs()) {
            System.out.println("Blob: " + blobItem.getName());
        }

        // Example 2: Download a specific blob if it exists
        String blobName = "sample.txt";
        if (containerClient.getBlobClient(blobName).exists()) {
            System.out.println("Blob exists: " + blobName);
        } else {
            System.out.println("Blob does not exist: " + blobName);
        }
    }
}
