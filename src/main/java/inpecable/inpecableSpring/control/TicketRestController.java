package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.Ticket;
import inpecable.inpecableSpring.modelo.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TicketRestController {
    @Autowired
    private ITicketService ticketService;

    @GetMapping("/tickets")
    public List<Ticket> listar() {
        return ticketService.findAll();
    }

    @PostMapping("/tickets")
    private String mensaje() {
        return "Desde la peticion del POST";
    }
}