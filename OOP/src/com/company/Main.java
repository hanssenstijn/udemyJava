package com.company;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",0.00,"Bob","Bob@gmail.com","06-123456789");
        Account stijnAccount = new Account();
        Account timAccount = new Account("Tim","Tim@gmail","12345");
        VipCustomer person1 = new VipCustomer();
        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        VipCustomer person3 = new VipCustomer("Tim",100.00,"tim@gmail.com");
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(0);

        

    }
}
