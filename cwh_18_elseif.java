package Harrybaba;
import java.util.Scanner;
public class cwh_18_elseif {
	public static void main(String[] args) {
		// if else code
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age:");
		age=sc.nextInt();
		
		if (age>40) {
			System.out.println("you are more-adult");
		}
		else if(age>30) {
			System.out.println("you are adult");
		}
		
		else if(age>25) {
			System.out.println("you are a young");
		}
		else {
			System.out.println("You are teenages");
		}
		
	}
}
