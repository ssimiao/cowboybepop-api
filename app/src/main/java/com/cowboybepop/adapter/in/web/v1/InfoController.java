package com.cowboybepop.adapter.in.web.v1;

import com.cowboybepop.adapter.in.web.response.InfoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public interface InfoController {

    @GetMapping
    ResponseEntity<InfoResponse> getInfo();
}
