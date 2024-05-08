package Family_Tree.view;
import Family_Tree.Model.Gender;
import Family_Tree.Presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }
    @Override
    public void Start() {
        System.out.println("Выберите действие из спписка: ");
        while (true) {
            System.out.println("1. Добавить нового члена");
            System.out.println("2. Занести в реестр");
            System.out.println("3. Закончить работу");
//Jon,1905-11-15,Man
            String line = scanner.nextLine();
        switch (line) {
            case "1":
                System.out.println("Укажите имя: ");
                String name = scanner.nextLine();
                System.out.println("Укажите дату рождения в формате gggg-mm-dd: ");
                LocalDate DB = LocalDate.parse(scanner.nextLine());
                System.out.println("Укажите пол (Man or Woman): ");
                Gender gender = Gender.valueOf(scanner.nextLine());
                System.out.println("Укажите дату смерти в формате gggg-mm-dd (при её отсутствии постувьте null): ");
                LocalDate DD = LocalDate.parse(scanner.nextLine());

                presenter.addPerson(name, DB, gender, DD);
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                System.out.println("Неопознанный запрос");
        }
        }
    }

    @Override
    public void PrintAnsver(String ansver) {
        System.out.println(ansver);
    }
}
