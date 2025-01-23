package org.example.exercice11_springwebfluxsecurity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final List<String> projects = new ArrayList<>();
    private final JwtService jwtService;

    public List<String> showProjects(){
        projects.add("Project A");
        projects.add("Project B");
        projects.add("Project C");
        return projects;
    }

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> body) {
        Map<String, String> usersWithPassword = new HashMap<>();
        usersWithPassword.put("username1", "1234");
        usersWithPassword.put("username2", "5678");
        usersWithPassword.put("username3", "7890");
//        Récupération des informations username et password
        String username = body.get("username");
        String password = body.get("password");
        if (usersWithPassword.containsKey(username) && usersWithPassword.containsValue(password)) {
            return jwtService.generateToken(username, Map.of("role", "USER"));
        }
        return "Invalid username or password";
    }
}
