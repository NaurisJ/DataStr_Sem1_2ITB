package service;

import java.util.Arrays;

import datastr.MyList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList listforChar = new MyList(3);
		listforChar.add('a'); // a
		listforChar.add('b'); // a b
		listforChar.add('c'); // a b c
		listforChar.add('d'); // a b c d <- izpildot šo, vajadzētu palielināties sarakstam
		
		try {
			listforChar.print(); // a b c d
			listforChar.add('Z', 1); // a Z b c d
			listforChar.print();
			
			listforChar.del(0); // a tiek izdzests
			listforChar.print(); // Z b c d
			
			listforChar.add('c');
			System.out.println(listforChar.getPos(1)); // b
			System.out.println(Arrays.toString(listforChar.findCh('c'))); // [2,4]
			
			listforChar.sort();
			listforChar.print(); // b c c d Z
			
			listforChar.makeEmpty();
			listforChar.print(); // neka nebus

		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("---ADD t ----");
		listforChar.add('t');
		try
		{
			listforChar.print(); // t
		} catch (Exception e) {
			
		}
		
		
		
		MyList<Integer> listforInt = new MyList<Integer>(3);
		listforInt.add(2); 
		listforInt.add(4);
		listforInt.add(10); 
		listforInt.add(5); 
		
		try {
			listforInt.print(); 
			listforInt.add(100, 1); 
			listforInt.print();
			
			listforInt.del(0); 
			listforInt.print();
			
			listforInt.add(4);
			System.out.println(listforInt.getPos(1)); 
			System.out.println(Arrays.toString(listforInt.findCh(4))); 
			
			listforInt.sort();
			listforInt.print();
			
			listforInt.makeEmpty();
			listforInt.print(); // neka nebus

		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("---ADD 5 ----");
		listforInt.add(5);
		try
		{
			listforInt.print();
		} catch (Exception e) {
			
		}
		
		
		System.out.println("---------------------------------------------------");
		
		
		
		MyList<Student> studentList = new MyList<Student>(1);
		
		
		Student st1 = new Student();
		Student st2 = new Student("Janis","Berzins");
		Student st3 = new Student("Anna Paula","Jauka-Nejauka");
		
		studentList.add(st1);
		studentList.add(st2);
		
		try
		{
			studentList.print(); // Margarita Lopeza, Janis, Anna Paula
			studentList.add(st3,0);
			studentList.print();
			
			System.out.println(studentList.getPos(0)); // Anna Paula
			System.out.println(Arrays.toString(studentList.findCh(st2))); // Janis
			
			studentList.sort(); // bus problema
			studentList.print();
			
			studentList.del(1);
			studentList.print();
			
			studentList.makeEmpty();
			studentList.print();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("---ADD new student ----");
		studentList.add(new Student("Roberts", "Gudrais"));
		try
		{
			studentList.print();
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
