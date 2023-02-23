package ProyectoB.LaCorteCafe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ProyectoB.LaCorteCafe.models.Mesa;
import ProyectoB.LaCorteCafe.repositorys.MesaRepository;

@Service
public class MesaService {
    @Autowired
    private MesaRepository mesaRepository; 




    public List<Mesa> getAllMesasAbiertas(){
        return mesaRepository.findAll();
    }



    public void enviarProductoMesa(Mesa m1){
        mesaRepository.save(m1);
    }



}
