package com.cowboybepop.adapter.in.web.v1.impl;

import com.cowboybepop.adapter.in.web.response.InfoResponse;
import com.cowboybepop.adapter.in.web.v1.InfoController;
import com.cowboybepop.application.port.in.GetShowInfoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoControllerImpl implements InfoController {

    @Autowired
    private GetShowInfoUseCase getShowInfoUseCase;

    public ResponseEntity<InfoResponse> getInfo() {
        InfoResponse response = getShowInfoUseCase.execute();
        return ResponseEntity.ok(response);
    }
}
