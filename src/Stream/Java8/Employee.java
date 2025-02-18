package Stream.Java8;

import java.util.List;

public class Employee {

    public Employee(int id, String name, String dept, List<Project> projects, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.projects = projects;
        this.salary = salary;
        this.gender = gender;
    }

    private int id;
    private String name;
    private String dept;
    private List<Project> projects;
    private double salary;
    private String gender;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
