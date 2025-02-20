package service;

import java.util.Arrays;

import datastr.MyList;

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
			listforChar.addSomewhere('Z', 1); // a Z b c d
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
		try
		{
			listforChar.print(); // t
		} catch (Exception e) {
			
		}
		

	}

}
