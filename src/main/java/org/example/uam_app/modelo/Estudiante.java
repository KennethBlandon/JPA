package org.example.uam_app.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
public class Estudiante {
    @Id
    private String cif;
    @Column(name = "Nombres", length = 30)
    @Required(message = "Nombre no puede quedar vacio")
    private String nombre;
    @Column(name = "Apellidos",length = 30)
    @Required(message = "Apellidos no puede quedar vacio")
    private String apellidos;

    LocalDate fechaNac;

}
