package com.cowboybepop.adapter.in.web.v1;

import com.cowboybepop.adapter.in.web.response.InfoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/api/v1","api/v1","/info"})
public interface InfoController {

    @GetMapping
    ResponseEntity<InfoResponse> getInfo();
}
