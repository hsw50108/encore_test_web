package org.example.mvc.service.util;

import org.example.mvc.domain.dto.RequestUserDTO;
import org.example.mvc.domain.dto.ResponseUserDTO;

import java.util.List;

public interface MvcService {
    void join();

    ResponseUserDTO login(RequestUserDTO requestUserDTO);

    void update();

    void delete();

    List<ResponseUserDTO> select();
}
