package day3;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//int a[][]= {{100,200},{300,400},{500,600},{700,800}};
		
		System.out.println("Number of rows:" +a.length);
		System.out.println("Number of columns:" +a[0].length);
		
		//classic forloop to read the values
		
		for(int i=0;i<a.length;i++) //outer loop 0 1 2 3 
		{   
			for(int j=0;j<a[i].length;j++) //inner loop 0 1
			{
				System.out.println(a[i][j]); //100 200 300 400 500 600
			}
		}
		
		//read values using enhanced for loop
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}





		
		

	}

}
