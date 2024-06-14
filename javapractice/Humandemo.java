package javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Humandemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//create object from the class
		Human firstHuman = new Human();
		firstHuman.name = "Harsha";
		
		Human SecondHuman = new Human();
		SecondHuman.name = "Vardhan";
		
		//Create array of Human objects
		
		Human [] associates = new Human[5];
		
		associates[0]= firstHuman;
		associates[1]= SecondHuman;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int counter=2;counter<5;counter++)
		{
			System.out.println("Enter name");
			associates[counter]= new Human();
			
			associates[counter].name= br.readLine();
			
		}
		
		for(Human associate: associates) {
			
			System.out.println(associate.name);
			System.out.println("Hands:" +Human.hands);
			System.out.println("legs:" +Human.legs);
		}
	}

}
