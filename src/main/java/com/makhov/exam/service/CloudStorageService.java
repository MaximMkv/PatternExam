package com.makhov.exam.service;

import java.util.HashMap;
import java.util.Map;

public class CloudStorageService {
    private final Map<String, String> storage = new HashMap<>();
    private static final String DEFAULT_KEY = "data";

    public void upload(String data) {
        storage.put(DEFAULT_KEY, data);
        System.out.println("Data uploaded to cloud.");
    }

    public String download() {
        System.out.println("Data downloaded from cloud.");
        return storage.getOrDefault(DEFAULT_KEY, null);
    }
}
