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
                new Vizitka("Monika Ptáčníková", "Czechitas.cz", "Václavské nám. 837/11", "11000 Praha 1", "monika@czechitas.cz", "+420 800 123 456", "www.czechitas.cz"),
                new Vizitka("Jan Nováková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "", "+420 800 123 456", "www.czechitas.cz"),
                new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "mirka@czechitas.cz", "", "www.czechitas.cz")
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
