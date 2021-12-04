package com.recuperacion.UniDeportes.Controladores;
import java.util.ArrayList;
import com.recuperacion.UniDeportes.Modelo.ProductoModelo;
import com.recuperacion.UniDeportes.Servicios.ProductoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",methods ={RequestMethod.POST,RequestMethod.GET,RequestMethod.DELETE})
@RequestMapping("/producto")
public class ContorladorProducto 
{
    @Autowired
    ProductoServicios servicios;
    @PostMapping()
    public ProductoModelo enviaryGuardar(@RequestBody ProductoModelo producto)
    {
        return servicios.guardarProductoModelo(producto);
    }
    @GetMapping
    public ArrayList<ProductoModelo> consultarProductos()
    {
        return servicios.consultarTodos();   
    }
    @DeleteMapping(path="/{referencia}")
    public Boolean borrarProducto(@PathVariable("referencia") long referencia)
    {
        return servicios.eliminarProducto(referencia);
    }
    @GetMapping(path="/buscar/{nombre}")
    public ArrayList<ProductoModelo> consultarPorNombre(@PathVariable("nombre") String nombre)
    {
        return servicios.consultarPorNombre(nombre);
    }
    @GetMapping(path="/buscar-precio/{precio}")
    public ProductoModelo consultarPorPrecio(@PathVariable("precio") Long precio)
    {
        return servicios.consultarPorPrecio(precio);
    }
    @GetMapping(path="/buscar-categoria/{categoria}")
    public ProductoModelo consultarPorCategoria(@PathVariable("categoria") String categoria)
    {
        return servicios.consultarPorCategoria(categoria);
    }
    
}
