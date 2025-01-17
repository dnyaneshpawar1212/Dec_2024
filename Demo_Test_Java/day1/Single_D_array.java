package Java_Array;

public class Single_D_array {

	public static void main(String[] args) {
	
		//declearig arrray
/*		
		int a[] = new int[5];
		a[0]=5;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		
		
		System.out.println("The value of index 4 :" +a[4]);
	}
	*/
		
	int a[]= {33,10,30,50,20};
		
	System.out.println(a[3]);	  //print value of 3
	System.out.println(a.length);  // print length of aaray
	
	System.out.println("this is for loop");
	
	for(int i=0;i<a.length;i++)      //i<a.length  i<=a.length-1
	{
	System.out.println(a[i]);	     //33 10 30 50 20 
	
	}
	
	/*
	 		int a[]= {99,98,97,96};
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]);
		}
	 */
	
	//enhance for loop
	
	System.out.println("this is enhance loop");
	for(int x:a)
	{
		
		System.out.println(x);
	}
	
	 }	
}
