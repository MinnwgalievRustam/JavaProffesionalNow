package basic_IO_NIO.additional_task;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Rustam\\IdeaProjects\\JavaProffesional\\src\\main\\resources\\test.txt")) {
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
