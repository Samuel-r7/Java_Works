package programs_package;

import java.util.Scanner;
public class student_assessment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of subjects enrolled: ");
		int n = in.nextInt();
		System.out.println("Enter no of assessments: ");
		int a = in.nextInt();
		int arr[][] = new int[n][a];	
		
		
		for (int i=0; i<n;i++) {
			System.out.println("Subject " + (i+1) + ":");
			for(int j=0;j<a;j++){	
				System.out.println("   Enter total marks in assesment "+(j+1)+":");
				arr[i][j] = in.nextInt();
			}
		}
		
		for (int i=0; i<n;i++) {
			int sum_of_assesments = 0;
			for(int j=0;j<a;j++){
				sum_of_assesments = arr[i][j] + sum_of_assesments;
			}
			int avg = sum_of_assesments/a;
			System.out.println("Percentage in Subject" + (i+1) + ": " + avg + "%");	
		}
	}
}
