import java.util.Scanner;
public class Atividade_2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[4];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero");
            int numero = scanner.nextInt();
            numeros [i] = numero;
            if(numeros[i]%2 == 0){
                System.out.println("Numero par");
                int soma = 0;
                soma += numeros[i];
                System.out.println("A soma dos numeros pares é:" + soma);
            }
        }
    }
}
