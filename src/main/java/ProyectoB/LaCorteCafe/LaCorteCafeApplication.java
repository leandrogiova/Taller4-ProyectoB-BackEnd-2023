package ProyectoB.LaCorteCafe;

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
			System.out.println("\n\n\n\n\n\n\nEstoy en el commandLineRunner\n\n\n\n\n\n\n");

/*			
			Producto p1 = new Producto();
			p1.setNombre("MediaLuna");
			p1.setNumeroProducto(200);
			p1.setPrecio(120);

			Producto p2 = new Producto();
			p1.setNombre("MediaLuna Dulce");
			p1.setNumeroProducto(200);
			p1.setPrecio(130);

			Producto p3 = new Producto();
			p1.setNombre("MediaLuna Roja");
			p1.setNumeroProducto(200);
			p1.setPrecio(140);

			Producto p4 = new Producto();
			p1.setNombre("MediaLuna Negra");
			p1.setNumeroProducto(200);
			p1.setPrecio(150);


			List lista1 = new ArrayList();
			lista1.add(p1);
			lista1.add(p2);
			lista1.add(p3);
			lista1.add(p4);

			Mesa m1 = new Mesa();
			m1.setEstado(true);
			m1.setFormaPago("Efectivo");
			m1.setNumero_mesa(200);
			m1.setPrecio_temporal(0);
			m1.setPrecio_total(200);
			m1.setListaProductos(lista1);
			mesaRepository.save(m1);

			System.out.println("m1 = " + m1 + "\n\n\n\n\n");
*/	



	};

	}
		
}