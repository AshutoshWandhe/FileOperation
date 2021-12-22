package IO;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class MTransaction {
	String name;
	int id;
	String bc;
	int number;
	String C;
	int Salary;
	String date;
	
	public MTransaction(String name, int id, String bc, int number, String C, int Salary, String date) {
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
		
		return ;}
	public static void main(String[] agrs) {
		BankProb P1 = new BankProb("Anurag",1,"hdfc0000121",238578957,"INDIA",20000,"12-12-2021");
		BankProb P2 = new BankProb("Shreya",2,"hdfc0000121",238574444,"INDIA",20000,"12-12-2021");
		BankProb P3 = new BankProb("Jenipala",3,"hdfc0000121",238544447,"INDIA",30000,"12-12-2021");
		ArrayList<BankProb> A1 = new ArrayList<>();
		A1.add(P1);
		A1.add(P2);
		A1.add(P3);
		try {
			File T = new File("D:BankProb.txt");
			FileWriter TW = new FileWriter("D:BankProb.txt");
			
}
	
		
	}
}
