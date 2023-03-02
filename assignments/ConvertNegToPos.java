package week1.day2.assignments;

public class ConvertNegToPos {
	public static void main(String[] args) {
		int num = -40;
		if(num<0) {
			num = num*-1;
			System.out.println("The number -40 is converted to "+ num);
		}/*else if(num>0)
		{
			num = num*-1;
			System.out.println("The number +40 is converted to " + num);
		}*/
	}
}
