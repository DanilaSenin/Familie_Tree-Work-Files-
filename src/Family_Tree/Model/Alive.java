package Family_Tree.Model;

// Интерфейс для привязки живых существ к одному сообществу
// Чтобы нельзя было передавать остальные типы
public class Alive <E> {
    void setFather(E father) {};
}
