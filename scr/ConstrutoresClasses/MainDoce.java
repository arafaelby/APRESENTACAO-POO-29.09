package ConstrutoresClasses;

public class MainDoce {
        public static void main(String[] args) {
            Doce doce1 = new Doce();
            System.out.println(doce1.nome);
            System.out.println(doce1.quantidade);

            Doce doce2 = new Doce("Chocolate", 2);
            System.out.println(doce2.nome);
            System.out.println(doce2.quantidade);
            doce2.adicionarDoces(3);
            doce2.comerAteUm();
        }
    }

