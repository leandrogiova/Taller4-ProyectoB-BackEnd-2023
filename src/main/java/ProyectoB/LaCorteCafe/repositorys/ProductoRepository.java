package ProyectoB.LaCorteCafe.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoB.LaCorteCafe.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
