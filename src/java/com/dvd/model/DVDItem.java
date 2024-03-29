
package com.dvd.model;

import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DVDItem implements Serializable{
    
    @NotNull
    @Min(1)
    private int id;
    @Size(min = 4, max = 50)
    private String titulo;
    @Size(min = 0, max = 50)
    private String autor;
    private boolean alquilado;
    @Min(1900)
    private int anio;

    public DVDItem() {
    }

    public DVDItem(int id, String titulo, String autor, boolean alquilado, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.alquilado = alquilado;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVDItem other = (DVDItem) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DVDItem{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", alquilado=" + alquilado + ", anio=" + anio + '}';
    } 
    
}
