package inpecable.inpecableSpring.modelo.service;

import inpecable.inpecableSpring.modelo.Contrato;
import inpecable.inpecableSpring.modelo.dao.IContratoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContratoServiceImpl implements IContratoService {
    @Autowired
    private IContratoDao contratoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Contrato> findAll() {
        return (List<Contrato>) contratoDao.findAll();
    }

}
