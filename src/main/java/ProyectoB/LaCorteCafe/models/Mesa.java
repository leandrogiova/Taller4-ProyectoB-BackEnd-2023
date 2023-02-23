package ProyectoB.LaCorteCafe.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "mesa")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_mesa")
    private int numero_mesa;

    @Column(name = "estado")
    private Boolean estado;
    
    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "precio_temporal")
    private int precio_temporal;
    
    @Column(name = "precio_total")
    private int precio_total;
    
    @Column(name = "forma_pago")
    private String forma_pago;

    @Column(name = "detalle")
    private String detalle;

    @OneToMany()
    private List<Producto> listaProductos;


    public Mesa(){
    }

    public Mesa (int numero_mesa, boolean estado, boolean fecha, LocalDateTime fecha_, 
    int precio_temporal, int precio_total, String forma_pago, String detalle) {
        this.numero_mesa = numero_mesa;
        this.estado = estado;
        this.fecha = fecha_;
        this.precio_temporal = precio_temporal;
        this.precio_total = precio_total;
        this.forma_pago = forma_pago;
        this.detalle = detalle;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }
    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean getEstado() {
       return estado;
    }

 
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public int getPrecio_temporal() {
        return precio_temporal;
    }
    public void setPrecio_temporal(int precio_temporal) {
        this.precio_temporal = precio_temporal;
    }


    public int getPrecio_total() {
        return precio_total;
    }
    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }


    public void setFormaPago(String forma_pago){
        this.forma_pago = forma_pago;
    }
    public String getFormaPago(){
        return this.forma_pago;
    }

    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


}

