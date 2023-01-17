package com.cowboybepop.adapter.in.web.response;

import java.util.List;

public record InfoResponse(String name, List<String> genres, String creator, Integer episodes, String release) {

}
