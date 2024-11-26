package hust.soict.cybersec.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "123.exe"; // Đường dẫn tới tệp cần đọc
        byte[] inputBytes = {};
        long startTime, endTime;

        try {
            // Đọc toàn bộ tệp vào mảng byte
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        startTime = System.currentTimeMillis();

        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b); // Sử dụng StringBuilder để nối chuỗi
        }

        String outputString = outputStringBuilder.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Execution time (NoGarbage): " + (endTime - startTime) + " ms");
    }
}