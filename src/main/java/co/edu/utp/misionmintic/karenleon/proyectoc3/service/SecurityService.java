package co.edu.utp.misionmintic.karenleon.proyectoc3.service;

import co.edu.utp.misionmintic.karenleon.proyectoc3.controller.dto.UserDto;

public interface SecurityService {  

    UserDto validateUser(String username, String password);

    void createUser(UserDto user);        
}
