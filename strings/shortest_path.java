package strings;

public class shortest_path {
    public static void main(String arg [])
    {
        String direction = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for(int i = 0 ; i<direction.length();i++)
        {
            char ch = direction.charAt(i);

            switch (ch) {
                case 'N':
                    x++;
                    break;
                
                case 'E':
                    y++;
                    break;

                 case 'W':
                    y--;
                    break;

                case 'S':
                    x--;
                    break;
                default:
                    break;
            }
        }
        
        double short_path = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println(short_path);
        
    }
}
