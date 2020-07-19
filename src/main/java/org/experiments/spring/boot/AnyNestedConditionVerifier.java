package org.experiments.spring.boot;

import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class AnyNestedConditionVerifier extends AnyNestedCondition {

    public AnyNestedConditionVerifier() {
        super(ConfigurationPhase.PARSE_CONFIGURATION);
    }

    @ConditionalOnProperty(name = "check.conditional.profile", havingValue = "mysql")
    static class MysqlCondition {}

    @ConditionalOnProperty(name = "check.conditional.profile", havingValue = "h2")
    static class H2Condition {}
}
