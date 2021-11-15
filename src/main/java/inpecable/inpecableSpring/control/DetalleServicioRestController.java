package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.DetalleServicio;
import inpecable.inpecableSpring.modelo.service.IDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api")
public class DetalleServicioRestController {
    @Autowired
    private IDetalleService detalleService;

    @GetMapping("/detallesServicio")
    public List<DetalleServicio> listar(){
        return detalleService.findAll();
    }

    @PostMapping("/detallesServicio")
    private String mensaje(){
        return "Desde peticion POST";
    }

}

