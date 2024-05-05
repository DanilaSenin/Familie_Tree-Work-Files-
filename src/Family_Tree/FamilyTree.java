package Family_Tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree <E extends Alive> {
    private String name;
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

        public Integer getCntPerson() {
            return listOfCreatur.size();
        }

}
