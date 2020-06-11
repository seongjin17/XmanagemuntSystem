package character;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.Eventlogger;
public class MenuManager {
	static Eventlogger logger = new Eventlogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Charactermanager charactermanager = getObject("charactermanager.ser");
		
		if(charactermanager==null) {
			charactermanager = new Charactermanager(input);
		}
		else {
            charactermanager.setScanner(input);
        }
		WindowFrame frame = new WindowFrame(charactermanager);  
		seletMenu(input,charactermanager);
		putObject(charactermanager,"charactermanager.ser");
	}	
	public static void seletMenu(Scanner input,Charactermanager charactermanager) {
		int num = -1;
		while(num !=5) {
			try {				
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					charactermanager.addcharacter();
					logger.log("add a character");
					break;
				case 2:
					charactermanager.deletechatacter();
					logger.log("delete a character");
					break;
				case 3:
					charactermanager.editcharacter();
					logger.log("edit a character");
					break;
				case 4:
					charactermanager.viewcharacters();
					logger.log("view a character");
					break;
				default:
					continue;
				}	
			}	
			catch(InputMismatchException e) {
				System.out.println("Select an integer number between 1-5:");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;				
				
			}
			
		}
	}	
	
	public static void showMenu(){
		System.out.println("***Character Management System Menu***");
		System.out.println("1, Add character");
		System.out.println("2, Delete character");
		System.out.println("3, Edit character");
		System.out.println("4, View characters");
		System.out.println("5, Exit");
		System.out.println("Select one number between 1-5:");
	}
	public static Charactermanager getObject(String filename) {
		Charactermanager charactermanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			charactermanager = (Charactermanager) in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return charactermanager;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return charactermanager;
	}
	public static void putObject(Charactermanager charactermanager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(charactermanager);
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}	
	
	