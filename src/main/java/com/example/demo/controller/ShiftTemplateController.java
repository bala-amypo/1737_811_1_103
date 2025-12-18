import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/templates")
public class ShiftTemplateController{
    @PostMapping("/department/{departmentId}")
    public String createTemplate(@PathVariable Long departmentId){
        return "Shift template created for department "+ departmentId;
    }
    @GetMapping("/department/{departmentId}")
    public String listTemplates(@PathVariable Long departmentId){
        return "Templates for department "+ departmentId;
    }
    @GetMapping("/{id}")
    public String getTemplate(@PathVrariable Long id){
        return "Template "+id;
    }
   
}

