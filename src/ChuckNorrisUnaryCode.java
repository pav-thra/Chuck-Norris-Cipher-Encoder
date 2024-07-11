public class ChuckNorrisUnaryCode
{
    public static StringBuilder encoder(String binary)
    {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<binary.length(); i++)
        {
            switch (binary.charAt(i))
            {
                case '0':
                    sb.append("00 ");
                    int j = i;
                    while(j<binary.length() && binary.charAt(j) == '0')
                    {
                        sb.append("0");
                        j+=1;
                    }
                    sb.append(" ");
                    i = j - 1;
                break;

                case'1':
                    sb.append("0 ");
                    int k = i;
                    while(k<binary.length() && binary.charAt(k) == '1')
                    {
                        sb.append("0");
                        k +=1;
                    }
                    sb.append(" ");
                    i = k - 1;
                break;
            }
        }
        return sb;
    }

    public static StringBuilder decoder(String cipher)
    {
        StringBuilder binary = new StringBuilder();
        String[] parts = cipher.split(" ");

        for (int i=0; i< parts.length; i+=2)
        {
            String prefix = parts[i];
            String zeros = parts[i + 1];

            switch(prefix)
            {
                case "00":
                    for (int j=0; j<zeros.length(); j++)
                    {
                        binary.append('0');
                    }
                break;

                case "0":
                    for (int j=0; j<zeros.length(); j++)
                    {
                        binary.append('1');
                    }
                break;
            }

        }

        StringBuilder plainText = new StringBuilder();
        for (int i=0; i<binary.length(); i+=7)
        {
            String byteString = binary.substring(i, i+7);
            int charCode = Integer.parseInt(byteString, 2);
            plainText.append((char) charCode);
        }
        return plainText;
    }
}
