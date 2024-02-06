package Kapitel_9;
import java.io.File;
import java.util.Scanner;
import java.util.stream.Stream;

public class Uppgift9_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv: ");
        String text = in.nextLine();

        int tecken = text.length();
        System.out.println(tecken + "    ");

        Stream<String> rader = text.lines();
        System.out.println(rader);





    }
}
