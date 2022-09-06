public class rand
{
    public static void main( String args[] )
    {
        int min = 0;
        int max = 100;
//Generate random double value from 200 to 400
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);

    }
}
