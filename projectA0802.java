package projectA08;

import java.util.Arrays;

public class projectA0802 {

	public static void main(String[] args) {
		int[][]intArray; // =new int[2][100]
		char[][]charArray;
		double[][]doubleArray;
		
		intArray= new int[2][100];
		charArray= new char[2][5];
		doubleArray= new double[2][5];
		
		for(int i=0,k=1;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j]=k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(intArray));
   for(int i=0;i<intArray.length;i++) {
	   for(int j=0;j<intArray[i].length;j++) {
		   System.out.print(intArray[i][j]+" ");
	   }
	   System.out.println();
   }
   char ca='A';
   for(int i=0;i<charArray.length;i++) {
	   for(int j=0;j<charArray[i].length;j++) {
		   charArray[i][j]= ca;
		   ca++;
	   }
   }
   System.out.println(Arrays.deepToString(charArray));
   double d=0.1;
   for(int i=0;i<doubleArray.length;i++) {
	   for(int j=0;j<doubleArray[i].length;j++) {
		   doubleArray[i][j]=d;
		   d=(d*(i+1)*(j+1));
	   }
   }
   System.out.println(Arrays.deepToString(doubleArray));
    for(int i=0;i<doubleArray.length;i++) {
    	for(int j=0;j<doubleArray[i].length;j++) {
    		System.out.print(doubleArray[i][j]+" ");
    	}
    	 System.out.println();
    }
   
	}

}
