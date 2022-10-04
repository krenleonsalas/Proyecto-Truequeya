package co.edu.utp.misionmintic.karenleon.proyectoc3.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicationDto {
    private String title;
    private String description;
    private String changeFor;
    private String contactNumber;
    private String imageUrl;
    private String status;
    private CategoryDto category;
    private UserDto user;
}
