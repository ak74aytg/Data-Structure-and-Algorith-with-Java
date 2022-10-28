package Strings;

public class shortest_path {
    public static float Path(String path)
    {
        int y=0;
        int x=0;

        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N')
            {
                y++;
                continue;
            }
            if(path.charAt(i)=='E')
            {
                x++;
                continue;
            }
            if(path.charAt(i)=='W')
            {
                x--;
                continue;
            }
            if(path.charAt(i)=='S')
            {
                y--;
                continue;
            }


        }
        int sqr = (int)Math.pow(x, 2);
        int sqr2 = (int)Math.pow(y, 2);

        float shortest_distance = (float)Math.sqrt(sqr+sqr2);
        return shortest_distance;
    }
    public static void main(String[] args) {
        String path= "WNEENESENNN";
        System.out.println(Path(path));
    }
}
