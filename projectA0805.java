package projectA08;

import java.util.Arrays;

public class projectA0805 {

	public static void main(String[] args) {
		int[][]Array;
		Array =new int[4][];
	    Array[0]=new int[1];
	    Array[1]=new int[2];
	    Array[2]=new int[3];
	    Array[3]=new int[4];
	    
	    Array[0][0]= 10;
	    
	    Array[1][0] =21;
	    Array[1][1] =22;
	    
	    Array[2][0] =31;
	    Array[2][1] =32;
	    Array[2][2] =33;
	    
	    Array[3][0] =41;
	    Array[3][1] =42;
	    Array[3][2] =43;
	    Array[3][3] =44;
	    
	    int sum=0;
	    for(int i=0;i<Array.length;i++) {
	    	for(int j=0;j<Array[i].length;j++) {
	    		sum= sum +Array[i][j];
	    	}
	    }
	    System.out.println(sum);
	    System.out.println(Arrays.deepToString(Array));

	}

}
