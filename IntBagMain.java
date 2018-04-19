import java.util.Scanner; 
import java.util.ArrayList;
/*
 *@Author: Usama Ahmed
 *@Version: 13th February 2018
 *To test and demonstrate IntBag class
 */

public class IntBagMain
{
  public static void main ( String []args )
  {
    Scanner scan = new Scanner(System.in);
    
    //Variables
    int input;
    int input2;
    int index;
    IntBag collection;
    boolean flag;
    boolean quitFlag;
    ArrayList<Integer> location;
    
    //Constants
    
    //Printing the menu
    location = new ArrayList<Integer>();
    collection = new IntBag();
    quitFlag = false;
    flag = false;
    while( !quitFlag )
    {
      System.out.println( "1.Create a new empty collection with a specified maximum capacity (any previous values are lost!)" );
      System.out.println( "2.Read a set of positive values into the collection (use a negative value to indicate all the values have been entered.)" );
      System.out.println( "3.Print the collection of values." );
      System.out.println( "4.Add a value to the collection of values at a specified location." );
      System.out.println( "5.Remove the value at a specified location from the collection of values." );
      System.out.println( "6.Read a single test value." );
      System.out.println( "7.Compute the set of locations of the test value within the collection." );
      System.out.println( "8.Print the set of locations." );
      System.out.println( "9.Quit the program." );
      System.out.print( "Please select an option from the menu below: " );
      //Taking input
      input = scan.nextInt();
      
      //Taking input regarding max capacity and creating an IntBag
      if( input == 1 )
      { 
        System.out.print( "Please specify the maximum capacity of the collection:" );
        input2 = scan.nextInt();  
        collection = new IntBag( input2 );
      }
      
      //Reading values into the intbag until a negative value is entered
      else if( input == 2 ) 
      {
        while(!flag)
        {
          input2 = scan.nextInt();
          if( input2 < 0 )
          {
            flag = true;
          }
          else 
          {
            collection.addAtEnd( input2 );
          }
        }
      }
      
      //Printing the collection if input 3rd option
      else if( input == 3 ) 
      {
        System.out.println();
        System.out.println();
        System.out.println( collection.toString() );
      }
      
      //Adding a value to certain in collection location if selected option 4
      else if( input == 4 )
      {
        System.out.println( "Enter the index at which you want to place the value:" );
        index = scan.nextInt();
        System.out.println( "Enter the value:" );
        input2 = scan.nextInt();
        collection.addAtIndex( index, input2 );
      }
      
      //Removing element from certain location if selected option 5
      else if( input == 5 )
      {
         System.out.print( "Enter the index at which you want to remove the element:" );
         input2 = scan.nextInt();
         collection.removeAtIndex( input2 );
      }
      
      //Reading a sigle value as input in the collection
      else if( input == 6 )
      {
        System.out.println( "Enter the Value:" );
        collection.addAtEnd( scan.nextInt() );
      }
      
      //Computing the locations of a value in the collection and saving it in a string
      
      else if( input == 7 )
      {
        
        System.out.println( "Enter the value you want to locate:" );
        
        location =  collection.findAll( scan.nextInt() );
      }
      
      //Printing the location/s of the values the user searched for if pressed 8
      else if( input == 8 )
      {
        System.out.println( location );
      }
      
      //Quitting the program if the user presses 9
      else if( input == 9 )
      {
        quitFlag = true;
      }
    }
  }
}