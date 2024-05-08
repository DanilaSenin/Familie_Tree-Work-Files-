package Family_Tree.Presenter;


import Family_Tree.view.View;
import Family_Tree.Model.*;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private FamilyTree tree;

    public Presenter(View view) {
        this.view = view;
        tree = new FamilyTree("Svan");
    }

    public Human addPerson(String name, LocalDate DateOfBirthday, Gender gender, LocalDate DateOfDeath) {
        Human human = new Human(name, DateOfBirthday, DateOfBirthday, gender);
        return human;
    }
}
