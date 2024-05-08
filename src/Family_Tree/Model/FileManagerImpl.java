package Family_Tree.Model;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileManagerImpl implements FileManager {
    @Override
    //Метод записи в файл
    public void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString().trim();
    }
}
