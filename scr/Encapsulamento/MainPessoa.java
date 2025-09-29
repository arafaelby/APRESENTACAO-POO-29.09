package Encapsulamento;

public class MainPessoa {
    public static void main(String[] args){

        pessoa pessoa1 = new pessoa();

        pessoa1.nome = "theves";
        pessoa1.idade = 19;
        pessoa1.setCpf("130.453.090-23");

        System.out.println("Nome do usuário: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println(pessoa1.getCpf());


    }
}
