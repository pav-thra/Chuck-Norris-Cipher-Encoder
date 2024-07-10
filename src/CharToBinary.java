public class CharToBinary
{
    public static String charToBinary(char ch)
    {
        String binaryString = Integer.toBinaryString(ch);
        String formattedBinary = String.format("%7s", binaryString).replace(' ', '0');
        return formattedBinary;
    }
}
