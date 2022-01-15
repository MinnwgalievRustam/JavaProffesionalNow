package basic_IO_NIO.task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("C:\\Users\\Rustam\\IdeaProjects\\JavaProffesional\\src\\main\\resources\\output.txt");

        for (int i = 0; i <= 20; i++) {
            int random = (int) (Math.round(Math.random() * 100));
            writer.write(random + "\n");
        }

        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Rustam\\IdeaProjects\\JavaProffesional\\src\\main\\resources\\output.txt"));
        String str;
        List<String> list = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        for (String s: list){
            integerList.add(Integer.valueOf(s));
        }

        Collections.sort(integerList);
        System.out.println(integerList);
    }
}