package inpecable.inpecableSpring.modelo.service;

import inpecable.inpecableSpring.modelo.PagoContrato;
import inpecable.inpecableSpring.modelo.dao.IPagoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PagoContratoServiceImpl implements IPagoContratoService{

    @Autowired
    private IPagoDao pagoDao;

    @Override
    @Transactional(readOnly = true)
    public List<PagoContrato> findAll() {
        return (List<PagoContrato>) pagoDao.findAll();
    }
}

