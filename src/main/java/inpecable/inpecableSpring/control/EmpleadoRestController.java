package inpecable.inpecableSpring.control;


import inpecable.inpecableSpring.modelo.DetalleServicio;
import inpecable.inpecableSpring.modelo.Empleado;
import inpecable.inpecableSpring.modelo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado")
    public List<Empleado> listar() {
        return empleadoService.findAll();
    }

    @GetMapping("/empleado/{id}")
    public Empleado mostrar(@PathVariable Long id) {
        return empleadoService.findById(id);
    }

    @PostMapping("/empleado")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado crear(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @PutMapping("/empleado/{id}")
    public Empleado actualizar(@RequestBody Empleado empleado, @PathVariable Long id) {
        Empleado empleadoOriginal = empleadoService.findById(id);
        empleadoOriginal.setNombre(empleado.getNombre());
        return empleadoService.save(empleadoOriginal);
    }

    @DeleteMapping("/empleado/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        empleadoService.delete(id);
    }
}