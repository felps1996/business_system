package entities;

public class Client {
    public String nomeClient;
    public long cpf;
    public String email;
    public long data_nascimento;

    public void successRegister(){
        System.out.println("Cadastro Realizado!");
    }

    public String toString(){
        return String.format("Nome: %s %nCPF: %d %nData de Nascimento: %d %nEmail: %s %n", nomeClient, cpf, data_nascimento, email);
    }
}
