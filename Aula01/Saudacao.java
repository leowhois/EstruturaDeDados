import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        /* Leitura de dado universal, pode ser utilizada varias vezes */

        System.out.print("Digite seu nome: "); // Entrada de texto
        String nome = entrada.nextLine(); // Utilização da variável ligando-a ao texto inserido
        System.out.println("Olá, " + nome + "!"); 
        /* Exibe a print com o nome inserido */
        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("Nome: %s. Idade: %d. ", nome, idade);
    }
}