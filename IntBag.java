import java.util.ArrayList;
/*
 *@Author: Usama Ahmed
 *@Version: 13th February 2018
 *IntBag class
 */

public class IntBag
{
  //Properties
  int[] bag;
  int valid;
  
  //Constructors
 /*
  * @param none
  * assgins valid zero and initiates an Array with 100 elements
  */  
  public IntBag()
  {
    valid = 0;
    bag = new int[100];
  }
  
  /*
   * @param number of integers in the collection to be 2made
   * assgins valid zero and initiates array of the max no of elements input
   */
  public IntBag( int maxElements )
  {
    valid = 0;
    bag = new int[maxElements];
  }
  
  //Methods
  
  /*
   *@param value to add at the end of integer collection
   *@return void
   *adds a value at the end of integer collection in an array
   */
  public void addAtEnd( int value )
  {
    bag[valid] = value;
    valid++;
  }
  
  /*
   *adds a certain integer at a certain index position in the array and pushes the other elements in the array 1 position further
   * @param index location on which to a the value and the value itself
   * @return void
   */
  public void addAtIndex( int i, int value )
  {
    if( i <= valid - 1 )
    {
      for( int k = valid; k > i ; k-- ) 
      {
        bag[k] = bag[k-1];
      }
      bag[i] = value;
      valid++;
    }
  }
  
  /*
   *removes certain values at certain indexes in the array and pulls the elemnets ahead of it back
   * @param index location at which to remove the value
   * @return void
   */
  public void removeAtIndex( int i )
  {
    for( int j = i ; j < valid - 1 ; j++ ) 
    {
      bag[j] = bag [j+1];
    }
    valid--;
  }
  
  /*
   *@param value to be check with respect to the collection
   *@return boolean
   *This method check whether a collection contains a value or not
   */
  public boolean valueCheck( int value ) 
  {
    for ( int i = 0 ; i < valid - 1 ; i++ ) 
    { 
      if( value == bag[i] )
      {
        return true;
      }
    }
    return false;
  }
  
  /*
   *@param none
   *@return String
   *Default toString method
   */
  public String toString()
  {
    String collection = "";
    for( int i = 0 ; i < valid ; i++ )
    {
      collection = collection + "  " + bag[i];
    }
    return collection;
  }
  
  /*
   *@param none
   *@return the number of values in the Array
   *size method
   */
  public int size()
  {
    return valid - 1;
  }
  
  /*
   *@param index location at which to get the value of the element
   *@return the Integer element at the input location
   *get method to get values from the collection
   */
  public int get( int i ) 
  {
    return bag[i];
  }
  
  /*
   *@param the value to be found amongst the collection
   *@return the indexes of the value it is supposed to find
   *This method finds all instances of a given value in the collection 
   */
  public ArrayList<Integer> findAll( int value )
  {
    ArrayList<Integer> indexes = new ArrayList<Integer>();
    for( int i = 0 ; i < valid ; i++ )
    {
      if ( bag[i] == value )
      {
        indexes.add( i );
      }
    }
    return indexes;
  }
}
      
