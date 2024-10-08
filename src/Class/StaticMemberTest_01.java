package Class;

public class StaticMemberTest_01 {
    public static void main(String[] args){
        ChildInfo c1 = new ChildInfo("박인비",31,"010-1111-1111");
        System.out.print(c1);

        ChildInfo c2 = new ChildInfo("고구마",33,"010-3333-4444");
        System.out.print(c2);

        ChildInfo c3 = new ChildInfo("나폴리",12,"010-5555-6666");
        System.out.print(c3);

        System.out.printf("static 멤버변수 cnt : %d\n",ChildInfo.cnt);
        System.out.printf("생성된 객체 갯수 : %d",ChildInfo.getCnt());
    }
}
