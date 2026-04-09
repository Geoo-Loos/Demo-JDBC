package aplication;

import java.util.Date;

import modelEntities.Department;
import modelEntities.Seller;

public class Program {
    public static void main(String[] args) {
        
        Department obj = new Department(1, "Books");

        Seller obj1 = new Seller(1, "Bob Brown", "bob@gmail.com", new Date(), 1000.0, obj);
        System.out.println(obj);
        System.out.println(obj1);

    }
}
