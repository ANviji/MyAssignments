package week1.day2.assignments;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		int[] a= {1,4,3,2,7,6,8};
		Arrays.sort(a);
		for (int i =1; i<a.length; i++)
		{
			if(i!= a[i-1]) {
				System.out.println("The missing number is=" +i);
				break;
			}
		}

	}

}
