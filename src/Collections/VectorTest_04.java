package Collections;
import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest_04 {
    public static Vector <PsInfo> vec;
    public static void main(String[] args) {
        vec = new Vector<PsInfo>();

        PsInfo p1 = new PsInfo("애드워드리",30,"서울","010-2222-3333");
        PsInfo p2 = new PsInfo("권성준",22,"나폴리","010-2029-0292");
        PsInfo p3 = new PsInfo("조은주",33,"빌딩","010-3333-3333");
        PsInfo p4 = new PsInfo("백종원",44,"집","010-2222-4242");
        PsInfo p5 = new PsInfo("안성재",32, "모수","010-3223-3435");

        // 벡터에 요소 삽입
        vec.add(p1);
        vec.add(p2);
        vec.add(p3);
        vec.add(p4);
        vec.add(p5);

        memInfoList("삽입한 회원 정보 확인");
        System.out.printf("요소의 개수 : %d\n",vec.size());

        vec.remove(p2);
        memInfoList("삭제 후 회원 정보 확인");
        System.out.printf("요소의 개수 : %d\n",vec.size());

    }

    public static void memInfoList(String prtStr) {
        System.out.println(prtStr);
        int i = 0;
        Iterator <PsInfo> it = vec.iterator();
        while(it.hasNext()) {
            System.out.printf("[%d] %s \n",i,it.next());
            i++;
        }
    }
}
