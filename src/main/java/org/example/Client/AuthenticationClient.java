package org.example.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "AUTHENTICATION-APP",path = "/auth")
public interface AuthenticationClient {
    @GetMapping("/validate/{token}")
    public String validateToken(@RequestParam String token);
}
