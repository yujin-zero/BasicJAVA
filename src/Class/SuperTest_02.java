package Class;

public class SuperTest_02 {
    public static void main(String[] args) {
        // Employee 클래스로부터 e 객체 생성
        Employee e = new Employee("손흥민",25);
        e.employeeInfo();

        Manager m = new Manager("슈틸리게",50,"서울");

        m.managerInfo();
    }
}
