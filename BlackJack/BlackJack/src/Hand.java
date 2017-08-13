
import java.util.LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rrr101
 */
public class Hand 
{
    private LinkedList<Card> hand;
    private int handValue;
    private int count;
    
    public Hand()
    {
        hand = new LinkedList<>();
        handValue = 0;
        count = 0;  
        
        
    }
     
    public void addCard(Card c)
    {
        this.hand.add(c);
        
        handValue += c.getValue();
        count++;
        
    }
    
    public Card lastCard()
    {
        return hand.getLast();
    }
    
    public int getHandValue()
    {
        return handValue;
    }
    
    public int getNumberOfCards()
    {
        return count;
        
    }
     
        
        
    
    
    
    
}
