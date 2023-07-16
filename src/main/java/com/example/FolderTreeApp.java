package com.example;

import java.io.File;

public class FolderTreeApp {

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        File folder = new File(currentDirectory);
        printFolderTree(folder, "");
    }

    public static void printFolderTree(File folder, String indentation) {
        if (folder.isDirectory()) {
            System.out.println(indentation + folder.getName());

            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        printFolderTree(file, indentation + " ");
                    } else {
                        System.out.println(indentation + " " + file.getName());
                    }
                }
            }
        } else {
            System.out.println(indentation + folder.getName());
        }
    }
}

