package inpecable.inpecableSpring.modelo.service;

import inpecable.inpecableSpring.modelo.Servicio;
import inpecable.inpecableSpring.modelo.dao.IServicioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicioServiceImpl implements IServicioService{
    @Autowired
    private IServicioDao servicioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Servicio> findAll() {
        return (List<Servicio>) servicioDao.findAll();
    }
}
