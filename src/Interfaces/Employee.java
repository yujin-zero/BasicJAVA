package Interfaces;

public class Employee implements Managable, Workable{
    private String empName;

    // Getter Setter
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // 생성자
    Employee(){}
    Employee(String empName) {
        this.setEmpName(empName);
    }

    public void manage(){
        System.out.println(this.getEmpName()+ "이 근로자를 관리한다.");
    }

    public void work() {
        System.out.println(this.getEmpName()+ "이 회사에서 일한다.");
    }
}
