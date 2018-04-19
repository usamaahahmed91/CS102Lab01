/*
 *@Author: Usama Ahmed
 *@Version: 13th February 2018
 *To test and demonstrate IntBag class
 */

public class PrimeNumbers
{
  public static void main ( String []args )
  {
    //Variables
    int count;
    int noOfDivisors;
    int number;
    IntBag primeNo;
    boolean prime;
    
    //Constants
    
    //ProgramCode
    count = 1;
    number = 2;
    noOfDivisors = 0;
    primeNo = new IntBag();
    primeNo.addAtEnd( 2 );
   
//    //Loop to ensure that the program finds and adds all 100 first prime numbers to the Array in IntBag object
//    while ( count < 100 )
//    {
//      //Loop to divide the number by every number smaller than itself until 1
//      for ( int i = number ; i >= 1 ; i-- )
//      {
//        if ( number % i == 0 ) 
//        {
//          noOfDivisors++;
//        }
//      }
//      //If this condition is fullfilled then the number is a prime no because it will show that the number is divisible only by itself and one
//      if ( noOfDivisors == 2 )
//      {
//        primeNo.addAtEnd( number );
//        count++;
//      }
//      noOfDivisors = 0;
//      number++;
//    }
    //EDITED MORE EFFICIENT WAY
    while ( count < 100 )
    {
      prime = true; 
      for( int i = 0 ; i < count ; i++ )
      {
        if ( number % primeNo.get( i ) == 0 )
        {
          prime = false;
        }
      }
      if( prime )
      {
        primeNo.addAtEnd( number );
        count++;
      }
      number++;
    }
      //Printing the prime no array
      System.out.println( primeNo.toString() );
  }
}

