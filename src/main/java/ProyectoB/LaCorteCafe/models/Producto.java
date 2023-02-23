package ProyectoB.LaCorteCafe.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "numero_producto", unique=true)
    private int numeroProducto;

    @Column(name = "precio")
    private int precio;

/*    
    @ManyToMany
    @JsonIgnore
    private Mesa mesa;
*/

    public Producto(){        
    }

    public Producto(Long id, String nombre, int numeroProducto,int precio) {
        this.id = id;
        this.numeroProducto = numeroProducto;
        this.nombre = nombre;
        this.precio = precio;
    }


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }
    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public long getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 



}
