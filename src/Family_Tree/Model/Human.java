package Family_Tree.Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human extends Alive {
    private String name;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private List<Human> children = new ArrayList<>();
    private Human mather, father;

    public Human(){
        this.name = "No data available";
    }
    public Human(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;

        }
    public Human(String name, LocalDate birthDate, LocalDate deathDate, Gender gender) {
        this(name, birthDate, gender);
        this.deathDate = deathDate;
    }


    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
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

    public Gender getGender() {
        return gender;
    }


    public void setFather(Human father) {
        this.father = father;
    }
    public Human getFather() {
        return father;
    }
    public void setMather(Human mather) {
        this.mather = mather;
    }
    public Human getMather() {
        return mather;
    }

    public void addChild(Human child) {
        children.add(child);
    }
    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "\n Name: " + name + "\n" + "Gender: " + gender + " \n Date of Birth: " + birthDate  + "\n" + " Date of Death: " + deathDate + "\n"  + "Age: " + calculateAge(birthDate) +"\n" + "Mother: " + mather +"\n" + "Father: " + father +"\n";
    }
}
