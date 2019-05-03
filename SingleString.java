/*
 Jerry Zhu
 April 11, 2019
 Ms. Krasteva
 This recursion problem takes a string as an input and reverses it.
 */

import java.util.Scanner;

public class SingleString
{
  //takes input and displays the reversed string
  public void display()
  {
    System.out.println("Please enter your string: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine(); //input
    
    System.out.println("Original String: " + input);
    System.out.println("Reversed String until the first period: " + reverse(input));
  }
  
  //The black box method that reverses the string
  private String reverse(String inpt)
  {
    if(inpt.indexOf(" ") < 0) //base case
      return "." + inpt.substring(0, inpt.indexOf("."));
    return reverse(inpt.substring(inpt.indexOf(" ")+ 1)) + " " + inpt.substring(0, inpt.indexOf(" ")); 
  }
  
  
  //main method
  public static void main(String[]args)
  {
    SingleString d = new SingleString();
    d.display();
  }
}