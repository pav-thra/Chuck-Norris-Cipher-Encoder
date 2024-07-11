import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        StringBuilder formattedBinary = new StringBuilder();
        StringBuilder encodedRes, decodedRes;

        while(true)
        {
            System.out.println("Enter your choice");
            System.out.println("1.Encode\n2.Decode\n3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch)
            {
                case 1:
                    System.out.println("Input String : ");
                    s = sc.nextLine();
                    for(int i=0; i<s.length(); i++)
                    {
                        formattedBinary.append(CharToBinary.charToBinary(s.charAt(i)));
                    }
                    System.out.println(formattedBinary);
                    encodedRes = ChuckNorrisUnaryCode.encoder(formattedBinary.toString());
                    System.out.println("Encoded result = "+encodedRes);
                    break;

                case 2:
                    System.out.println("Input String : ");
                    s = sc.nextLine();
                    decodedRes = ChuckNorrisUnaryCode.decoder(s);
                    System.out.println("Decoded result = "+decodedRes);
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct choice !!");
                    break;
            }
        }

    }
}