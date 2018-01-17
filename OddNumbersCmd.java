/** 
  * The OddNumbersCmd class prints the first 100 odd whole numbers using a for loop. 
  * This class utilizes the main() method to carry out the arguments or statements. 
  * 
  * @author sapper 
  * email: email 
  * @version 1.0 
  * Created 15JAN2018 
  */ 

public class OddNumbersCmd {
	public static void main(String[] args) {
		int[] odds = new int[100];
		int i = 0;
		
		System.out.println("ODDS    COUNT");//header 
 		for(i=0; i<100; i++) { 
 			odds[i] = 2 * i + 1;//index i = an odd number 
 			//spaces to fit under header 
 			System.out.println(odds[i]+"        "+i); 
 		} 
	}
}