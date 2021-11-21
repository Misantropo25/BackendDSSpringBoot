package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.PagoContrato;
import inpecable.inpecableSpring.modelo.service.IPagoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class PagoContratoRestController {
    @Autowired
    private IPagoContratoService pagoContratoService;

    @GetMapping("/pago")
    public List<PagoContrato> listar(){
        return pagoContratoService.findAll();
    }

    @GetMapping("/pago/{id}")
    public PagoContrato mostrar(@PathVariable Long id){
        return pagoContratoService.findById(id);
    }

    @PostMapping("/pago/")
    @ResponseStatus(HttpStatus.CREATED)
    public PagoContrato crear(@RequestBody PagoContrato pagoContrato){
        return pagoContratoService.save(pagoContrato);
    }

    @PutMapping("/pago/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PagoContrato actualizar(@RequestBody PagoContrato pagoContrato, @PathVariable Long id){
        PagoContrato pagoContratoOriginal = pagoContratoService.findById(id);
        pagoContratoOriginal.setEstadoPago(pagoContrato.getEstadoPago());
        return pagoContratoService.save(pagoContratoOriginal);
    }

    @DeleteMapping("/pago/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        pagoContratoService.delete(id);
    }


}