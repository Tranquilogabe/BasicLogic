import java.util.Scanner;

public class Exercices {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        System.out.println("Type a number bagual: ");
        int UserNumber = leitor.nextInt();

        

       for(int i = 1; i<=UserNumber ; i+=2){

        System.out.println(i);

       };



    }
}
