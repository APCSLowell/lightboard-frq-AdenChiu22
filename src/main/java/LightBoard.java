public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
   lights = new Boolean[numCols][numRows];
    {
       /* to be implemented in part (a) */
    lights = new boolean[numRows][numCols];
    for(int r = 0; r < numRows; r++){
      for(int c = 0; c < numCols; c++){
        if(Math.random() < 0.4)
          lights[r][c] = true;
        else
          lights[r][c] = false;
      }
    }

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
 /* to be implemented in part (b) */
    int a = 0;
    for(int r = 0; r < getLights().length; r++)
      if(lights[r][col] == true)
        a++;
        
    if(lights[row][col] == true){
      if(a%2 == 0)
        return false;
      else
        return true;
    } else {
      if(a%3 == 0)
        return true;
      else
        return false;
    }
   
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
