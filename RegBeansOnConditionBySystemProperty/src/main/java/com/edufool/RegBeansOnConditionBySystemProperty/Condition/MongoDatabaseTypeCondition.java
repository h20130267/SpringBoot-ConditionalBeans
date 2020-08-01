package com.edufool.RegBeansOnConditionBySystemProperty.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MongoDatabaseTypeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        String enableDBType = System.getProperty("dbType");
        return (enableDBType != null && (enableDBType.equalsIgnoreCase("MONGO")));
    }
}
