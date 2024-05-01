package com.example.M3PruebaTecnica.model.dto.dtoMapper;

import com.example.M3PruebaTecnica.model.Lenguage;
import com.example.M3PruebaTecnica.model.dto.LenguageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface LenguageMapper {

    LenguageMapper INSTANCE = Mappers.getMapper(LenguageMapper.class);
    LenguageDTO  toDTO(Lenguage lenguage);
    List<LenguageDTO> toDTOList(List<Lenguage> lenguages);
    Lenguage toEntity(LenguageDTO lenguageDTO);

}
