package com.berkayerol.Service.Impl;

import com.berkayerol.Dto.DtoDepartment;
import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Exception.BaseException;
import com.berkayerol.Exception.ErrorMessage;
import com.berkayerol.Exception.MessageType;
import com.berkayerol.Model.Department;
import com.berkayerol.Model.Employee;
import com.berkayerol.Repository.EmployeeRepository;
import com.berkayerol.Service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

   @Autowired
   private EmployeeRepository employeeRepository;


    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
        Optional<Employee> optional = employeeRepository.findById(id);

        if(optional.isEmpty()) {
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
        }


        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDtoDepartment(dtoDepartment);
        return dtoEmployee;

    }
}
