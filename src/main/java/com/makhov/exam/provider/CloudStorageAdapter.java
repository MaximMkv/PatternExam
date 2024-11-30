package com.makhov.exam.provider;

import com.makhov.exam.service.CloudStorageService;

public class CloudStorageAdapter implements StorageProvider {
    private final CloudStorageService cloudStorageService;

    public CloudStorageAdapter(CloudStorageService cloudStorageService) {
        this.cloudStorageService = cloudStorageService;
    }

    @Override
    public void saveData(String data) {
        cloudStorageService.upload(data);
    }

    @Override
    public String loadData() {
        return cloudStorageService.download();
    }
}
