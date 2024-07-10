import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Input String : ");
        s = sc.nextLine();

        System.out.println("\nThe result : ");
        for(int i=0; i<s.length(); i++)
        {
            char ch  = s.charAt(i);
            String binaryString = Integer.toBinaryString(ch);
            String formattedBinary = String.format("%7s", binaryString).replace(' ', '0');
            System.out.printf("%c : %s \n",ch, formattedBinary);
        }
        System.out.println();
    }
}