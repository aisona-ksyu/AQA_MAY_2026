package org.prog.session2;

// TODO: replace all _ with . in this email: test_email_for_qa@gmail_com
// TODO: extract and print text between $: thisstringhas$some fragment$thathastobeextracted

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String em = "test_email_for_qa@gmail_com";
        System.out.println(em.replace("_", "."));

        String t = "thisstringhas$ some fragment$thathastobeextracted";
        System.out.println(t.indexOf("$"));
        if (t.contains("$")) {
            System.out.println(t.substring(t.indexOf("$")+ 1,
                    t.lastIndexOf("$")));
        }

        //        String s = "asd";
//        System.out.println(s.length());
//        System.out.println(s.equals("asd"));
//        System.out.println(s.equalsIgnoreCase("Asd"));
//        System.out.println(s.replace("a", "x"));
//        System.out.println("AAAAA".toLowerCase());
//        System.out.println("abcdefghijklmnopqrst".charAt(0));
//        String[] strings1 = "This string will be split into words".split(" ");
//        String[] strings2 = "This string will be split into words".split(" ", 3);
//        System.out.println(strings1.length);
//        System.out.println(strings2.length);
//        System.out.println("This string contains several i letters in different positions".indexOf("i"));
//        System.out.println("This string contains several i letters in different positions".lastIndexOf("i"));
//        System.out.println("This string contains several i letters in different positions".indexOf("i", 3));
//        System.out.println("This string contains several i letters in different positions".indexOf("tt"));
//        System.out.println("g".indexOf("a"));
//        System.out.println("bbVVVVbb".startsWith("bV"));
//        System.out.println("bbVVVVbb".endsWith("bb"));
//        System.out.println("       asldh          akjshd       ");
//        System.out.println("       asldh          akjshd       ".trim());
//        System.out.println("asdasd".concat("asldh").concat("asldh"));
//        System.out.println("Hello World".compareTo("Hello Worl"));
//        System.out.println("Hello World".compareTo("Hello World"));
//        System.out.println("Hello World".compareTo("Hello World!"));
//        System.out.println("Hello World".contains("o W "));
//        System.out.println(" ".isBlank());
//        System.out.println(" ".isEmpty());
//        System.out.println("a\na\na\n".lines().count());
//        System.out.println("ashdgjh\"agsjdg");
//        System.out.println("hhhh-".repeat(5));
//        System.out.println("This string will be substringed".substring(10));
//        System.out.println("This string will be substringed".substring(10, 20));



//        Random rand = new Random();
//        int i = rand.nextInt(11);
////        boolean b = true;
////        System.out.println("b: " + b);
////        System.out.println("!b: " + !b);
//
//        System.out.println("i: " + i);
//        System.out.println("i == 10 -> " + (i == 10));
//        System.out.println("i != 10 -> " + (i != 10));
//        System.out.println("i > 5 -> " + (i > 5));
//        System.out.println("i < 5 -> " + (i < 5));
//        System.out.println("i >= 5 -> " + (i >= 5));
//        System.out.println("i <= 5 -> " + (i <= 5));
//
//        if (i >= 8) {
//            System.out.println("i was greater or equal to 8");
//        }
//
//        if (i >= 4) {
//            System.out.println("i was greater or equal to 4");
//        }
//
//        if (i >= 2) {
//            System.out.println("i was greater or equal to 2");
//        } else {
//            System.out.println("i was NOT greater or equal to 2");
//        }
//
//        if (i == 1) {
//            System.out.println("i was 1");
//        } else if (i == 3) {
//            System.out.println("i was 3");
//        } else {
//            System.out.println("i was neither 1 or 3");
//        }
//
//        System.out.println("Done!");
//
   }

}
