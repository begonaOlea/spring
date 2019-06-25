
package com.dvd.services;

import com.dvd.model.DVDItem;
import com.dvd.repositorio.DVDItemsRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServiceImpl implements 
        TiendaService{
    
    @Autowired
    private DVDItemsRepository repositorio;

    public TiendaServiceImpl() {
        System.out.println(".... instanciando TiendaServiceImpl");
        
    }
       @Override
    public Collection<DVDItem> getListaDVDs() {        
       return repositorio.getListaDVDs();
    }

    @Override
    public DVDItem getDVD(int id) {
       return repositorio.getDVD(id);
    }

    @Override
    public void addDVD(DVDItem nuevo) {
        repositorio.addDVD(nuevo);
    }
    
    
}
