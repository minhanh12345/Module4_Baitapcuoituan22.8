package model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int staff_id;
    @Column(nullable = false)
    @Size(max = 8, message = "nhap dai qua")
    private String staff_name;
    @Column(nullable = false)
    @Pattern(regexp = "[0-9]+$",message = "fill to Interger")
    private int staff_age;
    @Column(nullable = false)
    @Pattern(regexp = "[0-9]+$",message = "fill to Interger")
    private int staff_salary;
    private String staff_branch;

    public Staff() {
    }

    public Staff(int staff_id, String staff_name, int staff_age, int staff_salary, String staff_branch) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_age = staff_age;
        this.staff_salary = staff_salary;
        this.staff_branch = staff_branch;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public int getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(int staff_salary) {
        this.staff_salary = staff_salary;
    }

    public String getStaff_branch() {
        return staff_branch;
    }

    public void  setStaff_branch(String branch) {
        this.staff_branch = branch;
    }
}
