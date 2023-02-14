package ProyectoB.LaCorteCafe.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoB.LaCorteCafe.models.Producto;
import ProyectoB.LaCorteCafe.repositorys.ProductoRepository;


@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepo;


    public List<Producto> getAllProductos(){
        return productoRepo.findAll();
    }

    public void enviarProducto(Producto p1){
        productoRepo.save(p1);
    }


}
