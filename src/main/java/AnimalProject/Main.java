package AnimalProject;

public class Main {
    public static void main(String[] args) {
        String kangarooOrigin[] = {"Australia", "New Zealand", "Americuh"};
        String catOrigin[] = {"Europe", "Americuh", "Bangladesh", "Turkey", "Japan"};
        String whaleOrigin[] = {"Atlantic Ocean", "Pacific Ocean", "Arctic Ocean", "Indian Ocean"};

        Animal kangaroo = new Animal("kangaroo", kangarooOrigin, false, "allo mate");
        Animal cat = new Animal("cat", catOrigin, true, "Meeeeeow");
        Animal whale = new Animal("orca", whaleOrigin, true, "MMMMMMMMMMMMMMmmmmmMMMmMmMmM"); //see SeaWorld for whale domestication : )

        kangaroo.printAnimalSound();
        kangaroo.printAnimalOrigin();
        cat.printAnimalSound();
        cat.printAnimalOrigin();
        whale.printAnimalSound();
        whale.printAnimalOrigin();





    }
}
