package io.github.sephnescence.learningspringboot3ch4.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final YouTube youTube;

    public HomeController (YouTube youTube) {
        this.youTube = youTube;
    }

    @GetMapping
    String index(Model model) {
        model.addAttribute("channelVideos", youTube.channelVideos("UCuZZMZI-Gyo_jnfRu7Q-0Lg", 10, YouTube.Sort.VIEW_COUNT));

        return "index";
    }
}
