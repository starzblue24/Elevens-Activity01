/**
 * This is a class that tests the Card class.
 */
public class CardTester {
  
  /**
   * The main method in this class checks the Card operations for consistency.
   * @param args is not used.
   */
  public static void main(String[] args) {
    Card card1 = new Card("Ace", "Clubs", 1);
    Card card2 = new Card("King", "Spade", 13);
    Card card3 = new Card("Queen", "Hearts", 12);
    System.out.println(card2.matches(card1));
    System.out.print(card1.toString());
    
    /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
  }
}
