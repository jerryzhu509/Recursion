/*
 Jerry Zhu
 April 11, 2019
 Ms. Krasteva
 This recursion problem takes an int as an input and reverses it.
 */

import java.util.*;

public class RevDigits
{
  //takes input and displays the reversed int
  public void display()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your integer: ");
    int input = scanner.nextInt(); //input
    
    System.out.println("Original integer: " + input);
    System.out.println("Reversed integer: " + revDigits(input));
  }
  
  //The black box method that reverses the int
  private int revDigits(int inpt)
  {
    if(inpt < 10)
      return inpt;
    return (inpt % 10) * (int) Math.pow(10, (int) Math.log10(inpt)) + revDigits(inpt/10);
  }
  
  
  //main method
  public static void main(String[]args)
  {
    RevDigits d = new RevDigits();
    d.display();
  }
}