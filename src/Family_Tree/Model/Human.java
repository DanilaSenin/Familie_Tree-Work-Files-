package Family_Tree.Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human extends Alive {
    private String name, matherName, fatherName;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private List<Human> children = new ArrayList<>();
    private List<Human> peaple = new ArrayList<>();
    private Human mather, father;

    //По умолчанию нет информации о человеке
    public Human(){
        this.name = "No data available";
    }

    //Известно только имя
    public Human(String name) {
        this.name = name;
    }
    //Известно всё, человек ещё жив
    public Human(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;

        }

    //Известно всё, человек умер
    public Human(String name, LocalDate birthDate, LocalDate deathDate, Gender gender) {
        this(name, birthDate, gender);
        this.deathDate = deathDate;
    }
    public Human(String name, LocalDate birthDate, LocalDate deathDate, Gender gender, String Mather, String Father) {
        this(name, birthDate, gender);
        this.deathDate = deathDate;
        this.matherName = Mather;
        this.fatherName = Father;
    }


    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public String setName(){return name;}
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

    public void addHuman(Human human) {peaple.add(human);}

    @Override
    public String toString() {
        return "\n Name: " + name + "\n" + "Gender: " + gender + " \n Date of Birth: " + birthDate  + "\n" + " Date of Death: " + deathDate + "\n"  + "Age: " + calculateAge(birthDate) +"\n" + "Mother: " + matherName +"\n" + "Father: " + fatherName +"\n";
    }
}
