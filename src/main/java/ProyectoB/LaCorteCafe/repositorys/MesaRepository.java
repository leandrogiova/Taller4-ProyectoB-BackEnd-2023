package ProyectoB.LaCorteCafe.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ProyectoB.LaCorteCafe.models.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{
    
}
