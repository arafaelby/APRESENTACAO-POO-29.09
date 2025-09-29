package Encapsulamento;

public class pessoa {


    String nome;
    int idade;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        if (cpf.length() != 14){
                System.out.println("CPF INVALIDO");
            return;
        }

        this.cpf = cpf;
    }
}

