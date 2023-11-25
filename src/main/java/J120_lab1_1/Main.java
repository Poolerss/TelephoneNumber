package J120_lab1_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
       TelephoneNumber tel1 = new TelephoneNumber("990", "1028983");
       TelephoneNumber tel2 = new TelephoneNumber("1899", "562323");

        System.out.println("-------Реализация Map ассоциативного массива------------");
        Map<TelephoneNumber, String> contacts = new HashMap<>();
        contacts.put(tel1, "Oleg");
        contacts.put(tel2, "Semen");
        contacts.put(tel1,"Vasiliy");
        contacts.forEach((key, value) -> System.out.println("Имя: " + value + " Телефон: " + key));

        System.out.println("-------Реализация Set множества------------");
        Set <TelephoneNumber> contactsSet= new HashSet<>();
        contactsSet.add(tel1);
        contactsSet.add(tel2);
        contactsSet.add(tel1);
        contactsSet.forEach( telephoneNumber -> System.out.println("Телефон: " + telephoneNumber));
    }
}
