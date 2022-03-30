package JavaChallenges;
//0 1 1 2 3 5
public class Fibonacci {
     
	static int x1=0,x2=1,x3;
	static void printFibb(int count) {
	 
		if(count>0)
		{
             x3=x1+x2;
             x1=x2;
             x2=x3;
             System.out.println(" "+x3);
             printFibb(count-1);
	}

}
	public static void main(String args[]) {
		 int count=10;
		 System.out.println("Fibonacci series: ");
		 System.out.println(x1+""+x2);
		 printFibb(count-2);
		
	}
}
//This is fibonacci series with recursion 
//Recursion is the technique of making a function call itself. 
//here the printFibb is a function calling itself.