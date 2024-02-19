/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H2;

import POOEj1H1.*;
import java.util.Objects;

/**
 *
 * @author danielsotoortiz
 */
class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;
    private String estado;

    public Libro() {
        prestado = false;

    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        prestado = false;
    }

    void prestamo() {
        prestado = true;
        this.estado = "prestado";

    }

    void devolucion() {
        prestado = false;
        this.estado = "disponible";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "El libro " + titulo + ", del autor " + autor + " con isbn " + isbn + " está " + estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    
    
    
}
