//github.com/A-MOHANRAJ
/*
public static Pattern compile(String regex)
Compiles the given regular expression into a pattern.
Parameters:
regex - The expression to be compiled
Throws:
PatternSyntaxException - If the expression's syntax is invalid

*/
// java8 | hackerRank| solution
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
       
		while(in.hasNextLine()){
			String pattern = in.nextLine();
          	//Write your code
              try{
               Pattern.compile(pattern);
              System.out.println("Valid");
              }catch(PatternSyntaxException t)
              {
                 System.out.println("Invalid"); 
              }      
		}
	}
}
