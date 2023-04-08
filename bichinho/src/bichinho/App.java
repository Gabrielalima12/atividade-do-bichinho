package bichinho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int choice = 0;
        Animais a = new Animais();
        a.nascer();

        while(choice != 4) {

            System.out.println("Escolha um ação do seu bixinho: ");
            System.out.println("1. Comer\n2. Correr\n3. Dormir\n4. Sair do Programa");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    a.comer();
                    break;
                case 2:
                    a.correr();
                    break;
                case 3:
                    a.dormir();
                    break;
                case 4:
                    choice = 4;
                    break;
                default:
                    break;
            }

        }
    }
}
