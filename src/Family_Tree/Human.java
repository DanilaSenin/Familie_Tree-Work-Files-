package Family_Tree;

import java.time.LocalDate;
import java.util.List;

public class Human {
    private String name;
    private LocalDate birthDate, deathDate;
    private List<Human> children;
    private Gender gender;
    private Human mather, father;

    public Human(String name, LocalDate birthDate, Gender gender, Human mather, Human father) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.mather = mather;
        this.father = father;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price + "р.";
    }
}
