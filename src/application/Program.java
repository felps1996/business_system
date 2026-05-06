package application;
import entities.Client;

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

            menu();
            opt = sc.nextInt();

            if(opt == 4){
                isRunning = true;
            }else{
                switch(opt){
                    case 1:
                        userName(sc, client);
                        userId(sc, client);
                        userBirth(sc, client);
                        userEmail(sc, client);
                        client.successRegister();
                        break;
                    case 2:

                        break;
                    case 3:
                        System.out.println(client.toString());
                        break;

                    default:
                        System.out.println("Enter a valid option!");
                        break;
                }
            }

        }
        sc.close();
    }

    public static void menu(){
        System.out.println("Escolha a sua operação:");
        System.out.println("1 - Registrar cliente");
        System.out.println("2 - Registrar uma nova venda");
        System.out.println("3 - Consultar dados do cliente");
        System.out.println("4 - Sair");
    }

    public static void userName(Scanner sc, Client client){
        System.out.print("Enter the client's name: ");
        client.nomeClient = sc.next();
    }

    public static void userId(Scanner sc, Client client){
        System.out.print("Enter the client's id: ");
        client.cpf = sc.nextLong();
    }

    public static void userBirth(Scanner sc, Client client){
        System.out.print("Enter the client's birth date: ");
        client.data_nascimento = sc.nextLong();
    }

    public static void userEmail(Scanner sc, Client client){
        System.out.print("Enter the client's email address: ");
        client.email = sc.next();
    }

}
