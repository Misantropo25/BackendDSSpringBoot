package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.PagoContrato;
import inpecable.inpecableSpring.modelo.service.IPagoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class PagoContratoRestController {
    @Autowired
    private IPagoContratoService pagoContratoService;

    @GetMapping("/pagos")
    public List<PagoContrato> listar(){
        return pagoContratoService.findAll();
    }

    @PostMapping("/pagos")
    private String mensaje(){
        return "Desde peticion POST";
    }
}