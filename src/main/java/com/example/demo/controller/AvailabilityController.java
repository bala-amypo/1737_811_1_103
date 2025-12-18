import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/{availabilityId}")
    public String getSpecificAvailability(@PathVrariable Long availabilityId){
        return "Availability record "+availabilityId;
    }
    @GetMapping("/date/{date}")
    public String delete(@PathVariable Long id){
        return "Deleted employee "+id;
    }
}

