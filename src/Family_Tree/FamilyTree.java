package Family_Tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private String name;
    private List<Human> listOfPeople;

        public FamilyTree(String name) {
            this.name = name;
            listOfPeople = new ArrayList<>();
        }

        public void addPerson(Human human){
            listOfPeople.add(human);
        }

        public String getPersonInfo(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Члены семьи:\n");
            for (Human human: listOfPeople){
                stringBuilder.append(human);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        }

}
