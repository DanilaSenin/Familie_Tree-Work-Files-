package Family_Tree.Model.Person.Comparators;
import Family_Tree.Model.*;
import Family_Tree.Model.Service.Alive;

import java.util.Comparator;

public class ComparatorByAge <T extends Alive> implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            return Integer.compare(o1.getAge(), o2.getAge());

    }
}
