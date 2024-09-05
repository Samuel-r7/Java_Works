package programs_package;

import java.util.Scanner;

public class Wordcheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] letarr = new char[10];
		String[] words = new String[10];
		for(int i=0;i<10;i++) {
		System.out.print("Enter letter-"+(i+1)+":");
		letarr[i]=in.next().charAt(0);
		in.nextLine();
		System.out.print("Enter word-"+(i+1)+":");
		words[i]=in.nextLine();
		}
		int found = 0;
		int count = 0;
		for(int i=0;i<10;i++) {
		for(int j=0;j<words[i].length();j++) {
		if(letarr[i] ==words[i].charAt(j)) {
		count+=1;
		found=1;
		}
		}
		System.out.println("No. of "+letarr[i]+"'s in word-"+(i+1)+":"+count);
		count=0;
		try {
		if(found == 0) {
		throw new LetterException();
		}
		}catch(LetterException e) {
		System.out.println("Letter not found!");
		System.out.println("Missing letter "+letarr[i]+" in word-"+(i+1));
		}
		found=0;
		}
		}
}
