package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.Servicio;
import inpecable.inpecableSpring.modelo.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioRestController {
    @Autowired
    private IServicioService servicioService;

    @GetMapping("/servicio")
    public List<Servicio> listar(){
        return servicioService.findAll();
    }

    @GetMapping("/servicio/{id}")
    public Servicio mostrar(@PathVariable Long id){
        return servicioService.findById(id);
    }

    @PostMapping("/servicio/")
    @ResponseStatus(HttpStatus.CREATED)
    public Servicio crear(@RequestBody Servicio servicio){
        return servicioService.save(servicio);
    }

    @PutMapping("/servicio/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Servicio actualizar(@RequestBody Servicio servicio, @PathVariable Long id){
        Servicio servicioOriginal = servicioService.findById(id);
        servicioOriginal.setNombreServicio(servicio.getNombreServicio());
        return servicioService.save(servicioOriginal);
    }

    @DeleteMapping("/servicio/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        servicioService.delete(id);
    }
}
