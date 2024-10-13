package Collections;

public class MenInfo {
    private String name;
    private String address;
    private String cellPhone;

    public MenInfo(String name, String address, String cellPhone) {
        this.name = name;
        this.address = address;
        this.cellPhone = cellPhone;
    }

    public String toString(){
        String info;
        info = "이름 : " + name + ", 주소 : " + address + ", 번호 : " + cellPhone;
        return info;
    }
}
