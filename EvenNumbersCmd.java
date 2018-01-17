/** 
  * The EvenNumbersCmd class prints the first 100 even whole numbers using a while loop. 
  * This class utilizes the main() method to carry out the arguments or statements. 
  * 
  * @author sapper 
  * email: email 
  * @version 1.0 
  * Created 15JAN2018 
  */ 


public class EvenNumbersCmd {
	public static void main(String[] args) {
		int[] evens = new int[101];
		int n = 1; //offset of one for properly counting the even numbers.
		
		while (n<=100) {
			evens[n] = 2 * n; //index n = next even number
			System.out.println(evens[n]+"        "+n);
			n++;
		}
	}
}