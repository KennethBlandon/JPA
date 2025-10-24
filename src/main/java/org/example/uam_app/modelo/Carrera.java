package org.example.uam_app;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Carrera {
    @Id
    private String Id;
    @Column(name = "Nombre de la carrera", length = 50)
    @Required(message = "Nommbre no puede quedar vacio")
    private String Nombre;
    @Column(name = "Descripcion de la carrera", length = 70)
    @Required(message = "La descripcion de la carrera no puede quedar vacia")
    private String Descripcion;

}
