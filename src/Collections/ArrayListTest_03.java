package Collections;
import java.util.ArrayList;

public class ArrayListTest_03 {
    public static ArrayList<Object> list = new ArrayList<Object>();
    public static void main(String[] args) {
        list.add("소유진");
        list.add(1);
        list.add('A');
        list.add(34.22);
        list.add("제니퍼");

        prtList("List에 입력된 내용");

        list.remove(2);
        prtList("List에서 2번째 요소를 삭제한 경우");

        list.add(2,"각시탈");
        prtList("List에서 2번째 요소에 각시탈 삽입");

        list.set(3,"ParkSaJang");
        prtList("List에서 3번째 요소를 수정한 경우");


    }

    public static void prtList(String s) {
        System.out.println(s);
        for (Object it : list) {
            System.out.printf("%s  ",it);
        }
        System.out.println();
    }
}
