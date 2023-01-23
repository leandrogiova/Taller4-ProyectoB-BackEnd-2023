package ProyectoBar.ProyectoBar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoBar.ProyectoBar.models.Producto;
import ProyectoBar.ProyectoBar.services.ProductoService;

import org.springframework.web.bind.annotation.CrossOrigin;


//http://localhost:8080/productos/lista


@CrossOrigin
@RestController
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;


    @GetMapping("/lista")
    public List<Producto> todosLosProductos(){
        return productoService.getAllProductos();
    }

    @PostMapping("/enviar")
    public void enviarProducto(@RequestBody Producto p1){

       /* 
        p1 = new Producto();
        p1.setId((long) 100);
        p1.setNombre("Cafesito");
        p1.setPrecio(101);
        */
        

        productoService.enviarProducto(p1);
    }


}
