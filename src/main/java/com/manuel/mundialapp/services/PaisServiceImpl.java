package com.manuel.mundialapp.services;

import com.manuel.mundialapp.model.Pais;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaisServiceImpl implements IPaisService{

    List<Pais> lista = new ArrayList<>();

    public PaisServiceImpl() {
        Pais p1 = new Pais();
        p1.setId(1);
        p1.setNombre("Argentina");
        p1.setContinente("Sudamerica");
        p1.setImagen("http://img.fifa.com/images/flags/3/arg.png");

        Pais p2 = new Pais();
        p2.setId(2);
        p2.setNombre("Brasil");
        p2.setContinente("Sudamerica");
        p2.setImagen("http://img.fifa.com/images/flags/3/bra.png");

        Pais p3 = new Pais();
        p3.setId(3);
        p3.setNombre("Colombia");
        p3.setContinente("Sudamerica");
        p3.setImagen("http://img.fifa.com/images/flags/3/col.png");

        Pais p4 = new Pais();
        p4.setId(4);
        p4.setNombre("Perú");
        p4.setContinente("Sudamerica");
        p4.setImagen("http://img.fifa.com/images/flags/3/per.png");

        Pais p5 = new Pais();
        p5.setId(5);
        p5.setNombre("Uruguay");
        p5.setContinente("Sudamerica");
        p5.setImagen("http://img.fifa.com/images/flags/3/uru.png");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
    }

    @Override
    public List<Pais> getPaises(){
        return lista;
    }
}
