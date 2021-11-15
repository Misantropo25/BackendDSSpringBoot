package inpecable.inpecableSpring.control;


import inpecable.inpecableSpring.modelo.Contrato;
import inpecable.inpecableSpring.modelo.service.IContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ContratoRestController  {
    @Autowired
    private IContratoService contratoService;

    @GetMapping("/contratos")
    public List<Contrato> listar(){
        return contratoService.findAll();
    }

    @PostMapping("/contratos")
    private String mensaje(){
        return "Desde peticion POST";
    }
}
