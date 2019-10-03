package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Create By yuanyuan on 2019/10/3 19:24
 */
public class Employee {

    private int empid;

    private String empname;

    private Set<Project> projects = new HashSet<>();

    public Employee(int empid, String empname, Set<Project> projects) {
        this.empid = empid;
        this.empname = empname;
        this.projects = projects;
    }

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
