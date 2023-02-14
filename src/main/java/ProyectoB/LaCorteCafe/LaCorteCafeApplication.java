package ProyectoB.LaCorteCafe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ProyectoB.LaCorteCafe.models.Producto;
import ProyectoB.LaCorteCafe.repositorys.ProductoRepository;

@SpringBootApplication
public class LaCorteCafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaCorteCafeApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadAgendaData(ProductoRepository productoRepository){
		return (args) -> {
			
/* 
			Producto producto1 = new Producto();
			producto1.setNombre("cafesiño");
			producto1.setNumeroProducto(110);
			producto1.setPrecio(11);
			productoRepository.save(producto1);
*/
		};
	}	





}
