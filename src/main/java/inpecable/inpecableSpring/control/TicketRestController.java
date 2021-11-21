package inpecable.inpecableSpring.control;

import inpecable.inpecableSpring.modelo.Ticket;
import inpecable.inpecableSpring.modelo.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TicketRestController {
    @Autowired
    private ITicketService ticketService;

    @GetMapping("/ticket")
    public List<Ticket> listar(){
        return ticketService.findAll();
    }

    @GetMapping("/ticket/{id}")
    public Ticket mostrar(@PathVariable Long id){
        return ticketService.findById(id);
    }

    @PostMapping("/ticket/")
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket crear(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }

    @PutMapping("/ticket/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket actualizar(@RequestBody Ticket ticket, @PathVariable Long id){
        Ticket ticketOriginal = ticketService.findById(id);
        ticketOriginal.setDescripcionTicket(ticket.getDescripcionTicket());
        return ticketService.save(ticketOriginal);
    }

    @DeleteMapping("/ticket/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        ticketService.delete(id);
    }
}