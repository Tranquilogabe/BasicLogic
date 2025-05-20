import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World ! ");

// HELLO WORLD
        Scanner entrada = new Scanner (System.in);
        System.out.print("Type a number: ");
        int numero = entrada.nextInt();

// NUMERO PAR OU IMPAR 
        if(numero % 2 == 0) {
            System.out.println("The number is even");
            } else {
                System.out.println("the number is odd");
            }
        
    
// contador, comumente se faz o uso da letra 'i' para definir a variavel 
        for(int z = 0; z <= 100; z += 10 ) {
                System.out.println(z);
        }


// somar de 1 ate a entrada do usuario 
        Scanner benga = new Scanner (System.in);
        System.out.println("Type a number: ");
        int UserNumber = benga.nextInt();

        int soma = 0;

        for (int i = 1; i <= UserNumber; i++){
            soma += i;
        }

        System.out.println("Soma de 1 ate " + UserNumber + " é:  " + soma);
        





// Tabuada do numero escolhido pelo usuario

        Scanner read = new Scanner(System.in);
        System.out.print("Type a number:  ");
        int numbero = read.nextInt();

        for (int z = 1; z <= 10; z++) {
            System.out.println(numbero + " x " + z + " = " + (numbero * z) );

        }

    // no caso do fatorial 

    int fatorial = 1;
    for(int f = 1; f <= numbero; f++){
        fatorial *=f;
    }

    System.out.println("Fatoriel de " + numbero + "é: " + fatorial);

read.close();


    }
}