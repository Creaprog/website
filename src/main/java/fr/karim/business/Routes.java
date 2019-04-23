package fr.karim.business;

import fr.karim.form.FormAccount;
import fr.karim.model.Account;
import fr.karim.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Routes {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("formAccount", new FormAccount());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String homeForm(Model model, @ModelAttribute("accountForm") FormAccount accountForm) {
        Account account = new Account();

        account.setDescription(accountForm.getDescription());
        account.setEmail(accountForm.getEmail());
        account.setNom(accountForm.getNom());
        account.setPrenom(accountForm.getPrenom());
        account.setTel(accountForm.getTel());
        account.setTypeProject(accountForm.getTypeProject());

        accountRepository.save(account);
        return "redirect:/";
    }
}