package ProyectoBar.ProyectoBar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ProyectoBar.ProyectoBar.models.Producto;
import ProyectoBar.ProyectoBar.repositorys.ProductoRepository;

@SpringBootApplication
public class ProyectoBarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoBarApplication.class, args);
	}



	@Bean
	public CommandLineRunner loadAgendaData(ProductoRepository productoRepository){
		return (args) -> {
			Producto producto1 = new Producto();
			producto1.setId((long) 9);
			producto1.setNombre("mediALUNA");
			producto1.setPrecio(9);
			productoRepository.save(producto1);
		};
	}


}
