package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;

public class BankProb implements Serializable{
	String name;
	int id;
	String bc;
	int number;
	String C;
	int Salary;
	String date;
	
	public BankProb(String name, int id, String bc, int number, String C, int Salary, String date) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.bc = bc;
		this.number = number;
		this.C = C;
		this.Salary = Salary;
		this.date = date;
	}

	public void person() {
		System.out.println("name = "+name+"id = "+id+"bank code = "+bc+"number = "+number+"Country = "+C+"Salary"+Salary+"date = "+date);
	}
	
	public static void main(String[] agrs) {
		BankProb P1 = new BankProb("Anurag",1,"hdfc0000121",238578957,"INDIA",20000,"12-12-2021");
		BankProb P2 = new BankProb("Shreya",2,"hdfc0000121",238574444,"INDIA",20000,"12-12-2021");
		BankProb P3 = new BankProb("Jenipala",3,"hdfc0000121",238544447,"INDIA",30000,"12-12-2021");
		ArrayList<BankProb> A1 = new ArrayList<>();
		A1.add(P1);
		A1.add(P2);
		A1.add(P3);
		try {
			FileOutputStream F1 = new FileOutputStream("D:transactionD.txt") ;
			ObjectOutputStream F2  = new ObjectOutputStream(F1);
			F2.writeObject(A1);
			F1.flush();
			F1.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream F3 = new FileInputStream("D:transactionD.txt");
			ObjectInputStream F4 = new ObjectInputStream(F3);
			
			ArrayList<BankProb> A2 = (ArrayList<BankProb>)F4.readObject();
			F4.close();
			System.out.println(A2.toString());
		}catch(IOException | ClassNotFoundException e) {e.printStackTrace();
			
		}
		
	}}
		
	





	








