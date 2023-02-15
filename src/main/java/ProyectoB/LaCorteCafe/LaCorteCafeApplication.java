package ProyectoB.LaCorteCafe;

import java.sql.Array;
import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ProyectoB.LaCorteCafe.models.Mesa;
import ProyectoB.LaCorteCafe.models.Producto;
import ProyectoB.LaCorteCafe.repositorys.MesaRepository;
import ProyectoB.LaCorteCafe.repositorys.ProductoRepository;

@SpringBootApplication
public class LaCorteCafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaCorteCafeApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadAgendaData(ProductoRepository productoRepository, MesaRepository mesaRepository){
		return (args) -> {

/*		
			Producto producto1 = new Producto();
			producto1.setNombre("cafesiño");
			producto1.setNumeroProducto(110);
			producto1.setPrecio(11);
			productoRepository.save(producto1);

			Producto producto2 = new Producto();
			producto1.setNombre("medialunaGrande");
			producto1.setNumeroProducto(90);
			producto1.setPrecio(90);
			productoRepository.save(producto2);


			Producto[] lista = {producto1, producto2};
			 
			Mesa mesa1 = new Mesa();
			mesa1.setListaProductos(lista);
			mesa1.setNumero_mesa(11);
			mesa1.setEstado(true);
			mesa1.setPrecio_temporal(100);
			mesa1.setPrecio_total(500);
			mesaRepository.save(mesa1);
*/	
			

		};

	}
		
}