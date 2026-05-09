package util;

public class MainUtil {

    public static void menu(){
        System.out.println("Escolha a sua operação:");
        System.out.println("1 - Registrar cliente");
        System.out.println("2 - Registrar uma nova venda");
        System.out.println("3 - Consultar dados do cliente");
        System.out.println("4 - Sair");
    }

    public static void defaultWarning(){
        System.out.println("Enter a valid option!");
    }
}
