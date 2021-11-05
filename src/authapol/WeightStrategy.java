package authapol;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class WeightStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        Comparator<Person> byWeight = Comparator.comparing(Person::getWeight);
        Collections.sort(people, byWeight);
    }

}
