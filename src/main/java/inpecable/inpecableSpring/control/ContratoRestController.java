package inpecable.inpecableSpring.control;


import inpecable.inpecableSpring.modelo.Contrato;
import inpecable.inpecableSpring.modelo.service.IContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ContratoRestController  {
    @Autowired
    private IContratoService contratoService;

    @GetMapping("/contrato")
    public List<Contrato> listar(){
        return contratoService.findAll();
    }

    @GetMapping("/contrato/{id}")
    public Contrato mostrar(@PathVariable Long id){
        return contratoService.findById(id);
    }

    @PostMapping("/contrato/")
    @ResponseStatus(HttpStatus.CREATED)
    public Contrato crear(@RequestBody Contrato contrato){
        return contratoService.save(contrato);
    }

    @PutMapping("/contrato/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Contrato actualizar(@RequestBody Contrato contrato, @PathVariable Long id){
        Contrato contratoOriginal = contratoService.findById(id);
        contratoOriginal.setDescripcion(contrato.getDescripcion());
        return contratoService.save(contratoOriginal);
    }

    @DeleteMapping("/rol/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        contratoService.delete(id);
    }
}
