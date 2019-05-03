/*
 Jerry Zhu
 April 11, 2019
 Ms. Krasteva
 This recursion problem finds whether there is an exit to a 5x5 maze made by a 2D Array.
 */

public class Maze
{
  //displays whether there is a path
  public void display()
  {
    int[][] arr = {
      {0, 0, 0, 0, 1},
      {1, 1, 0, 0, 1},
      {0, 0, 1, 0, 1},
      {0, 1, 0, 0, 1},
      {1, 1, 0, 1, 1}};
    
    System.out.println(hasExit(arr));
  }
  
  //The black box method that tests for whether there is a path to exit
  private boolean hasExit(int[][]maze, int i, int j)
  {
    if (i < 0 || i > 4 || j < 0 || j > 4 || maze[i][j] == 1) 
      return false;
    else if ((i == 4 || j == 4) && maze[i][j] == 0) 
      return true;
    maze[i][j] = 1;
    return hasExit(maze, i + 1, j) || hasExit(maze, i - 1, j) || hasExit(maze, i, j + 1) || hasExit(maze, i, j - 1);
  }
  
  //The black box method that finds the entrances
  private boolean hasExit(int[][]maze)
  {
    return hasExit(maze, 0, 0) || hasExit(maze, 0, 1) || hasExit(maze, 0, 2) || hasExit(maze, 0, 3) || 
      hasExit(maze, 0, 4)|| hasExit(maze, 1, 0) || hasExit(maze, 2, 0) || hasExit(maze, 3, 0) || hasExit(maze, 4, 0);    
  }
  
//main method
  public static void main(String[]args)
  {
    Maze d = new Maze();
    d.display();
  }
}