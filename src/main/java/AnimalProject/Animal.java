package AnimalProject;

public class Animal {
    public String taxonomy;
    public boolean domesticated;
    public String countriesOfOrigin[];

    public String animalSound;

    public Animal(String taxonomy, String countriesOfOrigin[], boolean domesticated, String animalSound){ //constructor method to init obj
        this.taxonomy = taxonomy;
        this.countriesOfOrigin = countriesOfOrigin;
        this.domesticated = domesticated;
        this.animalSound = animalSound;
    }

    public void printAnimalSound(){
        System.out.println("The " + taxonomy + " makes this noise: " + animalSound );
    }

    public void printAnimalOrigin(){
        System.out.println("And originates from the following areas:");
        for (int i = 0; i < countriesOfOrigin.length; i++){
            System.out.println(countriesOfOrigin[i]);
        }

        }
}
