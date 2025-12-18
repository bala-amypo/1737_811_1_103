import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/templates")
public class ShiftTemplateController{
    @PostMapping("/department/{departmentId}")
    public String createTemplate(@PathVariable Long departmentId){
        return "Shift template created for department "+departmentId;
    }
    @GetMapping("/department/{departmentId}")
    public String listTemplates(@PathVariable Long departmentId){
        return "List of employees";
    }
    @GetMapping("/{id}")
    public String getById(@PathVrariable Long id){
        return "Employee "+id;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return "Deleted employee "+id;
    }
}

