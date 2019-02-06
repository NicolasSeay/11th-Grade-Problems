/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("Three", "Spades", 3);
		Card c2 = new Card("King", "Hearts", 10);
		Card c3 = new Card("Ace", "Clubs", 11);
		c1.toString();
		c2.toString();
		c3.toString();
	}
}
