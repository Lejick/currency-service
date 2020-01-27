package portal.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import portal.model.DataService;

@Controller
public class UploadController {

    private final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);
    public static final String UPLOAD_FORM = "uploadForm";
    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String index(Model model) {

        return UPLOAD_FORM;
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

    @PostMapping("/uploadForm")
    public String imagesUpload(@RequestParam(name="files",required=false) MultipartFile[] files ,
                               @RequestParam(name="json",required=false) String json,
                               @RequestParam(name="url",required=false) String url,
                               RedirectAttributes redirectAttributes) {

        return "redirect:/uploadStatus";
    }


}