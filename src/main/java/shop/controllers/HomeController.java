package shop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shop.dto.CategoryDTO;

import java.util.List;
import java.util.ArrayList;

@RestController
public class HomeController {
    private static List<CategoryDTO> list = new ArrayList<>();
    @GetMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }

    @PostMapping("/")
    public void add(@RequestBody CategoryDTO category) {
        list.add(category);
    }
}
