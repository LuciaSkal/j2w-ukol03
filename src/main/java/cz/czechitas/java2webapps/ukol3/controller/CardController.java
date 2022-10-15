package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller()
@RequestMapping("/")
public class CardController {
  private final List<Card> listOfParticipants = List.of(
          new Card("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", "Praha", "11000","dita@czechitas.cs", "+420 800123456","www.czechitas.cz" ),
          new Card("Lucia Skalinova", "Barclays", "Na Pankráci 1683/127", "Praha",  "14000", null, "+420 800123456", "www.barclays.com"),
          new Card("Judita Hromjakova", "Relax Karluvka", "Nosovice 13", "Nosovice", "73951", null, "+420 800123456", "www.relax-karluvka.cz"),
          new Card("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "Praha", "11000", "mirka@czechitas.cs", null, "www.czechitas.cz")
  );
  @GetMapping("/")
  public ModelAndView getList() {
    ModelAndView result = new ModelAndView("/card");
    result.addObject("participants", listOfParticipants);
    return result;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView getDetail(@PathVariable int id) {
    ModelAndView result = new ModelAndView("/detail");
    result.addObject("participant", listOfParticipants.get(id));
    return result;
  }

}
