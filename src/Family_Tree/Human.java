package Family_Tree;

import java.time.LocalDate;
import java.util.List;

public class Human {
    private String name, gender;
    private LocalDate birthDate, deathDate;
    private List<Human> children;
    private Human mather, father;
    private Integer Age;

    public Human(String name, LocalDate birthDate, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.mather = mather;
        this.father = father;
        }
    public Human(String name, LocalDate birthDate, LocalDate deathDate, String gender) {
        this(name, birthDate, gender);
        this.deathDate = deathDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void SjetAge() {
        if (this.deathDate != null) {
            this.Age = LocalDate.now().getYear() - this.birthDate.getYear();
        }
        else {
            this.Age = this.deathDate.getYear() - this.birthDate.getYear();
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Gender: " + gender + " \n Date of Birth: " + birthDate  + "\n" + " Date of Death: " + deathDate + "\n" +"\n" + "Age: " + Age;
    }
}
