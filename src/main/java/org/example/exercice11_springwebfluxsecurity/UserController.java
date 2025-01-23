package org.example.exercice11_springwebfluxsecurity;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final List<String> projects = new ArrayList<>();

    public List<String> showProjects(){
        projects.add("Project A");
        projects.add("Project B");
        return projects;
    }


    @GetMapping
    public List<String> getListProjects() {
       return showProjects();
    }

}
