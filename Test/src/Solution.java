import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution
{
  private final static String PRINCESS = "p";
  private final static String BOT = "m";

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String grid[] = new String[n*n];
    for(int i = 0; i < n; i++) {
      grid[i] = in.next();
    }
    displayPathtoPrincess( n, grid );
//    displayPathtoPrincess( 3, new String[] {"---",
//                                            "-m-",
//                                            "p--"} );
  }

  private static void displayPathtoPrincess( final int n, final String[] array )
  {
    final String[][] grid = new String[n][n];
    for(int i=0; i<n; i++)
      grid[i] = array[i].split( "" );
    displayPathtoPrincess(n, grid);
  }

  private static void displayPathtoPrincess( final int n, final String[][] grid )
  {
    int[] princessPosition = getPositionOfCharacter( n, grid, PRINCESS );
    int[] botPosition = getPositionOfCharacter( n, grid, BOT );
    int[] positionDifference = positionToPrincess(princessPosition, botPosition);
    buildRoute(positionDifference);
  }

  private static void buildRoute(int[] positionDifference)
  {
    if(positionDifference[0] <= 0) {
      makeSteps(Math.abs(positionDifference[0]), Direction.UP);
    } else {
      makeSteps(Math.abs(positionDifference[0]), Direction.DOWN);
    }
    if(positionDifference[1] <= 0) {
      makeSteps(Math.abs(positionDifference[1]), Direction.LEFT);
    } else {
      makeSteps(Math.abs(positionDifference[1]), Direction.RIGHT);
    }
  }

  private static void makeSteps(final int numberOfSteps, final Direction direction)
  {
    IntStream.range( 0, numberOfSteps )
            .forEach( value -> outputStep(direction) );
  }

  private static void outputStep(final Direction direction)
  {
    System.out.println(direction.getMove());
  }

  private static int[] positionToPrincess(final int[] princessPosition, final int[] botPosition)
  {
    int verticalDif = princessPosition[0] - botPosition[0];
    int horizontalDif = princessPosition[1] - botPosition[1];
    return new int[]{verticalDif, horizontalDif};
  }

  private static int[] getPositionOfCharacter(final int n, final String[][] grid, final String character)
  {
    for(int row=0; row<grid.length; row++)
      for(int col=0; col<grid.length; col++)
        if(character.equals(grid[row][col]))
          return new int[]{row,col};
    return new int[]{0,0};
  }

  private enum Direction {
    UP("UP"),
    DOWN("DOWN"),
    LEFT("LEFT"),
    RIGHT("RIGHT");
    private final String move;

    Direction( final String move )
    {
      this.move = move;
    }

    public String getMove()
    {
      return move;
    }
  }
}
