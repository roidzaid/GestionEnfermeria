package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.models.LoteModel;
import com.ItRoid.GestionEnfermeria.models.VacunaModel;
import com.ItRoid.GestionEnfermeria.repositories.VacunaRepository;
import com.ItRoid.GestionEnfermeria.services.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VacunaSerciveImpl implements VacunaService<VacunaModel> {

    @Autowired
    private VacunaRepository vacunaRepository;

    @Override
    public List<String> getVacunas() throws Exception {

        List<String> list = this.vacunaRepository.findVacunas();

        return list;

    }

    @Override
    public List<String> getDosis(String vacuna) throws Exception {

        List<String> list = this.vacunaRepository.findDosis(vacuna);

        return list;

    }
}
