package inpecable.inpecableSpring.modelo.service;

import inpecable.inpecableSpring.modelo.Ticket;
import inpecable.inpecableSpring.modelo.dao.ITicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketServiceImpl implements ITicketService{
    @Autowired
    private ITicketDao ticketDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ticket> findAll() {
        return (List<Ticket>) ticketDao.findAll();
    }
}