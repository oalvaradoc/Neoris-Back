
package com.ejemplo02.ejemplo02;

import java.io.Serializable;
import javax.persistence.*;
    
@Entity
@Table(name="personas")
public class Persona{
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String apellidos;
    @Column
    private boolean procesado;

    public boolean getProcesado() {
		return procesado;
	}

	public void setProcesado(boolean procesado) {
		this.procesado = procesado;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
