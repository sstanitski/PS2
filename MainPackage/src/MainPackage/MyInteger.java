package MainPackage;
public class MyInteger {
	private int value;
	MyInteger integer2 = new MyInteger(2);
	
	public MyInteger(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

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
	public boolean equals(int v){
		return(value == v);
	}
	public boolean equals(MyInteger v){
		return(value == v.getValue());
	}
	public static int parseInt(char[] value){
		int n = 0;
		for(int g = 0; g < value.length; g++)
			n = n*10 + (value[g]-'0');
		return n;
	}
	public static int parseInt(String value){
		int n = 0;
		for(int g = 0; g < value.length(); g++)
			n = n*10 + (value.charAt(g)-'0');
		return n;
	}
}