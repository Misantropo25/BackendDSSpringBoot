package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.DetalleServicio;
import inpecable.inpecableSpring.modelo.service.IDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class DetalleServicioRestController {
    @Autowired
    private IDetalleService detalleService;

    @GetMapping("/detalles")
    public List<DetalleServicio> listar(){
        return detalleService.findAll();
    }

    @GetMapping("/detalles/{id}")
    public DetalleServicio mostrar(@PathVariable Long id){
        return detalleService.findById(id);
    }

    @PostMapping("/detalles")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleServicio crear(@RequestBody DetalleServicio detalleServicio){
        return detalleService.save(detalleServicio);
    }

    @PutMapping("/detalles/{id}")
    public DetalleServicio actualizar(@RequestBody DetalleServicio detalleServicio, @PathVariable Long id){
        DetalleServicio detalleOriginal = detalleService.findById(id);
        detalleOriginal.setDescripcion(detalleServicio.getDescripcion());
        return detalleService.save(detalleOriginal);
    }

    @DeleteMapping("/detalles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        detalleService.delete(id);
    }



}

