package MainPackage;
//Creating a class called MyInteger
public class MyInteger {
	//Int data field that stores the int value
	private int value;
	MyInteger integer2 = new MyInteger(2);
	// A constructor creating a MyInteger object for int value
	public MyInteger(int value) {
		super();
		this.value = value;
	}
	//A get method for in value
	public int getValue() {
		return value;
	}
	//Methods that return true if value is even, odd, or prime
	public boolean isEven(){
		return(value % 2 == 0);

	}
	public boolean isOdd(){
		return(value % 2 != 0);
	}
	public boolean isPrime(){
		for(int g = 2; g < value; g++){
			if(value % g==0)
				return false;}
		return true;
	}
	//Static methods that return true if value is even, odd, or prime			
	public static boolean isEven(int v){
		return(v % 2 == 0);
	}
	public static boolean isOdd(int v){
		return(v % 2 != 0);
	}
	public static boolean isPrime(int v){
		for(int g = 2; g < v; g++){
			if(v % g==0)
				return false;}
		return true;
	}
	//Static methods that return true if value is even, odd, or prime
	public static boolean isEven(MyInteger value){
		return(value.getValue()%2 == 0);
	}
	public static boolean isOdd(MyInteger value){
		return(value.getValue()%2 != 0);
	}
	public static boolean isPrime(MyInteger value){
		for(int g = 2; g < value.getValue(); g++){
			if(value.getValue() % g == 0)
				return false;}
		return true;
	}
	//Methods that return true if value in object is equal to value
	public boolean equals(int v){
		return(value == v);
	}
	public boolean equals(MyInteger v){
		return(value == v.getValue());
	}
	// A static method that converts an array of numeric characters to an int value
	public static int parseInt(char[] value){
		int n = 0;
		for(int g = 0; g < value.length; g++)
			n = n*10 + (value[g]-'0');
		return n;
	}
	// A static method that converts a string to an int value
	public static int parseInt(String value){
		int n = 0;
		for(int g = 0; g < value.length(); g++)
			n = n*10 + (value.charAt(g)-'0');
		return n;
	}
}