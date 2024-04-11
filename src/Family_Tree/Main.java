package Family_Tree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree vendingMachine = new FamilyTree("Arkan Second Tverd");

        Human human1 = new Human("Arkan Second Tverd", LocalDate.now(), "Man");
        Human human2 = new Human("Miram Second Tverd", LocalDate.of(1904, 12, 11), LocalDate.of(2022, 12,13), "Woman");

        vendingMachine.addPerson(human1);
        vendingMachine.addPerson(human2);

        System.out.println(vendingMachine.getPersonInfo());
    }
}
