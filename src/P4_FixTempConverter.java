/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 Line 17  needed to be changed to double answer and on line 18 answer needed to be entered to correct the results. also had to change the return on the last line to get the correct answer. 
 line 22 had some edits also. 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		double answer = ftoc(tempf);
		System.out.println("Body temp in C is: " + answer);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf1) {
	      return (tempf1 - 32) * 5 / 9;
    }
}
