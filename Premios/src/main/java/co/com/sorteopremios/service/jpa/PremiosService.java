package co.com.sorteopremios.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sorteopremios.entity.Premio;
import co.com.sorteopremios.repository.PremioRepository;
import co.com.sorteopremios.service.IPremiosService;

@Service
public class PremiosService implements IPremiosService {
    @Autowired
    private PremioRepository repoPremios;

    @Override
    public List<Premio> buscarTodos() {

        return repoPremios.findAll();
    }

    @Override
    public void guardar(Premio premio) {
        repoPremios.save(premio);
    }

}
