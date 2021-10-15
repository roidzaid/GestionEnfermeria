package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.models.MarcasModel;
import com.ItRoid.GestionEnfermeria.repositories.MarcaRepository;
import com.ItRoid.GestionEnfermeria.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService<MarcasModel> {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<String> getMarcas() throws Exception {

        List<String> list = this.marcaRepository.findMarcas();

        return list;


    }
}
