package api.documentation.swagger.web;

import api.documentation.swagger.domain.hero.HeroRepository;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. Hero"})
@RestController
@AllArgsConstructor
public class WebRestController {

    private HeroRepository heroRepository;

}
