import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga uma palavra ou frase: ");
        String input = scanner.nextLine();

        int contador =0;

        for (int i = 0; i< input.length(); i++){
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A'){
                contador++;
            }
        }

    System.out.println("A quantidade de letras 'a' na string é: " + contador);
    scanner.close();
    }
}