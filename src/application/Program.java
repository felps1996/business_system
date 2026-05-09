package application;
import entities.Client;
import util.NewClient;
import util.MainUtil;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean isRunning = false;
        int opt;

        Client client;
        client = new Client();

        while(!isRunning){

            MainUtil.menu();
            opt = sc.nextInt();

            if(opt == 4){
                isRunning = true;
            }else{
                switch(opt){
                    case 1:
                        NewClient.userName(sc, client);
                        NewClient.userId(sc, client);
                        NewClient.userBirth(sc, client);
                        NewClient.userEmail(sc, client);
                        client.successRegister();
                        break;
                    case 2:

                        break;
                    case 3:
                        client.consultClient();
                        break;

                    default:
                        MainUtil.defaultWarning();
                        break;
                }
            }

        }
        sc.close();
    }

}

// TO-DO:
//
// - Criar o construtor de Sells -> Feito
// - Criar métodos que recebem valores e atribuem aos parâmetros do construtor Sells e, em seguida, adiciona nos atributos da Classe Sells -> Em andamento
// - Criar os métodos acima fora da Main (Estudar uma forma de fazer isso mantendo o Clean Code e o fluxo correto dos métodos e do projeto) -> A fazer
// - Criar o método de armazenamento de vendas dentro da Classe Sells utilizando um tipo de id (CPF ou id) como identificador da compra (arrays) -> A fazer
// - Criar um método de consulta de dados sensíveis cadastrados dos clientes na classe Client (arrays) -> A fazer