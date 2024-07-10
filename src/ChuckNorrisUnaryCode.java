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
}
