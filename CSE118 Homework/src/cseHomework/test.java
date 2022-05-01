package cseHomework;

public class test {

	public static void main(String[] args) {
		double[][] arr1 = { {1,2,3,},{6,7,8} };
		double[][] arr2 = { {1,2,3,},{6,7,8} };
		
		double[][] arr3 = addMatricies(arr1,arr2);

	}
	
	public static double[][] addMatricies(double[][] m1, double[][] m2){
		double[][] m3 = new double[m1.length][m1[0].length];
		for(int r = 0; r< m3.length; r++) {
			for(int c = 0; c< m3[r].length; c++) {
				m3[r][c] = m1[r][c] + m2[r][c];
			}	
		}
		return m3;
	}	

}
