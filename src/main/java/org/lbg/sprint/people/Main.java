package org.lbg.sprint.people;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PersonController personController = new PersonController();
        String[] firstNames = {"John1", "John2", "John3"};
        String[] lastNames = {"Smith1", "Smith2", "Smith3"};
        int[] datesOfBirth = {19700101, 19700202, 19700303};

        ArrayList<Person> people = new ArrayList<>();

        personController.addPeople(people, firstNames, lastNames, datesOfBirth);
        personController.outputPeople(people);

        System.out.println("Number of people: " + Person.getCount());
    }
}
