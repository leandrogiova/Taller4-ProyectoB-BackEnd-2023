package ProyectoB.LaCorteCafe.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoB.LaCorteCafe.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
