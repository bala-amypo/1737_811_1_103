package com.example.demo.dto;

import java.time.LocalDate;

public class AvailabilityDto {

    private boolean available;
    private LocalDate availableDate;

    public AvailabilityDto() {
    }

    public AvailabilityDto(boolean available, LocalDate availableDate) {
        this.available = available;
        this.availableDate = availableDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(LocalDate availableDate) {
        this.availableDate = availableDate;
    }
}
