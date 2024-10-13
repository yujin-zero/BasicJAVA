package Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest_01 {
    public static LinkedList<MenInfo> lec;
    public static void main(String[] args) {
        MenInfo ms [] = {
        new MenInfo("조은주","강동구","010-2222-4444"),
        new MenInfo("히든천재","노원구","010-3333-4444"),
        new MenInfo("최강록","마포구","010-4444-4444"),
        new MenInfo("선경","강서구","010-5555-4444"),
        new MenInfo("정지선","도봉구","010-6666-4444")
        };
        lec = new LinkedList<MenInfo>();

        lec.add(ms[0]);
        lec.add(ms[1]);
        lec.add(ms[2]);
        lec.add(ms[3]);
        lec.add(ms[4]);

        ListIterator <MenInfo> it = lec.listIterator();

        int i = 0;
        while(it.hasNext()) {
            MenInfo s = (MenInfo) it.next();
            System.out.printf("[%d] %s\n",i,s);
            i++;
        }
        System.out.printf("요소의 개수 : %d\n",lec.size());

        lec.remove(ms[2]);
        ListIterator<MenInfo> et = lec.listIterator(lec.size());
        i = lec.size();
        while(et.hasPrevious()){
            MenInfo s = (MenInfo)et.previous();
            System.out.printf("[%d] %s\n",i,s);
            i--;
        }
        System.out.printf("요소의 개수 : %d\n",lec.size());
    }
}
