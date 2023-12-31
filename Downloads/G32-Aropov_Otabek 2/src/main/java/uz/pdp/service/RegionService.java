package uz.pdp.service;

import uz.pdp.entity.Region;
import uz.pdp.payload.RegionDTO;


import java.util.List;

public interface RegionService {

    List<RegionDTO> all();

    RegionDTO add(RegionDTO genreDTO);

    RegionDTO edit(RegionDTO regionDTO, Integer id);

    boolean delete(Integer id);

    Region getByIdOrElseThrow(Integer id);

}
