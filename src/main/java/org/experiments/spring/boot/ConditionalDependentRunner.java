package org.experiments.spring.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(AnyNestedConditionVerifier.class)
@Component
public class ConditionalDependentRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("From ConditionalDependentRunner");
    }
}
