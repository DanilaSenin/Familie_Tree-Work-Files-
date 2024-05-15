package Family_Tree.Presenter;


import Family_Tree.view.View;
import Family_Tree.Model.*;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private FamilyTree tree;
    private FileManagerImpl file;

    public Presenter(View view) {
        this.view = view;
        tree = new FamilyTree("Svan");
        file = new FileManagerImpl();
    }

    public void addPerson(String name, LocalDate DateOfBirthday, Gender gender, LocalDate DateOfDeath, String Mather, String Father) {
        Human human = new Human(name, DateOfBirthday, DateOfBirthday, gender, Mather, Father);
        tree.addPerson(human);
    }

    public void WriteToFile(String fileName, Object AliveObject) {
        file.writeToFile(fileName, AliveObject);
    }

    public String getInfo() {
        return tree.getPersonInfo();
    }
}
