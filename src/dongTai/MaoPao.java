package dongTai;

public class MaoPao {

	public static void main(String[] args) {
	/*	Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		String[] array1=str.split(",");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("..."+array1[i]);
		}*/
		int[] a={1,1,2,0,9,3,12,7,8,3,4,65,22};
		int[] b=selectSort(a);
		for (int i = 0; i < b.length; i++){
			System.out.println(b[i]+"  ");
		}

	}
	
	public static int[] selectSort (int array[]) {
	    for (int i = 0;i < array.length;i ++) {
	        for (int j =0;j < array.length-i-1;j++) {
	            if (array[j] > array[j+1]){
	                int temp = array[j];
	                array[j] = array[j+1];
	                array[j+1] = temp;
	            }
	        }
	    }
		return array;
	}
	
	 public static String longestCommonPrefix3(String[] strs){
		    if (strs == null || strs.length == 0) return "";
		    for (int i = 0; i < strs[0].length() ; i++){
		        char c = strs[0].charAt(i);
		        for (int j = 1; j < strs.length; j ++){
		            if (i == strs[j].length() || strs[j].charAt(i) != c)
		                return strs[0].substring(0, i);             
		        }
		    }
		    return strs[0];
		}
	 
}
