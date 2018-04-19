package main;

import java.util.Random;
import java.util.Scanner;

import rectangle.Rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle a= new Rectangle(1,2);
		Rectangle b= new Rectangle(3);
		Rectangle c=a;
		System.out.println(a+ "\n"+ b + "\n"+ c);
		
		a.setSides(4);
		System.out.println(a+ "\n"+ b + "\n"+ c);
		
		a=b;
	
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println( " \n"+ a.hasSameLenghtSidesAs(b));
		
		Random random= new Random();
		
		Rectangle[] rectangleArray= new Rectangle[10];
		for (int i = 0; i < 10; i++) {
			rectangleArray[i]= new Rectangle((Math.random()*8)+2 , (Math.random()*8)+2);
		}
		
		for (Rectangle rectangle : rectangleArray) {
			System.out.println(rectangle);
		}
		
		int max=0;
		for (int i = 1; i < rectangleArray.length; i++) {
			if (rectangleArray[max].getArea()<rectangleArray[i].getArea()) {
						max=i;
			}
		};
		System.out.println(rectangleArray[max]);
		int counter=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the parameters of the rectangle!");
		int sideOne=scanner.nextInt();
		int sideTwo=scanner.nextInt();
		Rectangle d= new Rectangle(sideOne, sideTwo);
		
		for (Rectangle rectangle : rectangleArray) {
			if (d.getArea()<rectangle.getArea()) {
				counter++;
			}
		}
		System.out.println("There are "+ counter+ " smaller rectangles");
			
		
		int matchingIndex=-1;
		for (int i = 0; i < rectangleArray.length; i++) {
			if (d.hasSameLenghtSidesAs(rectangleArray[i])) {
				matchingIndex=i;
			}
		}
		if (matchingIndex!=-1) {
			System.out.println(matchingIndex+". rectangle in the array has the same lenght of the sides as user's!");
		}
		else System.out.println("There is no matching rectangle!");
		
		
		
		
		
				
	}

}
