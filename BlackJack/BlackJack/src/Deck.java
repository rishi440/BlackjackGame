
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Rishi Remesh Ranjini rrr101 
 * @class  CS 492
 * @Proj   Programming Assignment 1
 * 
 */
public class Deck 
{
  private final  LinkedList<Card> cardDeck; //Linked List of Cards
  
  private int numOfCards; //Number of cards currently in Deck
  
  public Deck()
  {
      cardDeck = new LinkedList<>();
      numOfCards = 0;
     
      for(int j = 0; j < 4; j++)
      {
         for(int k = 1; k <= 13; k++)
         {
               this.cardDeck.add(new Card(k,j));
         }
         
        numOfCards++ ;
         
      }
                
  }
  
  public void shuffle()
  {
      Collections.shuffle(this.cardDeck);
  }
  
  public int getNumberOfCards()
  {
      return numOfCards;
     
  }
  
  public void display()
  {
      for( Card c : cardDeck)
      {
         System.out.println(c.toString());
      }
      
  }
   
  public Card draw()
  {
      return cardDeck.pop();
      
  }
  
  
}