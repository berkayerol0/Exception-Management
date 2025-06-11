package com.berkayerol.Controller;

import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Model.RootEntity;

public interface IEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
