
package com.dvd.web.controllers;

import com.dvd.model.DVDItem;
import com.dvd.repositorio.DVDItemsRepository;
import com.dvd.services.TiendaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DVDItemsController {
    
//    "/"  -> inicio.jsp
//    "/dvditem/detalle" -> detalle.jsp  
    
    @Autowired
    private TiendaService tiensaService;
    


    public DVDItemsController() {
        System.out.println(".... instanciando DVDItemsController");
    } 
    
    @RequestMapping("/")
    public String inicio(Model model) {
	model.addAttribute("saludo", "Bienvenido a nuestra tienda online!");
	model.addAttribute("linea1", "Los mejores dvds del mercado ");
	return "inicio";
    }
    
    
//    @RequestMapping("/dvd/detalle")
//    public String verDetallesDVD(Model model) {
//        
//        DVDItem item = new DVDItem(1, 
//                "La Cabaña", "El autor", false, 2010);
//        model.addAttribute("dvd", item);
//	return "detalles";
//    }
 
    @RequestMapping("/dvd/lista")
    public String verListaDVD(Model model) {

        model.addAttribute("listaDvds", 
                tiensaService.getListaDVDs());
	return "lista";
    }
    
    //   url llamada sera /dvd/detalle/22

    @RequestMapping("/dvd/detalle/{id}")
    public String verDetalle(
            Model model,
            @PathVariable("id") int id){
        
        model.addAttribute("dvd",
                tiensaService.getDVD(id));
        
        return "detalles";
    }
    
     @RequestMapping(value = "/dvd/nuevo", method = RequestMethod.GET) 
      public String getCrearNuevoFormulario(Model model) { 
         DVDItem nuevo = new DVDItem(); 
         model.addAttribute("nuevoDvd", nuevo); 
         return "alta"; 
      } 

      @RequestMapping(value = "/dvd/nuevo", method =  RequestMethod.POST) 
      public String procesarCrearNuevoFormulario(
            @ModelAttribute("nuevoDvd") @Valid DVDItem nuevoItem, 
            BindingResult result, Model model) { 
          
          System.out.println(".... crearndo");
          
          if(result.hasErrors()){
              return "alta";
          }
          
          tiensaService.addDVD(nuevoItem);
//          model.addAttribute("listaDvds", 
//                repositorio.getListaDVDs());
//          return "lista";
           return "redirect:/dvd/lista";


      } 
    
    
}
