/*
ISYS 320 DONE DONE DONE DONE DONE DONE
	Name(s): Dave Rapp
	Date: 4-18-18
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 “zero,” “infinity,” and “unknown” are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats:9
 Expected output:(1 11 21 31 41 51 61 71 81 91)
 (b)
 Repeats: infinite
 Expected output: not sure
 (c)
 Repeats: infinite
 Expected output:250
 (d)
 Repeats: 1
 Expected output: bbbbabbbb
   
 */

/*
 Was your prediction correct?
 
 (a) yes
 (b) yes
 (c) yes
 (d) yes

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		String word = "a";
		do {
		    word = "b" + word + "b";
		} while( word.length() < 10 );
		System.out.println( word );
		
				
		System.out.println("ENDING LOOP TEST");

	}

}
