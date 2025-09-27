package Encapsulamento;

public class pessoa {

    // atributos da classe
    String nome; // <-- público por padrão (pode ser acessado direto, sem encapsulamento)
    int idade;// <-- público
    private String cpf; // <-- este está encapsulado porque é 'private'

    // Getter -> usado para LER o valor do atributo privado
    public String getCpf() {
        return cpf;
    }

    // Setter -> usado para DEFINIR/MODIFICAR o valor do atributo privado
    // Aqui no if acontece a validação: só aceita se estiver com 14 caracteres
    // Se a string passada não tiver 14 caracteres, não salva no atributo
    public void setCpf(String cpf){
        if (cpf.length() != 14){
                System.out.println("CPF INVALIDO");
            return;
        }

        this.cpf = cpf;
    }
}

