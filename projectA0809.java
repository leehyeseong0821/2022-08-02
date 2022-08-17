package projectA08;

import java.util.Arrays;

public class projectA0809 {

	public static void main(String[] args) {
		int[]old= {1,2,3};
		int[]old1= new int[5];
		
		for(int i=0;i<old.length;i++) {
			old1[i]=old[i];
		}
		System.out.println(Arrays.toString(old1));
        int[]old2= new int[5];
        System.arraycopy(old, 0, old2, 0, old.length);
        System.out.println(Arrays.toString(old2));
	}

}
