package com.berkayerol.Service;

import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
