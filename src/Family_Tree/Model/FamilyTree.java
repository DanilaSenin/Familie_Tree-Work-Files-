package Family_Tree.Model;

import Family_Tree.Model.Person.Comparators.ComparatorByAge;
import Family_Tree.Model.Person.Comparators.ComparatorByName;
import Family_Tree.Model.Service.Alive;
import Family_Tree.Model.Service.FileManager;
import Family_Tree.Model.Service.FileManagerImpl;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree <E extends Alive> {
    public String name;
    FileManager fileManager = new FileManagerImpl();
    private List<E> listOfCreatur;

        public FamilyTree(String name) {
            this.name = name;
            listOfCreatur = new ArrayList<>();
        }

        public void addPerson(E human){
            listOfCreatur.add(human);
        }

        public String getPersonInfo(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Family:" + this.name + "\n");
            for (E human: listOfCreatur){
                stringBuilder.append(human);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        }

        public void AddToFile (String fileNameLibrary, Object content)
        {
            fileManager.writeToFile(fileNameLibrary, content);
        }

        public void SortByAge() {
            listOfCreatur.sort(new ComparatorByAge<>());
        }

        public void SortByName() {
            listOfCreatur.sort(new ComparatorByName<>());
        }

        public Integer getCntPerson() {
            return listOfCreatur.size();
        }

}
