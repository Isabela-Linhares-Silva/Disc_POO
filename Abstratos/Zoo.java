package Abstratos;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();// nao pode ser animal pois é abstrato e não ha instanciação;
        animal1.emiteSom();

        Animal animal2 = new Gato();
        animal2.emiteSom();

        if (animal1 instanceof Cachorro) {// para saber se um objeto é uma instancia de alguma coisa ?
            System.out.println("Cachorro");
        }
        else
            System.out.println("Gato");
    }
}
