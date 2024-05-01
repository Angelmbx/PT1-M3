package com.example.M3PruebaTecnica.service;

import com.example.M3PruebaTecnica.api.ILenguageService;
import com.example.M3PruebaTecnica.model.Lenguage;
import com.example.M3PruebaTecnica.model.dao.LenguageDao;
import com.example.M3PruebaTecnica.model.dto.LenguageDTO;
import com.example.M3PruebaTecnica.model.dto.dtoMapper.LenguageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("LenguageService")
@Lazy
public class LenguageService implements ILenguageService {

    @Autowired
    private LenguageDao lenguageDao;

    @Override
    public LenguageDTO queryLenguage(LenguageDTO lenguageDTO) {
        Lenguage lenguage = LenguageMapper.INSTANCE.toEntity(lenguageDTO);
        return LenguageMapper.INSTANCE.toDTO(lenguageDao.getReferenceById(lenguage.getId()));
    }

    @Override
    public List<LenguageDTO> queryAllLenguages() {
        return LenguageMapper.INSTANCE.toDTOList(lenguageDao.findAll());
    }

    @Override
    public int insertLenguage(LenguageDTO lenguageDTO) {
        Lenguage lenguage = LenguageMapper.INSTANCE.toEntity(lenguageDTO);
        try{
            lenguageDao.saveAndFlush(lenguage);
            return 0;
        } catch (Exception ex) {
            return 1;
        }


    }

    @Override
    public int updateLenguage(LenguageDTO lenguageDTO) {
        return insertLenguage(lenguageDTO);
    }

    @Override
    public int deleteLenguage(LenguageDTO lenguageDTO) {
        int id = lenguageDTO.getId();

        Lenguage lenguage = LenguageMapper.INSTANCE.toEntity(lenguageDTO);
        lenguageDao.delete(lenguage);
        return id;
    }
}
