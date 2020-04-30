package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample09 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
            new Employee(1, "학건", 2400),
            new Employee(2, "인호", 2700),
            new Employee(3, "상도", 3000),
            new Employee(4, "빵형", 3200)
        );

        Consumer<Employee> consumer = x -> {
            // 연봉 2배 인상
            x.setSalary(x.getSalary() * 2);
        };
        System.out.println("== 연봉 2배 인상 ==");
        doubleSalary(emp, consumer.andThen((item) -> System.out.println(item)));
    }

    private static void doubleSalary(List<Employee> emp, Consumer<Employee> f) {
        for(Employee e : emp) {
            f.accept(e);
        }
    }
}

@Data
@AllArgsConstructor
class Employee {
    private int no;
    private String name;
    private double salary;
}
