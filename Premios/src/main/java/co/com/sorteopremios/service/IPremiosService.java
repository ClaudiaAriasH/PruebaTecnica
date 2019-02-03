package co.com.sorteopremios.service;

import java.util.List;

import co.com.sorteopremios.entity.Premio;

public interface IPremiosService {

    List<Premio> buscarTodos();

    void guardar(Premio premio);

}
