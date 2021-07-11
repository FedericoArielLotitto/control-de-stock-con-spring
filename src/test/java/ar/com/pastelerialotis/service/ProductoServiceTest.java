package ar.com.pastelerialotis.service;

import ar.com.pastelerialotis.dominio.Producto;
import java.time.LocalDateTime;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductoServiceTest {
    @Autowired
    ProductoService productoService;
    
    @Test
    public void buscarProductosEnOrdenDeVencimientoTest_conProductosGuardados_retornaListaDeProductos() {
        List<Producto> listaProductos = productoService.buscarProductosSegunMasVencido();
        Assertions.assertThat(listaProductos).isNotEmpty();
    }
    
    @Test
    public void buscarProductosEnOrdenDeVencimientoTest_conProductosEnBase_retornaProductosEnOrdenDeFechaDeVencimiento() {
        List<Producto> listaProductos = productoService.buscarProductosSegunMasVencido();
        //¿Cómo genero un escenario real de test? (donde asserteo que cada producto es mas viejo que el siguiente)
        Producto productoMasViejo = listaProductos.get(0);
        Producto productoMasNuevo = listaProductos.get(1);
        assertTrue(productoMasViejo.getFechaVencimiento().isBefore(productoMasNuevo.getFechaVencimiento()) || productoMasViejo.getFechaVencimiento().isEqual(productoMasNuevo.getFechaVencimiento()));
    }
}
