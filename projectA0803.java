package projectA08;

import java.util.Arrays;

public class projectA0803 {

	public static void main(String[] args) {
		int[][]Array = new int[3][100];
		
		//1~300까지저장
		for(int i=0,k=1;i<100;i++) {
			Array[0][i]=k;
			k++;
		}
		for(int i=0,k=101;i<100;i++) {
			Array[1][i]=k;
			k++;
		}
		for(int i=0,k=201;i<100;i++) {
			Array[2][i]=k;
			k++;
		}
		System.out.println(Arrays.deepToString(Array));
       for(int i=0,k=1;i<Array.length;i++) {
    	   for(int j=0;j<Array[i].length;j++) {
    		   Array[i][j]=k;
    		   k++;
    	   }
       }
       System.out.println(Arrays.deepToString(Array));
//       1에서 300까지의 홀수합
       int sum=0;
       for(int i=0;i<Array.length;i++) {
    	   for(int j=0;j<Array[i].length;j++) {
    		   if(Array[i][j]%2!=0) {
    			   sum= sum+Array[i][j];
    		   }
    	   }
    	 
       }
       System.out.println("홀수의합:"+sum);
       sum=0;
       for(int i=0;i<Array.length;i++) {
    	   for(int j=0;j<Array[i].length;j++) {
    		   if(Array[i][j]%2!=0) {
    			   sum= sum+Array[i][j];
    		   }
    	   }
       }
       System.out.println("짝수의합:"+sum);
	}

}
