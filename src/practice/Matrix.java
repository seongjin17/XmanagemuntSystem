
public class Matrix {
	public static void main(String[] args) {
		int[][] A= {{1,0,2},{-1,3,1}};
		int[][] B= {{3,1},{2,1},{1,0}};
		int[][] C= new int[3][3];
		for( int i = 0;i<2 ;i++) {
			for(int j = 0;j<2 ;j++) {
				for(int k = 0;k<3 ;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}	
			}
		}
		System.out.println("Çà·ÄÀÇ °öÀº?");
		for( int i = 0;i<2 ;i++) {
			for(int j = 0;j<2 ;j++) {
				System.out.print(C[i][j]+" ");				
			}
		System.out.println();	
		}
	}	
}