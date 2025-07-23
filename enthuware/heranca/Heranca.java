package enthuware.heranca;

public class Heranca {

    public static void main(String[] args) {

        var animal = new Animal();
        var cachorro = new Cachorro();

        animal.tipo();
        System.out.println("Idade: " + animal.idade);
        cachorro.tipo();
        System.out.println("Idade: " + cachorro.idade);
        animal = (Animal) cachorro;
        animal.tipo();
        System.out.println("Idade: " + animal.idade);

        System.out.println("-----------------------");

        Animal animal2 = new Cachorro();

        animal2.tipo();
        System.out.println("Idade: " + animal2.idade);

        System.out.println("-----------------------");
    }

}

class Animal {
    public int idade = 10;
    public void tipo() {
        System.out.println("Sou um animal");
    }
}

class Cachorro extends Animal {
    public int idade = 2;
    public void tipo() {
        System.out.println("Ja agora sou um cachorro");
    }
}
