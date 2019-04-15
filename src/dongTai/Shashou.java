package dongTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shashou {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> listKiller = new ArrayList<Integer>();
        for (int i=0;i<n ;i++) {
          listKiller.add(sc.nextInt());
        }
        int nightCount = 0;
        int rowSize = listKiller.size();
        while(listKiller.size()>1) {
            for (int i = listKiller.size()-1; i >= 1; i--) {
                if (listKiller.get(i)<listKiller.get(i-1)) {
                    listKiller.remove(i);
                }
            }
  //判断listKiller大小是否发生变化
            if(listKiller.size()==rowSize)
                break;
            else {
                rowSize = listKiller.size();
                nightCount++;
            }
      }
     System.out.println(nightCount);  
}

}
