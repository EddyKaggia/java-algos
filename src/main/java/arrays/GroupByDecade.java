package arrays;

import java.util.ArrayList;
import java.util.Arrays;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

public class GroupByDecade {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 5));
        people.add(new Person("Bob", 14));
        people.add(new Person("Charlie", 25));
        people.add(new Person("Daisy", 31));
        people.add(new Person("Eve", 22));
        people.add(new Person("Frank", 44));
        people.add(new Person("Grace", 37)); 

        int maxDecade = 10;

        ArrayList<Object> groups = new ArrayList<>();

        for(int i = 0; i < maxDecade; i++) {
            groups.add(new ArrayList<Person>());
            System.out.println(groups);
        }

        for (Person person: people) {
            int decadeIndex = person.age / 10;
            ArrayList<Person> decadeGroup = (ArrayList<Person>) groups.get(decadeIndex);
            decadeGroup.add(person);
        }

        for (int i = 0; i < groups.size(); i++) {
            ArrayList<Person> group = (ArrayList<Person>) groups.get(i);
            if (!group.isEmpty()) {
                System.out.println("Age " + (i * 10) + "–" + (i * 10 + 9) + ": " + group);
            }
        }
    }
}
