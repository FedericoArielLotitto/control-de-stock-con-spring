package ar.com.pastelerialotis.repository;

import ar.com.pastelerialotis.dominio.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findAllByOrderByFechaVencimientoAsc();
}