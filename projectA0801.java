package projectA08;

import java.util.Arrays;

public class projectA0801 {

	public static void main(String[] args) {
		int[][]Array = {{1,2,3,},{4,5,6}}; //2차원 2개 1차원 1개 
		int[][]Array1 = new int [2][3];//2행 3열 두개씩 세개
		Array1 = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.deepToString(Array1));
		for(int i=0;i<Array1.length;i++) {
			for(int j=0;j<Array[i].length;j++)
			System.out.print(Array1[i][j]+" ");
		}
	   System.out.println();
	   for(int i=0;i<Array.length;i++) {
		   for(int j=0;j<Array[i].length;j++) {
			   System.out.print(Array1[i][j]+" ");
		   }
	   }
		
		

	}

}
