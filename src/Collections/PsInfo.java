package Collections;

public class PsInfo {
    private String name;
    private int age;
    private String address;
    private String cellPhone;

    public PsInfo(String name, int age, String address, String cellPhone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.cellPhone = cellPhone;
    }

    public String toString(){
        String info;
        info = "이름 : " + name + ", 나이 : " + age + ", 주소 : " + address + ", 번호 : " +cellPhone;
        return info;
    }
}
