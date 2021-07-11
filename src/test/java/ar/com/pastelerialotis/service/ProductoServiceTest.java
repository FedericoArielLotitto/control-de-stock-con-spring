package ar.com.pastelerialotis.service;

import ar.com.pastelerialotis.dominio.Producto;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductoServiceTest {
    @Autowired
    ProductoService productoService;
    @Test
    public void buscarProductosTest_conProductosGuardados_retornaListaDeProductos() {
        List<Producto> listaProductos = productoService.buscarProductos();
        Assertions.assertThat(listaProductos).isNotEmpty();
    }
}
