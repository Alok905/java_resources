import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("num = " + num + "\n");
        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String line = bf.readLine();
        System.out.println("line = " + line + "\n");

        System.out.print("Enter a number: ");
        int val = Integer.parseInt(bf.readLine());
        System.out.println("val = " + val + "\n");

        BufferedReader bf2 = new BufferedReader(new FileReader("./test.txt"));
        System.out.println("Reading a file....");
        String fileLine = bf2.readLine();
        while (fileLine != null) {
            System.out.println("fileLine = " + fileLine);
            fileLine = bf2.readLine();
        }

        bf.close();
        bf2.close();
    }
}
