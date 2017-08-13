/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rrr101
 */
public class Card 
{
     public final static int SPADES = 0;     // Number Codes for different suits
     public final static int HEARTS = 1;
     public final static int DIAMONDS = 2;
     public final static int CLUBS = 3;
                            
    public final static int ACE = 1,        // Number codes for cards with
                            JACK = 10,      // names (Face cards and Ace). 
                            QUEEN = 10,     
                            KING = 10;
                            
     private final int value;  // The value of this card, from 1 to 11.
     private final int suit;   //Determines the Suit of the Card
                              // Spades, Hearts, Diamonds or Clubs
                              
   
                             
    public Card(int theValue, int theSuit) 
    {
        // Card constructor to create card with given value and suit
        
        value = theValue;
        suit = theSuit;
    }
    
    public int getValue() 
    {
        // Return the integer value of the card.
        return value;
    }
    
    public int getSuit() 
    {
        //Return integer code for Suit of the card    
        return suit;
    }
    
    
    
    public String getSuitAsString() 
    {
       // Return a String representing the card's suit.
       // If suit value is invalid, "Invalid Suit Code" is returned.
        
        switch ( suit ) 
        {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "Invalid Suit Code";
        }
    }
    
    public String getValueAsString() 
    {
       // Return Card's value as a String
       // If the card's value is invalid, "Invalid Value Code" is returned.
        
        switch ( value ) 
        {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
           default:  return "Invalid Value Code";
        }
    }
    
    

    public String toString() 
    {
           // Return a String representation of this card
      
        return getValueAsString() + " of " + getSuitAsString();
    }

}