package ProyectoB.LaCorteCafe.models;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


/* 
public class Mesa {

}
*/




@Entity
@Table(name = "Producto")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numero_mesa")
    private int numero_mesa;

    @Column(name = "lista_productos")
    @OneToMany
    private Producto[] listaProductos;

    @Column(name = "estado")
    private boolean estado;
    
    @Column(name = "fecha")
    private Date fecha;

    
    @Column(name = "precio_temporal")
    private int precio_temporal;
    
    @Column(name = "precio_total")
    private int precio_total;
    
    @Column(name = "forma_pago")
    private String forma_pago;

    @Column(name = "productos_cobrados")
    @OneToMany
    private Producto[] productosCobrados;



    public Mesa(){
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Producto[] getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
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


    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
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

 
    public void setProductosCobrados(Producto[] productosCobrados){
        this.productosCobrados = productosCobrados;
    }
    public Producto[] getProductosCobrados(){
        return productosCobrados;
    }


}

