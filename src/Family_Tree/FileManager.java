package Family_Tree;

public interface FileManager {
    //Метод, принимающий название файла и содержание
    void writeToFile(String fileName, String content);
    //Поле, берущее значение из файла
    String readFromFile(String fileName);
}
