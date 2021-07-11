package ar.com.pastelerialotis.service.impl;

import ar.com.pastelerialotis.repository.ProductoRepository;
import ar.com.pastelerialotis.dominio.Producto;
import ar.com.pastelerialotis.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public List<Producto> buscarProductos() {
        return productoRepository.findAllByOrderByFechaVencimientoAsc();
    }
    
}
