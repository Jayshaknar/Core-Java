package app;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import javax.naming.Name;

class Test {

	private String name;
	private int rollNo;
	private String Address;

	public Test(String name, int rollNo, String Adress) {
		this.name = name;
		this.rollNo = rollNo;
		this.Address = Adress;

	}

	public String getNmae() {
		return name;
	}

	public void setNmae(String nmae) {
		this.name = nmae;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  name +"," + rollNo +"," + Address;
	}

}

class NameComparatore implements Comparator<Test> {
	@Override
	public int compare(Test t1, Test t2) {
		String name1 = t1.getNmae();
		String name2 = t2.getNmae();
		return name1.compareTo(name2);

	}

}

public class MapDemo {
	public static void main(String[] args) {
		
		TreeSet<Test> set=new TreeSet<>(new NameComparatore());
		set.add(new Test("jay",10,"Bnagalore"));
		set.add(new Test("shankar",4,"Bihar"));
		set.add(new Test("prasad",35,"Karnataka"));
		set.add(new Test("akela",20,"Delhi"));
		for(Test t:set)
		{
			System.out.println(t);
		}
	}
}