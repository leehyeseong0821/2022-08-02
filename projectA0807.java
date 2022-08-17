package projectA08;

public class projectA0807 {

	public static void main(String[] args) {
		String[][]A=new String[2][5];
		
		        A[0][0]="java";
				A[0][1]="java";
				A[0][2]="Python";
				A[0][3]="javascript";
 				A[0][4]="Go";
				
				A[1][0]="A";
				A[1][1]="B";
				A[1][2]="C";
				A[1][3]="D";
				A[1][4]="E";
			for(int i=0;i<A.length;i++) {
				for(int j=0;j<A[i].length;j++) {
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
//			만약 0.0번째와 0.1문자열이 똑같으면 equals
			if(A[0][0].equals(A[0][1])) {
				System.out.println("같습니다.");
			}
			
	}

}
