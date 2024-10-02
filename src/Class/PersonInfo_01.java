package Class;

public class PersonInfo_01 {
    protected String name;
    protected String telNo;
    protected int age;

    // 생성자
    public PersonInfo_01(String name, String telNo, int age) {
        this.name = name;
        this.telNo = telNo;
        this.age = age;
    }

    // Setters() 와 Getters() 작성
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
