package ClassesAndObjects.EX02;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException  {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> employees = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");

            int length = employeeInfo.length;
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];
            employees.putIfAbsent(department,new ArrayList<>());
            Employee employee;
            switch (length){
                case 4:
                    employee = new Employee(name, salary, position,department);
                    break;
                case 5:
                    if (employeeInfo[4].contains("@")){
                        employee = new Employee(name,salary,position,department,employeeInfo[4]);
                    }
                    else{
                        employee = new Employee(name,salary,position,department,Integer.parseInt(employeeInfo[4]));
                    }
                    break;
                default:
                    employee = new Employee(name,
                            salary,
                            position,
                            department,
                            employeeInfo[4],
                            Integer.parseInt(employeeInfo[5]));
                    break;
            }
            employees.get(department).add(employee);


        }
        Map.Entry<String, List<Employee>> highestSalaryDepartment =
                employees.entrySet()
                        .stream().max(Comparator.comparing((Map.Entry<String, List<Employee>> department) ->
                                department.getValue().stream()
                                        .mapToDouble(Employee::getSalary)
                                        .average()
                                        .getAsDouble()))
                        .orElse(null);

        assert highestSalaryDepartment != null;
        System.out.printf("Highest Average Salary: %s\n", highestSalaryDepartment.getKey());
        highestSalaryDepartment.getValue()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
//name, salary, position, department, email, and age