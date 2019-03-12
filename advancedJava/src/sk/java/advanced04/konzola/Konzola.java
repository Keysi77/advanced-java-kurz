package sk.java.advanced04.konzola;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Konzola {
    public static void main(String[] args) {
//        classic(); // klasicke vypisovanie cez Buffer ale potrebny try catch
        jdk1_5(); // java 5 jednoduchsie vypisovanie cez Scanner, nepotrebuje bloky try catch
//        jdk1_6(); // java 6
    }
    private static void classic() {
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.print("Enter something : ");
                String input = br.readLine(); // input ktory napisem do konzoly

                if ("q".equals(input)) { // ak je input 'q' tak ukoncim program
                    System.out.println("Exit!");
                    System.exit(0);
                }

                System.out.println("input : " + input);
                System.out.println("-----------\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
// pouzitie v jave 5
    private static void jdk1_5() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter something : ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

        scanner.close();

    }
    private static void jdk1_6() {
        while (true) {
            System.out.print("Enter something : ");
            String input = System.console().readLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                System.exit(0);
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

    }

}
