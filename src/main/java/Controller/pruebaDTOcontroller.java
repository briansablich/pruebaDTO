/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.pruebaDTO.pruebaDTO.Inquilino;
import com.pruebaDTO.pruebaDTO.Propiedad;
import com.pruebaDTO.pruebaDTO.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaDTOcontroller {
    
    @GetMapping ("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        PropiedadDTO propDTO = new PropiedadDTO();
        Inquilino inqui = new Inquilino(1L,"123456", "Jorge", "Perez", "Chapista");
        Propiedad prop = new Propiedad(2L,"Dpto","Quirno 999", 150.0, 25000.5);
        
        propDTO.setId_propiedad(prop.getId_propiedad());
        propDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propDTO.setDireccion(prop.getDireccion());
        propDTO.setValor_alquiler(prop.getValor_alquiler());
        propDTO.setNombre(inqui.getNombre());
        propDTO.setApellido(inqui.getApellido());
        
        return propDTO;
    }
}
