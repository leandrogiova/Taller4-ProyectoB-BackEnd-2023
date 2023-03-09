package ProyectoB.LaCorteCafe.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoB.LaCorteCafe.models.Mesa;
import ProyectoB.LaCorteCafe.repositorys.MesaRepository;
import ProyectoB.LaCorteCafe.services.MesaService;

@CrossOrigin
@RestController
@RequestMapping("/mesasAbiertas")
public class MesaController {
    
    @Autowired
    private MesaService mesaService;

    @Autowired 
    private MesaRepository mesaProductoRepo;


    private LocalDateTime fecha1;
    private LocalDateTime fecha2;

    @GetMapping("/lista")
    public List<Mesa> mesasAbiertas(){  
        List<Mesa> lista1;
        List<Mesa> lista2 = new ArrayList<Mesa>();

       lista1 = mesaService.getAllMesasAbiertas();
        for (Mesa mesa_Producto : lista1) {
            if(mesa_Producto.getEstado() ){
                lista2.add(mesa_Producto);
            }
        }
       return lista2;
    }


    @PostMapping("/envio")
    public void enviarProductoAMesa(@RequestBody Mesa m1){
        mesaService.enviarProductoMesa(m1);
    }


    /*
       * Funcion actualizar
       * Actualiza una mesa, recibe una mesa del FrontEnd, la actualiza y la vuelve a enviar a la base de datos actulizandola 
       * Recibe del FrontEnd un objeto Mesa
       * No tiene ningún retorno
    */
    @PostMapping("/updateMesa")
    public void actualizar(@RequestBody Mesa m1){
        Mesa mesaActual = mesaProductoRepo.findById(m1.getId()).orElse(null);

        mesaActual.setNumero_mesa(m1.getNumero_mesa());
        mesaActual.setEstado(m1.getEstado());
        mesaActual.setFecha(m1.getFecha());
        mesaActual.setListaProductos(m1.getListaProductos());
        mesaActual.setListaProductosCobrados(m1.getListaProductosCobrados());
        mesaActual.setPrecio_total(m1.getPrecio_total());
        mesaActual.setPrecio_temporal(m1.getPrecio_temporal());
        mesaActual.setFormaPago(m1.getFormaPago());

        mesaProductoRepo.save(mesaActual);
    }

/*
    @PostMapping("/FechasResumenes")
    public void fechasResumenes(@RequestBody LocalDateTime fechas[]){
        fecha1 = fechas[0];
        fecha2 = fechas[1];
    }
    


    @GetMapping("/Resumenes")
    public List<Mesa> resumenes(){


        List<Mesa> lista1;
        List<Mesa> lista2 = new ArrayList<Mesa>();
        lista1 = mesaService.getAllMesasAbiertas();  

        if(fecha1 == fecha2){
            for (Mesa mesa1 : lista1) {
                if(mesa1.getFecha().compareTo(fecha1) == 0){
                    lista2.add(mesa1);
                }
            }    
        }
        else{
            for (Mesa_Producto mesa_Producto : lista1) {
                if(mesa_Producto.getFecha().compareTo(fecha1) > 0 && mesa_Producto.getFecha().compareTo(fecha2) < 0){ 
                    lista2.add(mesa_Producto);
                }
            }
        }

        return lista2;
    } 
*/












}
