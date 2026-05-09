package util;

import entities.Client;

import java.util.Scanner;

public class NewClient {

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
