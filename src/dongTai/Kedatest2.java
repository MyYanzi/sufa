package dongTai;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Kedatest2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入总课程：");
        int courseNum = in.nextInt();
        System.out.println("请输入所有的课程时间和课程代码：");
        //用TreeMap主要是符合题目按照课程时间先后输出冲突，
        //用LinkedList符合题目按照课程代码加入先后输出。
        TreeMap<String, LinkedList<Integer>> courseMap = new TreeMap<>();
        boolean isCollision = false;
        for (int i = 0; i < courseNum; i++) {
            //因为nextInt不能保存01前面的0，所以用String类型保存课程时间
            String courseTime = in.next(); 
            int courseCode = in.nextInt();
            if (courseMap.containsKey(courseTime)) {
                isCollision = true;
                courseMap.get(courseTime).add(courseCode);
            } else {
                LinkedList<Integer> codeList = new LinkedList<>();
                codeList.add(courseCode);
                courseMap.put(courseTime, codeList);
            }
        }
        in.close();
        if (isCollision) {
            for (String time : courseMap.keySet()) {
                if (courseMap.get(time).size() > 1) {
                    System.out.print(time);
                    for(Integer code:courseMap.get(time)){
                    //注意题目的要求，课程后面不能输出多余的空格
                        System.out.print(" "+code);
                    }
                    System.out.println();
                }
            }
        }else {
            System.out.println("Yes");
        }
    }
	
}
