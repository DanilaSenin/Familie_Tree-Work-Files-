package Family_Tree.Model.Person.Comparators;

import Family_Tree.Model.Service.Alive;

import java.util.Comparator;

public class ComparatorByName <T extends Alive> implements Comparator<T> {
        @Override
        public int compare(T Person1, T Person2) {
            return Person1.getName().compareTo(Person2.getName());
        }
}
