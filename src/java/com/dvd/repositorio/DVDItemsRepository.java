
package com.dvd.repositorio;

import com.dvd.model.DVDItem;
import java.util.Collection;


public interface DVDItemsRepository {
    
    public Collection<DVDItem> getListaDVDs();
    public DVDItem getDVD(int id);
    public void addDVD(DVDItem nuevo);    
    
}
