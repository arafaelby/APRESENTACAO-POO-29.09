package Funcoes;

public class MainAnimal {
    public static void main(String[] args){
        Animal Papagaio = new Animal();
        Papagaio.nome = "José";
        Papagaio.comer();
        System.out.println(Papagaio.falar());
    }
}
