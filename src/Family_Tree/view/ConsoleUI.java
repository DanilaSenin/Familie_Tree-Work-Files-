package Family_Tree.view;
import Family_Tree.Model.Service.Gender;
import Family_Tree.Presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

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
            System.out.println("2. Вывести древо");
            System.out.println("3. Отсортировать по имени");
            System.out.println("4. Отсортировать по возрасту");
            System.out.println("5. Закончить работу");
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
                System.out.println("Укажите дату смерти в формате gggg-mm-dd (при её отсутствии поставьте Null): ");
                String deathDateInput = scanner.nextLine();

                LocalDate DD = null;

                if (!deathDateInput.equalsIgnoreCase("Null")) {
                    try {
                        DD = LocalDate.parse(deathDateInput);
                    } catch (DateTimeParseException e) {
                        System.out.println("Некорректный формат даты смерти. Используйте формат gggg-mm-dd или введите 'Null'.");
                        continue; // Повторяем цикл, чтобы пользователь мог ввести корректную дату
                    }
                }

                System.out.println("Укажите имя матери (при её отсутствии поставьте null): ");
                String Mather = scanner.nextLine();
                System.out.println("Укажите имя отца (при его отсутствии поставьте null): ");
                String Father = scanner.nextLine();
                presenter.addPerson(name, DB, gender, DD, Mather, Father);
                break;
            case "2":
                presenter.getInfo();
                break;
            case "3":
                presenter.SortByName();
                break;
            case "4":
                presenter.SortByAge();
                break;
            case "5":
                finish();
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
    private void finish(){
        System.out.println("До свидания!");
        System.exit(0);
    }
}
