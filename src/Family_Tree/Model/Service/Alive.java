package Family_Tree.Model.Service;

// Интерфейс для привязки живых существ к одному сообществу
// Чтобы нельзя было передавать остальные типы
public interface Alive<M> {
    int getAge();
    String getName();
}
