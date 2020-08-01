package com.edufool.RegBeansOnConditionBySystemProperty.Controller;

import com.edufool.RegBeansOnConditionBySystemProperty.model.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserDAO IUserDAO;

    @GetMapping("/getUserNames")
    public List<String> getUsers(){
        return IUserDAO.getAllUserNames();
    }
}
