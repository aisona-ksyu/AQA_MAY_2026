package org.prog.session10.ngtests;

import org.prog.session9.PhoneBook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomePhoneTest {

    @Test
    public void PhoneBookFull() {
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

                Assert.assertFalse(phones.isEmpty());



        Assert.assertNotNull(contact1.getName());
        Assert.assertNotNull(contact1.getPhoneNumber());

        Assert.assertNotNull(contact2.getName());
        Assert.assertNotNull(contact2.getPhoneNumber());

        Assert.assertNotNull(contact3.getName());
        Assert.assertNotNull(contact3.getPhoneNumber());

        Assert.assertNotNull(contact4.getName());
        Assert.assertNotNull(contact4.getPhoneNumber());

        Assert.assertNotNull(contact5.getName());
        Assert.assertNotNull(contact5.getPhoneNumber());

        }


}
