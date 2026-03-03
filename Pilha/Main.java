import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número decimal: ");
        int numero = entrada.nextInt();
        int numeroSalvo = numero;
        int resto;
        try {
            Pilha p = new Pilha(20);
            do {
                resto = numero % 2;
                p.push(resto);
                numero = numero/2;  
            }
            while (numero != 0); 
        
            System.out.printf("Total de elementos da pilha: %d\n", p.sizeElements());
            System.out.printf("O correspondente binário do valor %d é: ", numeroSalvo);
            while(!p.isEmpty()) {
                System.out.print(p.pop());
            }
        }
    }
}