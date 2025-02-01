package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите полный путь архива: ");
        String pathToArchive = reader.readLine();
        ZipFileManager fileManager = new ZipFileManager(Paths.get(pathToArchive));
        System.out.print("Введите путь к файлу: ");
        String pathToFile = reader.readLine();
        fileManager.createZip(Paths.get(pathToFile));
        ExitCommand command = new ExitCommand();
        command.execute();
    }
}
