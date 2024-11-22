package hust.soict.cybersec.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
	public static void main(String[] args) {
        String filename = "123.exe"; // Đường dẫn tới tệp cần đọc
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        
        try {
            // Đọc toàn bộ tệp vào mảng byte
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; // Nối chuỗi bằng toán tử +
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
