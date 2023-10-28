package overrideequalsmethod;

public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }


    public boolean equals(Person person) {
        if (this == person) {
            return true;
        }

        if (person == null || getClass() != person.getClass()) {
            return false;
        }

        Person otherPerson = (Person) person;
        return this.name.equals(otherPerson.name);
    }

//    @Override
//    public boolean equals(Person p){
//
//        return this.name.equals(p.name);
//
//    }

    public static void main(String[] args) {
        Person p = new Person("akasha");


    }
}
