
package com.dvd.repositorio;

import com.dvd.model.DVDItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class EnMemoriaDVDItemsRepository implements DVDItemsRepository{

    private Map<Integer, DVDItem> dvds;

    public EnMemoriaDVDItemsRepository() { 
        
        System.out.println("... instanciando EnMemoriaDVDItemsRepository");
        dvds = new HashMap();
        dvds.put(1, new DVDItem(1, "La Cabaña", "Carlos", false, 2010));
        dvds.put(2, new DVDItem(2, "La vida es Sueño", "Calderon", false, 1910));
        dvds.put(3, new DVDItem(3, "Lo Mejor de los 80", "varios", false, 1983));
    }
 
    @Override
    public Collection<DVDItem> getListaDVDs() {        
       return dvds.values();
    }

    @Override
    public DVDItem getDVD(int id) {
       return this.dvds.get(id);
    }

    @Override
    public void addDVD(DVDItem nuevo) {
        this.dvds.put(nuevo.getId(), nuevo);
    }
    
}
