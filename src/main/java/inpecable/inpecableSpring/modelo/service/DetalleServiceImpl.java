package inpecable.inpecableSpring.modelo.service;

import inpecable.inpecableSpring.modelo.DetalleServicio;
import inpecable.inpecableSpring.modelo.dao.IDetalleServicioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetalleServiceImpl implements IDetalleService {
    @Autowired
    private IDetalleServicioDao detalleServicioDao;

    @Override
    @Transactional(readOnly = true)
    public List<DetalleServicio> findAll() {
        return (List<DetalleServicio>) detalleServicioDao.findAll();
    }

}
