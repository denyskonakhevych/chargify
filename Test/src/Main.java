public class Main {

    public static void main(String[] args) {
        StairCase(1);
    }

    static void StairCase(int n) {
        for( int i = 1; i <= n; i++ )
        {
            String step = produceSpaces( n - i ) + produceStair( i );
            System.out.println(step);
        }
    }

    private static String produceSpaces(int n)
    {
        final StringBuilder spacesBuilder = new StringBuilder( n );
        for(int i=0; i<n; i++)
            spacesBuilder.append( " " );
        return spacesBuilder.toString();
    }

    private static String produceStair(int n)
    {
        final StringBuilder spacesBuilder = new StringBuilder( n );
        for(int i=0; i<n; i++)
            spacesBuilder.append( "#" );
        return spacesBuilder.toString();
    }
}
