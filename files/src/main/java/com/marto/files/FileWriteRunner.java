package com.marto.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

  public static void main(String[] args) throws IOException {
    Path pathFiletoWrite = Paths.get("./resources/file-write.txt");
    List<String> list = List.of("Apple", "Ball", "Cat", "Elephant");
    Files.write(pathFiletoWrite, list);
  }
}
