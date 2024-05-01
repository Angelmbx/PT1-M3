package com.example.M3PruebaTecnica.api;

import com.example.M3PruebaTecnica.model.dto.LenguageDTO;

import java.util.List;

public interface ILenguageService {

    //CRUD Operations
    LenguageDTO queryLenguage(LenguageDTO lenguageDTO);
    List<LenguageDTO> queryAllLenguages();
    int insertLenguage(LenguageDTO lenguageDTO);
    int updateLenguage(LenguageDTO lenguageDTO);
    int deleteLenguage(LenguageDTO lenguageDTO);

}
