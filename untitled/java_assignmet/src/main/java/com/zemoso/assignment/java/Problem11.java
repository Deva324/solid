package com.zemoso.assignment.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem11 {

    public static void main(String[] args) throws IOException {
        List<String> fileContent = readFile("C:\\Users\\Devendar Reddy\\Documents\\problem11\\readFile.txt");
        Map<Character, Integer> characterCountMap = countCharacters(fileContent);
        writeToFile(Paths.get("C:\\Users\\Devendar Reddy\\Documents\\problem11\\writeFile.txt"), characterCountMap.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue()).collect(Collectors.toList()));
    }

    static List<String> readFile(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Map<Character, Integer> countCharacters(List<String> lines) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        lines.stream().map(String::toLowerCase).forEach(line -> countCharacters(line, characterCountMap));
        return characterCountMap;
    }

    static void countCharacters(String line, Map<Character, Integer> characterCountMap) {
        for (char c : line.toCharArray()) {
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }
    }

    static void writeToFile(Path writePath, List<String> content) throws IOException {
        Files.write(writePath, content, StandardOpenOption.CREATE);
    }
}
