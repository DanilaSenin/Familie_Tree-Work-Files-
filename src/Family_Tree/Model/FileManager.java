package Family_Tree.Model;

public interface FileManager <E> {
    //Метод, принимающий название файла и содержание
    void writeToFile(String fileName, E AliveObject);
    //Поле, берущее значение из файла
    String readFromFile(String fileName);
}
