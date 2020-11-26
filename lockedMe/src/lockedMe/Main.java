package lockedMe;

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

public class Main {
	
	static void listFile() {
		File dir = new File(".");
		File[] fileList = dir.listFiles();
		Arrays.sort(fileList);
		for (File file : fileList) {
			System.out.println(file);
		}
	}
	
	static class BusinessOperations{
		
		// add file method
		 static void addFile (String S) {
			System.out.println("We will create a file: " + S);
			
			try {
				File newFile = new File(S);
				
				if(newFile.createNewFile()) {
					System.out.println("File created: " + newFile.getName());
				} else {
					System.out.println("file already exist");
				}
			} catch(IOException e) {
				System.out.println("An error occured");
				System.out.println(e);
			}
			
		}
		 
		//delete file method
		 static void deleteFile(String S) {
			System.out.println("We will delete the file: "+ S);
				
			File newFile = new File(S);
				
			if(newFile.exists()) {
				if(newFile.delete()) {
					System.out.println("File deleted: " + newFile.getName());
				} else {
					System.out.println("failed to delete file");
					}
			} else {
				System.out.println("file doesn't exist");
				}
				
		}
		//search file method
		 static void searchFile(String S) {
			System.out.println("We will search for a file: "+ S);
					
			File newFile = new File(S);
			if(newFile.exists()) {
				System.out.println("the file "+ newFile.getName() +" is located at: " + newFile.getAbsolutePath());
						
			} else {
				System.out.println("file doesn't exist");
				}
		}
		 
		// main method for the business operations
		static void main(Scanner sc) {
			int choice = 0;
			do {
				
				String fileName = "";
				System.out.println("Welcome to business operation menu");
				System.out.println("***********************");
				System.out.println("to add a file, select 1");
				System.out.println("***********************");
				System.out.println("to remove a file, select 2");
				System.out.println("***********************");
				System.out.println("to search a file, select 3");
				System.out.println("***********************");
				System.out.println("to return to the main menu, select 4");
				System.out.println("***********************");
				System.out.println("***********************");
				System.out.println("Please enter your choice: ");
				choice = sc.nextInt();
				
				
				
				switch(choice) {
				
				case 1: 
					System.out.println("Please enter file name");
					fileName = sc.next();
					addFile(fileName);
					break;
				
				case 2: 
					System.out.println("Please enter file name");
					fileName = sc.next();deleteFile(fileName);
					break;
					
				case 3: 
					System.out.println("Please enter file name");
					fileName = sc.next();searchFile(fileName);
					break;
					
				case 4: System.out.println("You are redirected to the main menu");
					break;

				}
			} while(choice != 4 && choice >0);
			
			
		}
		
	}
	 
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		/*
		 Show the menu 
		 */
		do {
			System.out.println("Welcome to lockedme.com");
			System.out.println("****By Siriki Fofana****");
			System.out.println("***********************");
			System.out.println("to view all files, select 1");
			System.out.println("***********************");
			System.out.println("For the business operations menu, select 2");
			System.out.println("***********************");
			System.out.println("to quit the apllication, select 3");
			System.out.println("***********************");
			System.out.println("Please enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("list of all files");
				listFile();
				break;
			
			case 2: BusinessOperations.main(sc);
				break;
				
			case 3: System.out.println("Thank you,  goodbye");
				break;
				
			}
		} while(choice != 3);
		
		
		sc.close();
		
	}

}
