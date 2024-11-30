package com.makhov.exam.provider;

public interface StorageProvider {
    void saveData(String data);
    String loadData();
}
