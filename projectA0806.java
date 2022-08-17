package projectA08;

public class projectA0806 {

	public static void main(String[] args) {
	int[][]Array= {{10,11,12},{13,14,15},
			{21,22},
			{31,32,33},
			{41,42,43}
	        };
	for(int i=0;i<Array[0].length;i++) {
		System.out.print(Array[0][i]+" ");
	}
	System.out.println();
	for(int i=0;i<Array[1].length;i++) {
		System.out.print(Array[1][i]+" ");
	} 
	System.out.println();
	for(int i=0;i<Array[2].length;i++) {
		System.out.print(Array[2][i]+" ");
	}
	System.out.println();
	for(int i=0;i<Array[3].length;i++) {
		System.out.print(Array[3][i]+" ");
	}
	System.out.println();
	for(int i=0;i<Array[4].length;i++) {
		System.out.print(Array[4][i]+" ");
	}
	System.out.println();
	for(int i=0;i<Array.length;i++) {
		for(int j=0;j<Array[i].length;j++) {
			System.out.print(Array[i][j]+" ");
		}
		System.out.println();
	}
	}

}
