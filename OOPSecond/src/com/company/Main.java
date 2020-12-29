package com.company;

class Car4 {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car4(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEninge() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubish extends Car4 {
    public Mitsubish(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEninge() {
        return "Mitsubish -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubish -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubish -> brake()";
    }


    class Movie {
        private String name;

        public Movie(String name) {
            this.name = name;
        }

        public String plot() {
            return "No plot here";
        }

        public String getName() {
            return name;
        }
    }

    class Jaws extends Movie {
        public Jaws() {
            super("Jaws");
        }

        public String plot() {
            return "A shark eats people";
        }
    }

    class IndependenceDay extends Movie {
        public IndependenceDay() {
            super("Independence day");
        }

        @Override
        public String plot() {
            return "Aliens attempt to take over";
        }
    }

    class Forgetable extends Movie {
        public Forgetable() {
            super("Forgetable");
        }
        // No plot method
    }
}

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        Account bobsAccount = new Account();

        System.out.println("Bob's constructor amount: $" + bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("tim", "@tim", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100, "@tim.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Animal animal = new Animal("tim", 1, 1, 5, 5);

        Dog dog = new Dog("York", 8, 20, 2, 4, 1, 20, "Long");
        dog.eat();
        dog.walk();
        dog.run();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27 inch", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ", "Asus", 5, 7, "V2.4");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Wall2 wall1 = new Wall2("west");
        Wall2 wall2 = new Wall2("east");
        Wall2 wall3 = new Wall2("north");
        Wall2 wall4 = new Wall2("south");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tim", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

        Player player = new Player();
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHitPoints());

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count " + printer.getPagePrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagePrinted());

        Car4 car4 = new Car4(8,"Base care");
        System.out.println(car4.startEninge());
        System.out.println(car4.accelerate());
        System.out.println(car4.brake());

        Mitsubish mitsubish = new Mitsubish(6,"Outlander VRW 4WD");
        System.out.println(mitsubish.startEninge());
        System.out.println(mitsubish.accelerate());
        System.out.println(mitsubish.brake());

        Hamburger hamburger = new Hamburger("basic","sausage",3.56,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("cheese",1.15);
        System.out.println("Total burger price is $" + hamburger.itemizeHamburger());

    }
}
