package br.edu.fatecpg.departfirm;

import br.edu.fatecpg.departfirm.models.Department;
import br.edu.fatecpg.departfirm.models.Employee;
import br.edu.fatecpg.departfirm.repositories.DepartmentRepository;
import br.edu.fatecpg.departfirm.repositories.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartFirmApplication implements CommandLineRunner {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Autowired
  private DepartmentRepository departmentRepository;

  public static void main(String[] args) {
    SpringApplication.run(DepartFirmApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // Geração de dados
    Employee employee1 = new Employee("Joao");
    Department department1 = new Department("Informatica");
    department1.setEmployees(employee1);
    departmentRepository.save(department1);

    Employee employee2 = new Employee("Marcos");
    Department department2 = new Department("Informatica");
    department2.setEmployees(employee2);
    departmentRepository.save(department2);

    Employee employee3 = new Employee("Julia");
    Department department3 = new Department("Marketing");
    department3.setEmployees(employee3);
    departmentRepository.save(department3);

    Employee employee4 = new Employee("Natalia");
    Department department4 = new Department("Marketing");
    department4.setEmployees(employee4);
    departmentRepository.save(department4);

    // Listagem de dados
    List<Department> departments = departmentRepository.findAll();
    departments.forEach(System.out::println);
  }
}
