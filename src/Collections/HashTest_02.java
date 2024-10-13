package Collections;
import java.util.Enumeration; // 순차접근을 위한 구식 인터페이스
import java.util.Hashtable;

public class HashTest_02 {
    public static void main(String[] args) {
        Hashtable <String,Integer> ht = new Hashtable<String, Integer>();

        ht.put("년",2000);
        ht.put("월",3);
        ht.put("일",30);
        ht.put("시",0);
        ht.put("분",3);

        System.out.println("년 : " + ht.get("년"));
        System.out.println("월 : " + ht.get("월"));
        System.out.println("일 : " + ht.get("일"));
        System.out.println("시 : " + ht.get("시"));
        System.out.println("분 : " + ht.get("분"));

        // 키 출력
        Enumeration<String> hsKey = ht.keys();
        while(hsKey.hasMoreElements()) {
            String keys = hsKey.nextElement();
            System.out.println(keys);
        }

        // 값 출력
        Enumeration<Integer> hsVal = ht.elements();
        while(hsVal.hasMoreElements()) {
            Integer values = hsVal.nextElement();
            System.out.println(values);
        }
    }
}
