package JavaBase.day06.testPolymorphic3;

public class TestPolymorphic {
    public static void main(String[] args) {
        useDog(new Dog());
        useCat(new Cat());
        // Animal a = new Dog();
        // Animal b = new Cat();
        // a.eat();
        // b.eat();
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    private static void useAnimal(Animal a) {
        a.eat();
        // a.watchHome(); ClassCastException
        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.watchHome();
        }
    }

    private static void useCat(Cat cat) {
        cat.eat();
    }

    public static void useDog(Dog dog) {
        dog.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome() {
        System.out.println("看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}