package ARRAY2D;

public class matrixIntro {

	public static void main(String[] args) {
		int x[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int i,j;
		System.out.println("-----The Matrix items-----");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[0].length;j++)
			{
				System.out.println("\nThe matrix item at"+i+","+j+"position ="+x[i][j]);
			}
			System.out.println("");
		}

	}

}
