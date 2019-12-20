package api.documentation.swagger.web;

import api.documentation.swagger.domain.hero.Hero;
import api.documentation.swagger.domain.hero.HeroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"1. Hero"})
@RestController
@AllArgsConstructor
public class WebRestController {

    private HeroRepository heroRepository;

    @ApiOperation(value = "save", notes = "github.com/hong-il")
    @PostMapping("/save")
    public Hero HeroSaveRequest(@RequestParam String name,
                                @RequestParam int age,
                                @RequestParam String note) {
        return heroRepository.save(Hero.builder()
                .name(name)
                .age(age)
                .note(note)
                .build());
    }

    @ApiOperation(value = "findAll", notes = "github.com/hong-il")
    @GetMapping("/findAll")
    public List<Hero> HeroFindAllResponse() {
        return heroRepository.findAll();
    }

    @ApiOperation(value = "update", notes = "github.com/hong-il")
    @PutMapping("/update")
    public Hero HeroUpdateRequest(@RequestParam Long id,
                                  @RequestParam String name,
                                  @RequestParam int age,
                                  @RequestParam String note) {
        return heroRepository.save(Hero.builder()
                .id(id)
                .name(name)
                .age(age)
                .note(note)
                .build());
    }
}
