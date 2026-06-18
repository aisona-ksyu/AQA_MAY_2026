package org.prog.session9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    PhoneBook contact1 = new PhoneBook("Lucy", "055-999-88-55" );
    PhoneBook contact2 = new PhoneBook("Andi", "032-656-65-56");
     PhoneBook contact3 = new PhoneBook("David", "049-555-23-22");
        PhoneBook contact4 = new PhoneBook("David", "049-555-23-22");//повтор
        PhoneBook contact5 = new PhoneBook("Juliya", "017-555-97-89");


        Set<PhoneBook> motorolaContacts = new HashSet<>();
        motorolaContacts.add(contact1);
        motorolaContacts.add(contact2);

        Set<PhoneBook> iphoneContacts = new HashSet<>();
        iphoneContacts.add(contact3);
        iphoneContacts.add(contact4);
        iphoneContacts.add(contact5);

        Map<String, Set<PhoneBook>> phones = new HashMap<>();
        phones.put("Motorola", motorolaContacts);
        phones.put("iPhone", iphoneContacts);

        for (String phone : phones.keySet()) {
            System.out.println(phone);

            for (PhoneBook contact : phones.get(phone)) {
                System.out.println(contact);
            }
        }
    }
    }
