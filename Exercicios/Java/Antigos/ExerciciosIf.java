
public class ExerciciosIf {

	public static void main(String[] args) {
		int a = 16;
		int b = 17;
		int c = 12;
		
		if (a > b  && a > c) {
			System.out.println(a + " a maior numero");
			if (b < c) {
				System.out.println(b + " b Menor numero");
			} else {
				System.out.println(c + " c Menor numero");
			}
		} 
		else if (b > c){
			System.out.println(b + " maior numero b");
				if (c < a) {
					System.out.println(c + " c menor numero ");
				}else {
					System.out.println(a + " a menor numero ");
				}
		} 
		else {
			System.out.println(c + "  maior nuemro c");
			if (a < b) {
				System.out.println(a + " a menor numero");
			} else {
				System.out.println(b + " b menor numero");
			}
		}
		}
	}


