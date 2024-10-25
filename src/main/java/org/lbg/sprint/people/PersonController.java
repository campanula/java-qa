package org.lbg.sprint.people;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PersonController {

    public void addPeople(ArrayList<Person> people, String[] firstNames, String[] lastNames, int[] datesofBirth) {
        for (int i = 0; i < firstNames.length; i++) {
            people.add(new Person(firstNames[i], lastNames[i], datesofBirth[i]));
        }
    }

    public void outputPeople(ArrayList<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println("First Name: " + people.get(i).getFirstName());
            System.out.println("Last Name: " + people.get(i).getLastName());

            String dobString = String.valueOf(people.get(i).getDateOfBirth());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate date = LocalDate.parse(dobString, formatter);

            System.out.println("Date of Birth: " + date);
            System.out.println("----");
        }
    }
}
