package ProyectoB.LaCorteCafe;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

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

			Producto producto3 = new Producto();
			producto1.setNombre("medialuna");
			producto1.setNumeroProducto(88);
			producto1.setPrecio(87);
			productoRepository.save(producto3);


			Producto[] lista = {producto1, producto2, producto3};
			ArrayList lista2 = new ArrayList<>();
			lista2.add(producto1);
			lista2.add(producto2);
			lista2.add(producto3);



			
			Mesa mesa1 = new Mesa();
			
			mesa1.setListaProductos(lista2);

			mesa1.setNumero_mesa(11);
			mesa1.setEstado(true);
			mesa1.setPrecio_temporal(100);
			mesa1.setPrecio_total(500);
			mesaRepository.save(mesa1);
		
		Mesa mesa2 = new Mesa();

		mesa2.setId((long) 99);
		mesa2.setNumero_mesa(98);
		mesa2.setNumero_mesa(7);
		mesa2.setEstado(true);
		mesa2.setPrecio_temporal(100);
		mesa2.setPrecio_total(500);
		mesaRepository.save(mesa2);
*/
	};

	}
		
}