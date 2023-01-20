package ProyectoBar.ProyectoBar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoBar.ProyectoBar.models.Producto;
import ProyectoBar.ProyectoBar.repositorys.ProductoRepository;



@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepo;


    public List<Producto> getAllProductos(){
        return productoRepo.findAll();
    }

    public void enviarProducto(Producto p1){
        p1.setId(100);
        p1.setNombre("cofe");
        p1.setPrecio(150);
        productoRepo.save(p1);
    }


}
