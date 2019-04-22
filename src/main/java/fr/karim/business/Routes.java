package fr.karim.business;

import fr.karim.form.FormAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Routes {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String  home(Model model) {
        model.addAttribute("formAccount", new FormAccount());
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String homeForm(Model model, @ModelAttribute("accountForm") FormAccount accountForm) {
        return "redirect:/";
    }
}