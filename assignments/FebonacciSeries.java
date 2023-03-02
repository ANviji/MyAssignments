package week1.day2.assignments;

public class FebonacciSeries {

	public static void main(String[] args) {
		int r = 8;
		int sum, firstnum =0, secondnum = 1;
		System.out.println(firstnum);
		for(int i=0 ; i<r;i++)
		{
			sum = firstnum+secondnum;
			firstnum= secondnum;
			secondnum = sum;
			System.out.println(sum);
		}

	}

}
