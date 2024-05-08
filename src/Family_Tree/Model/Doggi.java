package Family_Tree.Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Doggi extends Alive {
    private String nickname, breed;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private List<Doggi> children = new ArrayList<>();
    private Doggi mather, father;

    public Doggi(){
        this.nickname = "No data available";
    }
    public Doggi(String name, LocalDate birthDate, Gender gender) {
        this.nickname = name;
        this.birthDate = birthDate;
        this.gender = gender;

    }
    public Doggi(String name, LocalDate birthDate, LocalDate deathDate, Gender gender) {
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

    public String getNickname() {
        return nickname;
    }

    public Gender getGender() {
        return gender;
    }


    public void setFather(Doggi father) {
        this.father = father;
    }
    public Doggi getFather() {
        return father;
    }
    public void setMather(Doggi mather) {
        this.mather = mather;
    }
    public Doggi getMather() {
        return mather;
    }

    public void addChild(Doggi child) {
        children.add(child);
    }
    public List<Doggi> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "\n Name: " + nickname + "\n" + "Gender: " + gender + " \n Date of Birth: " + birthDate  + "\n" + " Date of Death: " + deathDate + "\n"  + "Age: " + calculateAge(birthDate) +"\n" + "Mother: " + mather +"\n" + "Father: " + father +"\n";
    }
}
