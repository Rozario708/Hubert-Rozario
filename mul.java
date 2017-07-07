package multiplication;

import java.util.Scanner;

public class mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+"*"+a+"="+i*a);
		}
		sc.close();

	}

}
