package datastr;

public class MyList {

	//mainīgie
	private char[] list;
	private final int DEFAULT_SIZE = 7;
	private int size = DEFAULT_SIZE;
	private int counter = 0;
	
	//noklusētais konstruktors
	public MyList() {
		list = new char[size];
	}
	
	//argumenta konstruktors
	public MyList(int inputSize) {
		if(inputSize > 0) {
			size = inputSize;
		}
		list = new char[size];		
	}
	
	private boolean isFull() {
		//garais if pieraksts ar pārbaudi
		/*if(size == counter) {
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		//īsais if pieraksts ar pārbaudi
		//return (size == counter) ? true : false;
		
		//pavisam īsa forma, ja ir true vai false
		return (size == counter);
	}
	
	private boolean isEmpty()
	{
		//garais if pieraksts ar pārbaudi
		/*if(counter == 0) {
			return true;
		}
		else
		{
			return false;
		}*/
		
		//īsais if pieraksts ar pārbaudi
		//return (counter == 0) ? true : false;
		
		//pavisam īsa forma, ja ir true vai false
		return (counter == 0);
	}
	
	public int lenght()
	{
		return counter;
	}
	
	
	private void resize() {
		if(size < 100)
		{
			size = size * 2;
		}
		else
		{
			size = (int)(size * 1.5); //135.7 -> 135
		}
		
		char[] listNew = new char[size];
		
		for(int i = 0 ; i < counter; i++) {
			listNew[i] = list[i];	
		}
		
		list = listNew;
		
		System.gc();
		
		
			
	}
	
	public void add(char element) {
		if (isFull()) {
			resize();
		}
		list[counter++] = element;
	}
	
	public void addSomewhere(char element, int pos) throws Exception{
		if (pos < 0 || pos > counter) {
//			Exception myExc = new Exception("The index is not accepted");
			throw new Exception("The index is not accepted");
//			throw myExc;
		}
		if (isFull()) {
			resize();
		}
		
		for (int i = counter; i > pos; i++) {
			list[i] = list[i-1];
		}
		
		
		list[pos] = element;
		counter++;
		
	}
	
	//TODO
	// Izveidot funkcijas remove definiciju
	// parbaudit vai saraksts ir tukss un ja ir, metam iznemumu
	// parbaudit indeku. Pie nepareiza indeksa izmest iznemumu
	// izveidot for ciklu, ar kuru uzkope virsu dzesamajam elementam
	// pedejo elementu uzliek uz atstarpi (sis tiks mainits velak pie template)
	// jasamazina counter par vienu
	
	public void del(int pos) throws Exception{
		if (pos < 0 || pos > counter || isEmpty()) {

			throw new Exception("The index is not accepted");
		}
		
		for (int i = pos; i < counter; i++) {
			list[i] = list[i+1];
		}
		
		list[pos] = ' ';
		counter--;
		
	}
	
	public char getPos(int pos) throws Exception {
		if (pos < 0 || pos > counter || isEmpty()) {

			throw new Exception("The index is not accepted");
		}
		
		return list[pos];
	}
	
	public int[] findCh(char element) throws Exception {
		if (isEmpty()) {
			throw new Exception("The index is not accepted");
		}
		
		int howManySearched = 0;
		for (int i = 0; i < counter; i++) {
			if (list[i] == element) {
				howManySearched++;
				
			}
		}
		
		int[] indexes = new int[howManySearched];
		int counterForIndexes = 0;
		
		
		for(int i = 0; i < counter; i++) {
			if (list[i] == element) {
				indexes[counterForIndexes] = i;
				counterForIndexes++;
			}
		}
		
		
		return indexes;
	}
	
	
	// TODO Maja zpildit: Izveidot funkciju, kas ka argumentu sanem elementu un atgriez nakamo
	
	
	public void sort() {
		
		for (int i = 0; i < counter; i++) {
			for(int j = 0; j < counter; j++) {
				if (list[i] > list[j]) {
					swap(i,j);
				}
			}
		}
	}
	
	private void swap(int index1, int index2) {
		char temp = list[index1];
		list[index1] = list[index2];
		list[index2] = temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
