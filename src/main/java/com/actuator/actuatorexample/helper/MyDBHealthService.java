package com.actuator.actuatorexample.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHealthService  implements HealthIndicator {

    public boolean isHealthGood(){
        return true;
    }

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        if(isHealthGood()){
            return Health.up().withDetail("Database service","Database service is running").build();
        }
        return Health.down().withDetail("Databse service","DB Service running down").build();
    }
}
