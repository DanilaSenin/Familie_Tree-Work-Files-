package Family_Tree.Presenter;


import Family_Tree.Model.Person.Human;
import Family_Tree.Model.Service.Gender;
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

    public void addPerson(String name, LocalDate DateOfBirthday, Gender gender, LocalDate DateOfDeath, String Mather, String Father) {
        Human human = new Human(name, DateOfBirthday, DateOfBirthday, gender, Mather, Father);
        tree.addPerson(human);
    }

    public void WriteToFile(String fileName, Object AliveObject) {
        tree.AddToFile(fileName, AliveObject);
    }

    public void getInfo() {
        String info = tree.getPersonInfo();
        view.PrintAnsver(info);
    }

    public void SortByAge() {
        tree.SortByAge();
        getInfo();
    }

    public void SortByName() {
        tree.SortByName();
        getInfo();
    }
}
