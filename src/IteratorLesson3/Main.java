package IteratorLesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        Pharmacy pharmacy2 = new Pharmacy();
        Pharmacy pharmacy3 = new Pharmacy();
        List<Pharmacy> result = new ArrayList<>();
        Set<Pharmacy> resultSet = new HashSet<>();
        pharmacy.addComponent(new Component("Peneciline", "0.6", 15))
                .addComponent(new Component("Water", "1.2", 4))
                .addComponent(new Component("Water", "0.5", 2));
        pharmacy2.addComponent(new Component("Peneciline", "0.6", 15))
                .addComponent(new Component("Water", "1.2", 4))
                .addComponent(new Component("Water", "0.5", 2));
        pharmacy3.addComponent(new Component("Peneciline", "0.2", 11))
                .addComponent(new Component("Water", "1.7", 3))
                .addComponent(new Component("Water", "0.25", 1));
//         while(pharmacy.hasNext()){
//            System.out.println(pharmacy.next());
//         }
        for (Component item: pharmacy) {
            System.out.println(item);
        }
        for (Component item: pharmacy2) {
            System.out.println(item);
        }
         result.add(pharmacy);
         result.add(pharmacy2);
         result.add(pharmacy3);
         System.out.println(result);
         Collections.sort(result);
         System.out.println(result);

         pharmacy3.ComparePh(pharmacy2);
         pharmacy2.ComparePh(pharmacy);
         System.out.println(pharmacy.hashCode());
         System.out.println(pharmacy2.hashCode());
         System.out.println(pharmacy3.hashCode());
         System.out.println(pharmacy2.equals(pharmacy3));
         System.out.println(pharmacy.equals(pharmacy2));
         pharmacy.name = pharmacy2.name;
         System.out.println("После выполения условия равенства имен получаем равенство Аптек:");
         System.out.println(pharmacy.equals(pharmacy2));
         System.out.println(pharmacy.hashCode());
         System.out.println(pharmacy2.hashCode());
         resultSet.add(pharmacy);
         resultSet.add(pharmacy2);
         resultSet.add(pharmacy3);
         System.out.println(" вывод множества Set():");
         System.out.println(resultSet);




    }
}
