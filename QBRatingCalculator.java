import java.util.Scanner;

public class QBRatingCalculator {
	public static void main(String[] args){
		float t; //TDs
		float y; //Yards
		float i; //Interceptions
		float c; //Completions
		float a; //Attempts
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your QB's stats. \n");
		System.out.print("# of Touchdowns:\n");
		t = (float)(scn.nextDouble());
		System.out.print("Yards Completed:\n");
		y = (float)(scn.nextDouble());
		System.out.print("# of Times Intercepted:\n");
		i = (float)(scn.nextDouble());
		System.out.print("# of Pass Completions:\n");
		c = (float)(scn.nextDouble());
		System.out.print("# of Attempts:\n");
		a = (float)(scn.nextDouble());
		QB plyr = new QB(t, y, i, c, a);
		System.out.print("QB Rating:\n" + plyr.getRating());
		scn.close();
	}
	
}
