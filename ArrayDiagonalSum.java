
public class ArrayDiagonal {

	 public static void main(String[] args) {
		    int[][] array = {
		      {71, 12, 9, 1},
		      {4, 8, 12, 37},
		      {8, 13, 19, 1},
		      {1, 1, 1, 14}
		    };

		    int DSum = 0;
		    int PSum = 0;

		    for (int i = 0; i < array.length; i++) {
		      DSum += array[i][i];
		      Psum += array[i][array.length - i - 1];
		    }

		    System.out.println("Primary Diagonal Sum: " + DSum);
		    System.out.println("Secondary Diagonal Sum: " + PSum);
		  }

}
