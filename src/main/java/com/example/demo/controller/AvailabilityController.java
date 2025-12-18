import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/availability")
public class AvailabilityController{
    @PostMapping("/{employeeId}")
    public String setAvailability(@PathVariable Long employeeId){
        return "Availability set for employee "+employeeId;
    }
    @GetMapping("/employee/{employeeId}")
    public String getEmployeeAvailability(@PathVariable Long employeeId){
        return "Availability of employee "+employeeId;
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

