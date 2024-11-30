package com.makhov.exam;

import com.makhov.exam.provider.CloudStorageAdapter;
import com.makhov.exam.provider.FileStorageProvider;
import com.makhov.exam.provider.StorageProvider;
import com.makhov.exam.service.CloudStorageService;


public class ExamApplication {
	public static void main(String[] args) {

// Робота з файловим сховищем
		StorageProvider fileStorage = new FileStorageProvider("data.txt");
		fileStorage.saveData("Hello from File Storage!");
		String fileData = fileStorage.loadData();
		System.out.println("File Storage Data: " + fileData);


// Робота з хмарним сховищем через адаптер
		CloudStorageService cloudStorageService = new CloudStorageService();
		StorageProvider cloudStorage = new CloudStorageAdapter(cloudStorageService);
		cloudStorage.saveData("Hello from Cloud Storage!");
		String cloudData = cloudStorage.loadData();
		System.out.println("Cloud Storage Data: " + cloudData);
	}
}

