package second_assignment;
import java.util.Scanner;

/* Read a sentence input
 * Read characters to delete
 * show the original sentence and the modifried sentence after deleting
 * 
 * it works as follows
 * give me a sentence "i'm very happy"
 * give me characters to delete "ap"
 * original sentence
 * modified sentence
 */

public class second_assingment {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		String str, str2, result;
		
		System.out.print("Please input sentence : ");
		str = scan.nextLine();
		
		System.out.print("Please input characters to delete : ");
		str2 = scan.next();
		
		result = str.replace(str2, "");
		System.out.println("original sentence : " + str);
		System.out.println("Modified sentence : " + result);
		
		scan.close();
	}
}
