package Collections;
import java.util.ArrayList;

public class ArrayListTest_01 {
    public static ArrayList <Integer> list = new ArrayList<Integer>();
    public static void main(String[] args){
        for (int i=0; i<5; i++) {
            list.add(i);
        }

        prtList("List에 입력된 내용");

        list.remove(2);
        prtList("List에서 2번째 요소 삭제");

        list.add(2,13);
        prtList("List에서 2번째 요소에 13 삽입");

        list.set(4,1000);
        prtList("List에서 4번째 요소를 1000으로 수정");

    }

    public static void prtList(String s) {
        System.out.println(s);
        for(Integer it : list) {
            System.out.printf("%d  ",it);
        }
        System.out.println();
    }
}
