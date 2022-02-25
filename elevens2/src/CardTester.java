
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card aceHearts1 = new Card("ace", "hearts", 1);
		Card kingSpades13 = new Card("king", "spades", 13);
		Card fourClubs4 = new Card("four", "clubs", 4);
		
		System.out.print(aceHearts1.matches(kingSpades13));
		
		System.out.print(aceHearts1);
		System.out.print(kingSpades13);
		System.out.print(fourClubs4);

	}
}
