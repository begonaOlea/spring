package com.dvd.services;

import com.dvd.model.DVDItem;
import java.util.Collection;

public interface TiendaService {
    
    public Collection<DVDItem> getListaDVDs();
    public DVDItem getDVD(int id);
    public void addDVD(DVDItem nuevo);  
    
}
