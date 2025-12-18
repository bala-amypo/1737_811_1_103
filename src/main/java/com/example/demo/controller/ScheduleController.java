import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController{
    @PostMapping("/generate/{date}")
    public String generateSchedule(@PathVariable String date){
        return "Schedule generated for "+date;
    }
    @GetMapping("/date/{date}")
    public String get(@PathVariable Long employeeId){
        return "Availability of employee "+employeeId;
    }
    @GetMapping("/{availabilityId}")
    public String getSpecificAvailability(@PathVrariable Long availabilityId){
        return "Availability record "+availabilityId;
    }
    @GetMapping("/date/{date}")
    public String getAvailabilityByDate(@PathVariable String date){
        return "Availability on "+date;
    
}

