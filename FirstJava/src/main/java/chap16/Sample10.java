package chap16;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample10 {
    public static void main(String[] args) {
            List<Employee1> emp = Arrays.asList(
                new Employee1(1, "학건", 2400),
                new Employee1(2, "인호", 2700),
                new Employee1(3, "상도", 3000),
                new Employee1(4, "빵형", 3200)
            );

        System.out.println("== 연봉 2배 인상 ==");
        emp.forEach((x) -> {
                x.setSalary(x.getSalary() * 2);
                System.out.println(x);
            }
        );
    }
}

@Data
@AllArgsConstructor
class Employee1 {
    private int no;
    private String name;
    private double salary;
}
