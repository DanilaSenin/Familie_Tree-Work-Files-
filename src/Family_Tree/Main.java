package Family_Tree;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Название семьи (Фамилия)
        FamilyTree Family = new FamilyTree("Svers");
        FileManager fileManager = new FileManagerImpl();
        List<Human> humans = new ArrayList<>();

        String fileNameArchive = "FamilieArchive.txt";
        String fileContent = fileManager.readFromFile(fileNameArchive);
        String[] lines = fileContent.split("\n");
        for (String line : lines) {
            String[] data = line.split(",");
            if (data.length >= 3) {
                String name = data[0];
                LocalDate birthDate = LocalDate.parse(data[1]);
                Gender gender = Gender.valueOf(data[2]);

                if (data.length == 3) {
                    Human human = new Human(name, birthDate, gender);
                    humans.add(human);
                } else if (data.length == 4) {
                    LocalDate deathDate = LocalDate.parse(data[3]);
                    Human human = new Human(name, birthDate, deathDate, gender);
                    humans.add(human);
                }
            }
        }
        //System.out.println(humans);

        //Родители семьи
        /*Human human1 = new Human("Jon", LocalDate.of(1905, 11, 15), Gender.Man);
        Human human2 = new Human("Jane", LocalDate.of(1904, 12, 11), LocalDate.of(2022, 12,13), Gender.Woman);

        // Дети
        //Заносим детей в книгу
        Human human3 = new Human("Uil", LocalDate.of(1953, 8, 17), Gender.Man);
        Human human4 = new Human("Janin", LocalDate.of(1955, 5, 21), Gender.Woman);*/
        //Отмечаем родителей каждого ребёнка

        humans.get(2).setFather(humans.get(0));
        humans.get(2).setMather(humans.get(1));

        humans.get(3).setFather(humans.get(0));
        humans.get(3).setMather(humans.get(1));

        //Заносим к каждому родителю их детей
        humans.get(0).addChild(humans.get(2));
        humans.get(0).addChild(humans.get(3));

        humans.get(1).addChild(humans.get(2));
        humans.get(1).addChild(humans.get(3));


        Family.addPerson(humans.get(0));
        Family.addPerson(humans.get(1));
        Family.addPerson(humans.get(2));
        Family.addPerson(humans.get(3));


        String fileNameLibrary = "example.txt";

        String content = Family.getPersonInfo();
        fileManager.writeToFile(fileNameLibrary, content);

        //String readContent = fileManager.readFromFile(fileNameArchive);
        //System.out.println("Содержимое файла: " + readContent);
     //System.out.println(Family.getPersonInfo());
        //System.out.println(Family.getCntPerson());
    }
}
