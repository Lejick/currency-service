package portal.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import portal.model.DataService;

@Controller
public class ExchangeController {

    private final Logger LOGGER = LoggerFactory.getLogger(ExchangeController.class);
    public static final String UPLOAD_FORM = "uploadForm";
    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String index(Model model) {
        return UPLOAD_FORM;
    }


    @GetMapping("/exchangeRate")
    public String exchangeRate( @RequestParam(name="amount",required=false) String amount) {
        return amount+"rate";
    }


}