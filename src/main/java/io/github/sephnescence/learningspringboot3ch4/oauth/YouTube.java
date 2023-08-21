package io.github.sephnescence.learningspringboot3ch4.oauth;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.Map;

interface YouTube {
    // Exchange Filter functions
    // We're using GetExchange here to alter the outgoing URL to the api
    // There are also PostExchanges which will utilise having bodies in the request
    @GetExchange("/search?part=snippet&type=video")
    SearchListResponse channelVideos(
            @RequestParam String channelId,
            @RequestParam int maxResults,
            @RequestParam Sort order
    );

    enum Sort {
        DATE("date"),
        VIEW_COUNT("viewCount"),
        TITLE("title"),
        RATING("rating");

        private final String type;

        Sort(String type) {
            this.type = type;
        }
    }
}
