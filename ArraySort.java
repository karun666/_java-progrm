package first;

public class ArraySort {

	public static void main(String[] args) {
		  
		        ArraySort sorting = new ArraySort();
			    int[] array = {8, 2, 91, 8, 7};
			    System.out.println("Original array:");
			    printArray(array);
			    sorting.sort(array); 
			    System.out.println("Sorted array in ascending order:");
			    printArray(array);
			    sorting.sort(array);
			    System.out.println("Sorted array in descending order:");
			    printArray(array);
			  }

			  public void sort(int[] array) {
			  
			     
			      for (int i = 0; i < array.length - 1; i++) {
			        for (int j = i + 1; j < array.length; j++) {
			          if (array[i] > array[j]) {
			           
			            int temp = array[i];
			            array[i] = array[j];
			            array[j] = temp;
			          }
			        }
			   
			      }
			
			      for (int i = 0; i < array.length - 1; i++) {
			        for (int j = i + 1; j < array.length; j++) {
			          if (array[i] < array[j]) {
			            
			            int temp = array[i];
			            array[i] = array[j];
			            array[j] = temp;
			          }
			        
			      }
			    }
			  }

			  public static void printArray(int[] array) {
			    for (int i = 0; i < array.length; i++) {
			      System.out.print(array[i] + " ");
			    }
			    System.out.println();
			  
	}

}
