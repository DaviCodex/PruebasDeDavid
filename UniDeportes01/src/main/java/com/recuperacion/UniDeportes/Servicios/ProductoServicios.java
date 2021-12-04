package com.recuperacion.UniDeportes.Servicios;
import java.util.ArrayList;
import java.util.Optional;

import com.recuperacion.UniDeportes.Modelo.ProductoModelo;
import com.recuperacion.UniDeportes.Repositorio.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicios {
    @Autowired
    ProductoRepo repo;
    
    public ProductoModelo guardarProductoModelo(ProductoModelo producto)
    {
        return repo.save(producto);
    }
    public ArrayList<ProductoModelo> consultarTodos()
    {
        return(ArrayList<ProductoModelo>)repo.findAll();
    }
    public Boolean eliminarProducto(Long Ref)
    {
        if(repo.existsById(Ref))
        {
            repo.deleteById(Ref);
            return true;
        }
        else
        {
            return false;
        }
    }
    public Optional<ProductoModelo> consultarPorRef(Long Ref)
    {
        return repo.findById(Ref);
    }
    public ArrayList<ProductoModelo> consultarPorNombre(String Nombre)
    {
        return repo.findByNombre(Nombre);
    }
    public ProductoModelo consultarPorCategoria(String Categoria)
    {
        return repo.findByCategoria(Categoria);
    }
    public ProductoModelo consultarPorPrecio(Long precio)
    {
        return repo.findByPrecio(precio);
    }
}
