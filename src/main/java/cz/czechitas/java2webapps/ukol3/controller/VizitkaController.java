package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Dita Formánková", "Czechitas.cz", "Václavské nám. 837/11", "11000 Praha 1", "dita@czechitas.cz", "+420 800 123 456", "www.czechitas.cz"),
            new Vizitka("Monika Ptáčníková", "Czechitas.com", "Václavské nám. 837/11", "11000 Praha 1", "monika@czechitas.cz", "+420 800 123 456", "www.czechitas.cz"),
            new Vizitka("Jan Nováková", "Czechitas z. s.", "Nikoly Tesly 1097/14", "16000 Praha 6", null, "+420 800 123 456", "www.czechitas.cz"),
            new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", null, "11000 Praha 1", "mirka@czechitas.cz", null, "www.czechitas.cz"),
            new Vizitka("Petra Ptáčková", null, "Václavské náměstí 837/11", "11000 Praha 1", "petra@czechitas.cz", null, "www.czechitas.cz"),
            new Vizitka("Olga Titzenthalerová", "Aprea s.r.o.", "Na Švihance 1476/1", "12000 Praha 2", "olga.t@aprea.cz", null, "www.aprea.cz")
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("seznamVizitek", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/{index}") //index do slozenych zavorek

    public ModelAndView detail(@PathVariable int index) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(index));
        return modelAndView;
    }

}