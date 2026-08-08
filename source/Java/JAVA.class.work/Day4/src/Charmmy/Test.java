package Charmmy;

public class Test {
    public static void main(String[] args) {
        Animal monkey1 = new Animal("吉吉", 3, "Monkey", "Forest"){
            @Override
            public void eat() {
                IO.println("The " + getSpecies() + " is eating bananas.");
            }
            @Override
            public void makeSound() {
                IO.println("The " + getSpecies() + " says Ooh ooh ah ah");
            }
            @Override
            public void behavior() {
                IO.println("The " + getSpecies() + " is climbing a tree.");
            }
        };
        monkey1.displayInfo();
        monkey1.eat();
        monkey1.makeSound();
        monkey1.behavior();
    }
}
