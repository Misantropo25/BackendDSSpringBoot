package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.Cliente;
import inpecable.inpecableSpring.modelo.Contrato;
import inpecable.inpecableSpring.modelo.service.IClienteService;
import inpecable.inpecableSpring.modelo.service.IContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return clienteService.findAll();
    }

    @PostMapping("/clientes")
    private String mensaje(){
        return "Desde peticion POST";
    }
}
