package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.Servicio;
import inpecable.inpecableSpring.modelo.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioRestController {
    @Autowired
    private IServicioService servicioService;

    @GetMapping("/servicios")
    public List<Servicio> listar(){
        return servicioService.findAll();
    }

    @PostMapping("/servicios")
    private String mensaje(){
        return "Desde peticion POST";
    }
}
