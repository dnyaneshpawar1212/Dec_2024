package Java_Array;

public class Two_D_array {

	public static void main(String[] args) {
		//one way
/*		
		int a[][]= new int[2][3];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		System.out.println(a[1][1]);
		
		
	}
	*/
/*	
	int a[][]= {{10,20},
				{20,30},
				{40,50},
				{79,30}};
	System.out.println("length of rows:"+a.length);
	System.out.println("length of coloum"+a[0].length);
	
	System.out.println(a[0][1]);
	
	
	for(int r=0;r<=3;r++)
	{
		for(int c=0;c<=3;c++)
		{
			System.out.println(a[r][c]);
		}
	}
*/
		int a[]= {99,98,97,96};
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]);
		}
}
}