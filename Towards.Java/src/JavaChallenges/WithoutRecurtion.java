package javaChallenges;

public class WithoutRecurtion {

	public static void main(String[] args) {
		int x1=0,x2=1,x3;
		int count=10;
		 System.out.println("Fibonacci series: ");
		 System.out.println(x1+""+x2);
		 for(int i=2;i<count;i++) 
		 {
		 x3=x1+x2;
		 System.out.println(" "+x3);
		 x1=x2;
         x2=x3;
		 }


	}

}
//without recurtion
