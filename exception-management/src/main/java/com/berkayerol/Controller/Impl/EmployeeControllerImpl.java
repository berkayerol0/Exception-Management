package com.berkayerol.Controller.Impl;

import com.berkayerol.Controller.IEmployeeController;
import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Model.RootEntity;
import com.berkayerol.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl extends RestBaseController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
