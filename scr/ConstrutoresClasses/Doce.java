package ConstrutoresClasses;

public class Doce {
        String nome;
        int quantidade;

        public Doce(){
            this.nome = "null";
            this.quantidade = 0;
        }
        public Doce(String nome, int quantidade) {
            this.nome = nome;
            this.quantidade = quantidade;
        }

        public void adicionarDoces(int qtd) {
            System.out.println("Adicionando " + qtd + " doces:");
            for (int i = 1; i <= qtd; i++) {
                quantidade++;
                System.out.println("Doce adicionado. Total: " + quantidade);
            }
        }

        public void comerAteUm() {
            System.out.println("Comendo doces até sobrar só 1:");
            while (quantidade > 1) {
                quantidade--;
                System.out.println("Comi um doce. Restam: " + quantidade);
            }
            System.out.println("Sobrou apenas 1 doce!");
        }
    }

