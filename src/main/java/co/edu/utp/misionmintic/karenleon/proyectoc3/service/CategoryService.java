package co.edu.utp.misionmintic.karenleon.proyectoc3.service;

import java.util.List;
import java.util.Optional;


import co.edu.utp.misionmintic.karenleon.proyectoc3.controller.dto.CategoryDto;


public interface CategoryService {

    List<CategoryDto> getCategories();

    Optional<CategoryDto> getCategoryById(Integer id);

}
