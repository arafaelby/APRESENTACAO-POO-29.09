package Encapsulamento;

public class MainPessoa {
    public static void main(String[] args){

        pessoa p = new pessoa();

        p.nome = "theves";
        p.idade = 19;
        p.setCpf("130.453.090-23");

        System.out.println("Nome do usuário: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println(p.getCpf());


    }
}
