package com.edufool.RegBeansOnConditionBySystemProperty.model;

import java.util.Arrays;
import java.util.List;

public class JdbcUserDAO implements IUserDAO{
    @Override
    public List<String> getAllUserNames() {
        System.out.println("***** Getting User names from RDBMS *****");
        return Arrays.asList("Manoj", "Phani", "Arvind");
    }
}
