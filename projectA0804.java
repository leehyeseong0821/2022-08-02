package projectA08;

import java.util.Arrays;

public class projectA0804 {

	public static void main(String[] args) {
		int[][]Array =new int[5][100];
          for(int i=0,k=1;i<Array.length;i++) {
        	  for(int j=0;j<Array[i].length;j++) {
        		  Array[i][j]=k;
        		  k++;
        	  }
          }
          System.out.println(Arrays.deepToString(Array));
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
		for(int i=0,k=301;i<100;i++) {
			Array[3][i]=k;
			k++;
		}
		for(int i=0,k=401;i<100;i++) {
			Array[4][i]=k;
			k++;
		}
		System.out.println(Arrays.deepToString(Array));
		int sum=0;
		for(int i=0;i<Array.length;i++) {
			for(int j=0;j<Array[i].length;j++) {
				if(Array[i][j]%2!=0) {
					sum= sum+Array[i][j];
				}
			}
		}
		System.out.println(sum);
		int[]sumf =new int[10];
		for(int i=0;i<Array.length;i++) {
			for(int j=0;j<Array[i].length;j++) {
				if(Array[i][j]%1==0) {
				 sumf[0]=sumf[0]+Array[i][j];
				}
			    if(Array[i][j]%2==0) {
			    	sumf[1]=sumf[1]+Array[i][j];
			    }
			    if(Array[i][j]%3==0) {
			    	sumf[2]=sumf[2]+Array[i][j];
			    }
			    if(Array[i][j]%4==0) {
			    	sumf[3]=sumf[3]+Array[i][j];
			    }
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"의 배수합은"+sumf[i]);
		}
	}

}
