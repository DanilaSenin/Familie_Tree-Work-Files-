package Family_Tree.Model;

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

        public void AddToFile (String fileNameLibrary, String content)
        {
            fileManager.writeToFile(fileNameLibrary, content);
        }

        public Integer getCntPerson() {
            return listOfCreatur.size();
        }

}
