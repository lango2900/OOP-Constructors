public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Rick",65,70); // requires a string, int, and double for attributes - passed through class
        Human human2 = new Human("Morty",16,50);

        System.out.println(human1.name);
        System.out.println(human2.age);

        human2.eat();
        human1.drink();

    }
}


// constructor - special method that is called when an object is created (instantiated)
// creates instance of a class for us without manually adding aspects