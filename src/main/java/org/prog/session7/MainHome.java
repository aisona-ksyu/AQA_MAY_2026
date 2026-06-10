package org.prog.session7;

public class MainHome {

   public static void main(String[] args) {

      Phone phone1 = new Android("Samsung S24 Ultra", "Purple");
      Phone phone2 = new Apple("Iphone 17Pro Max", "White");
      Phone phone3 = new Android("Samsung S24 Ultra", "Purple");
      Phone phone4 = new Apple("Iphone 17Pro Max", "White");

      phone1.unlock();
      phone2.unlock();


      phone1.call("099-559-45-35");
      phone2.call("066-498-32-11");


      System.out.println("Comparison of Android phones");
      System.out.println(phone1.equals(phone3));
      System.out.println(phone1.hashCode());
      System.out.println(phone3.hashCode());

      System.out.println("Comparison of Android and Apple phones");
      System.out.println(phone1.equals(phone2));
      System.out.println(phone1.hashCode());
      System.out.println(phone2.hashCode());

      System.out.println("Comparison of Apple phones");
      System.out.println(phone2.equals(phone4));
      System.out.println(phone2.hashCode());
      System.out.println(phone4.hashCode());

   }
}