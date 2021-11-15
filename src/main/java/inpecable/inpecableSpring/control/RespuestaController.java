package inpecable.inpecableSpring.control;


import inpecable.inpecableSpring.modelo.Respuesta;
import inpecable.inpecableSpring.modelo.service.IRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RespuestaController {
    @Autowired
    private IRespuestaService respuestaService;

    @GetMapping("/respuestas")
    public List<Respuesta> listar(){
        return respuestaService.findAll();
    }

    @PostMapping("/respuestas")
    private String mensaje(){
        return "Desde peticion POST";
    }

}
