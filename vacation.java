package programs_package;
import java.io.*;
import java.util.Scanner;

public class Vacation {
	static String Place, Date;
	 static String[] activities;
	 static Double[] cost;
	 void PrintMethod()
	 {
	 Scanner in = new Scanner (System.in);
	 System.out.print ("Enter place:");
	 Place = in.next();
	 in.nextLine();
	 System.out.print("Enter date (DD/MM/YYYY): ");
	 Date= in.next();
	 in.nextLine();
	 System.out.print("Enter no. of activities:");
	 int n= in.nextInt();
	 activities = new String [n];
	 cost = new Double[n];
	 for (int i=0;i<n;i++)
	 {
	 System.out.print ("Enter activity-"+(i+1)+": ");
	 activities[i] = in.next();
	 in.nextLine();
	 System.out.print("Enter cost of activity: ");
	 cost[i] = in.nextDouble();
	 }
	 }
	 String getPlace()
	 {
	 return this.Place;
	 }
	 String getDate()
	 {
	 return this.Date;
	 }
	 String[] getact()
	 {
	 return this.activities;
	 }
	 Double [] getcost ()
	 {
	 return this.cost;
	 }
 }
	
