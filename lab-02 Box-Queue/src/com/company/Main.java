package com.company;

public class Main {

    public static void main(String[] args) {
        Box b1 = new Box(1,2,3);
        System.out.println("Aria= "+b1.getA());
        System.out.println("<-------Queue------->");
        Queue_1 list1 = new Queue_1();
        list1.adauga(1);
        list1.adauga(2);
        list1.adauga(3);
        list1.adauga(4);
        list1.delete();
        list1.print_list();
        list1.veri();
    }

}

