package shop.controllers;

import org.springframework.web.bind.annotation.*;
import shop.dto.CategoryDTO;

import java.util.List;
import java.util.ArrayList;

@RestController
public class HomeController {
    private static List<CategoryDTO> list = new ArrayList<>();
    @GetMapping("/")
    public List<CategoryDTO> index() {
        return list;
    }

    @PostMapping("/create")
    public void add(@RequestBody CategoryDTO category) {
        list.add(category);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody CategoryDTO category) {
        list.remove(category);
    }

    @PutMapping("/update")
    public void update(@RequestBody CategoryDTO updatedCategory) {
        for(CategoryDTO category : list)
        {
            if(category.getId() == updatedCategory.getId())
            {
                category.setName(updatedCategory.getName());
            }

        }

    }


}
