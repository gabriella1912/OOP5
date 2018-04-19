package main;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Receiver;

import record.Record;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("How many records do you want?");
		Scanner scanner= new Scanner(System.in);
		int numberOfRecords= scanner.nextInt();
		
		Record[] recordArray= new Record[numberOfRecords];
		
		for (int i = 0; i < recordArray.length; i++) {
			System.out.println("Please enter the artist name, name of record and lenght of record!\n");
			System.out.println("1");
			String artistName=scanner.next();
			System.out.println("1");
			String nameOfRecord= scanner.next();
			System.out.println("1");
			int lenght=scanner.nextInt();
			recordArray[i]= new Record(artistName, nameOfRecord, lenght);
		}
		
		int max=0;
		 for (int i = 1; i < recordArray.length; i++) {
			if(recordArray[max].getLenght()<recordArray[0].getLenght()) {
				max=i;
			}
		}
		 System.out.println(recordArray[max]);
		 
		 System.out.println("Please enter an artist name!");
		 String artistName= scanner.next();
		
		 for (Record record : recordArray) {
			if (record.isFrom(artistName)) {
				System.out.println(record.getNameOfRecord());
			}
		}
	}

}
