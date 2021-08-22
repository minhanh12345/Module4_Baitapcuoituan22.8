package validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import service.I_Staff_Service;

public class ValidateStaff implements Validator {
    @Autowired
    I_Staff_Service i_staff_service;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
