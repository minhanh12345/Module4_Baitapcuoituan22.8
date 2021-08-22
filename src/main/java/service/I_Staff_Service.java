package service;

import model.Staff;

import java.util.ArrayList;

public interface I_Staff_Service {
    Staff save(Staff staff);
    Staff findById(int id);
    ArrayList<Staff> findAll();
    void delete(Staff staff);
    void edit(Staff staff);

}
