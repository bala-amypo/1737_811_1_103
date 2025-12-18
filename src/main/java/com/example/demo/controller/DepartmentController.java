import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController{
    @PostMapping
    public String createDepartment(){
        return "Department created";
    }
    @GetMapping
    public String getAllDepartments(){
        return "All departments";
    }
    @GetMapping("/{id}")
    public String getDepartment(@PathVrariable Long id){
        return "Department "+id;
    }
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id){
        return "Deleted department "+id;
    }
}

