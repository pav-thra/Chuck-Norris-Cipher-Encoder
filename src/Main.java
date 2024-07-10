import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        StringBuilder formattedBinary = new StringBuilder();

        System.out.println("Input String : ");
        s = sc.nextLine();

        System.out.println("\nThe result : ");
        for(int i=0; i<s.length(); i++)
        {
            formattedBinary.append(CharToBinary.charToBinary(s.charAt(i)));
        }
        System.out.println(formattedBinary);
        StringBuilder encodedRes = ChuckNorrisUnaryCode.encoder(formattedBinary.toString());
        System.out.println(encodedRes);
    }
}