package lab1.projeto3;

class Animal {

    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Som genérico de animal...");
        }
    }
}

class Cachorro extends Animal {

    @Override
    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Au au!");
        }
    }
}

class Gato extends Animal {

    @Override
    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Miau!");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.emitirSom(3);
        meuGato.emitirSom(5);
    }
}