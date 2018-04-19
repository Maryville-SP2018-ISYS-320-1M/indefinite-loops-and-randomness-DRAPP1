/*
ISYS 320 DONE DONE DONE DONE DONE DONE DONE
	Name(s): Dave Rapp
	Date: 4-18-18
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 “zero,” “infinity,” and “unknown” are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: 9
 Expected output:(1 11 21 31 41 51 61 71 81 91)
 (b)
 Repeats: 0
 Expected output: nothing
 (c)
 Repeats: Not sure
 Expected output: Not sure
 (d)
 Repeats: nothing
 Expected output:nothing
   
 */

/*
 Was your prediction correct?
 
 (a) yes
 (b) yes
 (c) still not sure (maybe you meant for it to be an indefinite loop)
 (d) yes (I think haha)

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		String word = "a";
		while( word.length() < 10 ) {
		    word = "a" + word + "a";
		}
		
				
		System.out.println("ENDING LOOP TEST");
	}

}
