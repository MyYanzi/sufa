package dongTai;

public class BubbleSort {
    public static int[] BubbleSort(int[] theArray) {
    	int tmp;
    	for(int i = 0; i < theArray.length; i++) {
    		for (int j= 0; j<theArray.length-i-1; j++) {
    			if (theArray[j] > theArray[j+1]) {
    				tmp = theArray[j];
    				theArray[j] = theArray[j+1];
    				theArray[j+1] =tmp;
    			}
    		}
    	}
    	return theArray;
    }
    public static void main(String[] args) {
    	int []the_array = {10,1,18,30,23,12,7,5,18,17};
        System.out.print("之前的排序：");
        for(int i = 0; i < the_array.length; i++) {
            System.out.print(the_array[i] + " ");
        }
        
        int []result_array = BubbleSort(the_array);
        
        System.out.print("冒泡排序：");
        for(int i = 0; i < result_array.length; i++) {
            System.out.print(result_array[i] + " ");
        }
    }
}
