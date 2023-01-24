package ProyectoBar.ProyectoBar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoBar.ProyectoBar.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    

}