package com.posman.what2do.controller;

import com.posman.what2do.entity.ServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping("/check")
    public ServiceResponse<String> healthCheck() {
        return new ServiceResponse<String>("success", "success");
    }
}
