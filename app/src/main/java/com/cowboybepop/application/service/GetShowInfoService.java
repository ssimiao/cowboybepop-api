package com.cowboybepop.application.service;

import com.cowboybepop.adapter.in.web.response.InfoResponse;
import com.cowboybepop.application.port.in.GetShowInfoUseCase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetShowInfoService implements GetShowInfoUseCase {

    @Override
    public InfoResponse execute() {
        var genres = List.of("Space Western", "Comedy", "Crime fiction");
        var release = "October 24, 1998 - April 24, 1999";
        var name = "Cowboy Bepop";
        var creator = "Shinichirō Watanabe";
        var episodes = 26;
        return new InfoResponse(name, genres, creator, episodes, release);
    }
}
