package com.makhov.exam.provider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileStorageProvider implements StorageProvider {
    private final Path filePath;

    public FileStorageProvider(String fileName) {
        this.filePath = Path.of(fileName);
    }

    @Override
    public void saveData(String data) {
        try {
            Files.writeString(filePath, data, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Data saved to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    @Override
    public String loadData() {
        try {
            String data = Files.readString(filePath);
            System.out.println("Data loaded from file: " + filePath);
            return data;
        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
            return null;
        }
    }
}
