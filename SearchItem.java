/*
 Jerry Zhu
 April 11, 2019
 Ms. Krasteva
 This recursion problem takes a Comparable array as input and searches for the existence of an element specified by the user.
 */

import java.util.*;

public class SearchItem
{
  //takes input and searches for the element
  public void display()
  {
    Scanner scanner = new Scanner(System.in);
    int num;
    String search;
    System.out.println("Please enter the number of elements: ");
    
    num = scanner.nextInt() + 1; //input
    
    Comparable[] array = new Comparable[num];
    
    System.out.println("Enter your element please: ");
    for(int i = 0; i < num; i++)
    {
      array[i] = scanner.nextLine();
    }
    
    System.out.println("Enter your what you'll search for please: ");
    search = scanner.nextLine();
    
    System.out.println("Is there a Comparable item? " + searchItem(search, array));
  }
  
  //The black box method that searches for the element
  private boolean searchItem(Comparable search, Comparable[] arr)
  {
    if (arr[0].equals(search)) 
      return true;
    else if (arr.length == 1) 
      return false;
    return searchItem(search, Arrays.copyOfRange(arr, 1, arr.length));
  }
  
  
//main method
  public static void main(String[]args)
  {
    SearchItem d = new SearchItem();
    d.display();
  }
}
