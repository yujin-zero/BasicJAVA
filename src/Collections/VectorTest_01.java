package Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest_01 {
    public static Vector <Integer> vec;
    public static void main(String[] args) {
        vec = new Vector <Integer>();

        // 백터에 데이터 3개 삽입
        vec.add(100);
        vec.add(200);
        vec.add(300);
        vecInfoList("삽입된 벡터 값 출력");
        System.out.printf("요소의 개수 : %d\n",vec.size());
        vec.add(400);
        vec.add(500);
        vecInfoList("추가된 후 벡터 값 출력");
        System.out.printf("요소의 개수 : %d\n",vec.size());
        vec.remove(2);
        vecInfoList("삭제된 다음 벡터 값 출력");
        System.out.printf("요소의 개수 : %d\n",vec.size());
    }

    private static void vecInfoList(String prtStr) {
        System.out.println(prtStr);
        int i = 0;
        Iterator <Integer> it = vec.iterator();
        while(it.hasNext()) {
            System.out.printf("vec [%d]번 째 값 = %d\n",i,it.next());
            i++;
        }

    }
}
