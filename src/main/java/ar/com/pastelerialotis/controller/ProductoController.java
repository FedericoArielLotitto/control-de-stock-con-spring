package ar.com.pastelerialotis.controller;

import ar.com.pastelerialotis.dominio.Producto;
import ar.com.pastelerialotis.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductoController {
    
    @Autowired
    ProductoService productoService;
    
    @GetMapping
    public String home() {
        return "home-page";
    }
    
    @GetMapping("/productos")
    public ModelAndView presentarProductos() {
        ModelAndView productos = new ModelAndView("productos");
        List<Producto> listaProductos = productoService.buscarProductosSegunMasVencido();
        productos.addObject("productos", listaProductos);
        return productos;
    }
}
