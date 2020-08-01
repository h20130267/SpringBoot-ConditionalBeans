package com.edufool.RegBeansOnConditionBySystemProperty.model;

import java.util.Arrays;
import java.util.List;

public class MongoUserDAO implements IUserDAO {
    @Override
    public List<String> getAllUserNames() {
        System.out.println("***** Getting User Names from Mongo DB *****");
        return Arrays.asList("Pavan", "Karthik", "Jagan");
    }
}
