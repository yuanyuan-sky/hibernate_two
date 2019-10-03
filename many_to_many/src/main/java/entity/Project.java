package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Create By yuanyuan on 2019/10/3 19:22
 */
public class Project {
    private int proid;
    private String proname;

    private Set<Employee> employees = new HashSet<>();

    public Project() {
    }


    public Project(int proid, String proname) {
        this.proid = proid;
        this.proname = proname;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }
}
