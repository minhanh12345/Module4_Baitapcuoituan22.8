package service;

import model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import repository.Staff_Repo;

import java.util.ArrayList;

public class Staff_Service implements I_Staff_Service {
    @Autowired
    Staff_Repo staff_repo;

    @Override
    public Staff save(Staff staff) {
        return staff_repo.save(staff);
    }

    @Override
    public Staff findById(int id) {
        return staff_repo.findById(id).get();
    }

    @Override
    public ArrayList<Staff> findAll() {
        return (ArrayList<Staff>) staff_repo.findAll();
    }

    @Override
    public void delete(Staff staff) {
        staff_repo.delete(staff);
    }

    @Override
    public void edit(Staff staff) {
        staff_repo.save(staff);
    }
}
