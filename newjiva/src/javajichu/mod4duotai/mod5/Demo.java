package javajichu.mod4duotai.mod5;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //animal.play();
        Cat cat = (Cat)animal;
        cat.play();

        if(animal instanceof Gog)
        {
            Gog dog = (Gog)animal;
            dog.play1();
        }

        if(animal instanceof Cat)
        {
            Cat catt = (Cat)animal;
            catt.play();
        }

        //Gog dog = (Gog) animal;
        //dog.play1();

    }
}
