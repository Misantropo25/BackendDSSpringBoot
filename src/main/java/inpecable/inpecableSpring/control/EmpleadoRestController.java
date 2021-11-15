package inpecable.inpecableSpring.control;


import inpecable.inpecableSpring.modelo.Empleado;
import inpecable.inpecableSpring.modelo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> listar(){
        return empleadoService.findAll();
    }

    @PostMapping("/empleados")
    private String mensaje(){
        return "Desde peticion POST";
    }
}
