package test;

import beans.PersonaBeans;

public class Main {

    public static void main(String[] args) {

        PersonaBeans bean = new PersonaBeans();
        bean.setNombre("Carlito");
        bean.setEdad(30);
        
        System.out.println("bean = " + bean);
        
        PersonaBeans bean1 = new PersonaBeans("Fernando", 34);
        System.out.println("bean1 = " + bean1);

    }
    
}
