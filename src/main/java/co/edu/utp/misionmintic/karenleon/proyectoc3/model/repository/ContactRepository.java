package co.edu.utp.misionmintic.karenleon.proyectoc3.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utp.misionmintic.karenleon.proyectoc3.model.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
