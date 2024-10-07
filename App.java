package Treino.JAVA;


import java.util.Scanner;

public class App {

    public static void main (String[]args){
        String password= "123456";
        System.out.println("Digite a sua senha: ");

        Scanner scanner= new Scanner(System.in);
        String pass= scanner.nextLine();
        System.out.println(password.equals(pass));
    }

}