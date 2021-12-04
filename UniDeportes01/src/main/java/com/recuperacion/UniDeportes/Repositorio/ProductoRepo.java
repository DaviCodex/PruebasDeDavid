package com.recuperacion.UniDeportes.Repositorio;
import java.util.ArrayList;
import com.recuperacion.UniDeportes.Modelo.ProductoModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends MongoRepository<ProductoModelo,Long>
{
    ArrayList<ProductoModelo> findByNombre(String Nombre);
    ProductoModelo findByCategoria(String categoria);
    ProductoModelo findByPrecio(Long Precio);
}

