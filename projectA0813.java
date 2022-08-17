package projectA08;

import java.util.Arrays;

public class projectA0813 {
          
	static void makeArray(int[]array) {
		int[]A=new int[array.length];
		for(int i=0;i<A.length;i++) {
			A[i]=array[i];
		}
		A[0]=999;
		System.out.println(Arrays.toString(A));
	}
	
	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(A));
        makeArray(A);
        System.out.println(Arrays.toString(A));
	}

}
