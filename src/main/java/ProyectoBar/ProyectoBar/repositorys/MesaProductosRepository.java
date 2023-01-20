package ProyectoBar.ProyectoBar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoBar.ProyectoBar.models.MesaProducto;


@Repository
public interface MesaProductosRepository extends JpaRepository<MesaProducto, Long>{
}
