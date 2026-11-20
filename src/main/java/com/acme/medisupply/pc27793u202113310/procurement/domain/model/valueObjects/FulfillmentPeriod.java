package com.acme.medisupply.pc27793u202113310.procurement.domain.model.valueObjects;

import java.time.LocalDate;
import java.util.Objects;

public record FulfillmentPeriod(LocalDate startDate, LocalDate endDate) {

    public FulfillmentPeriod {
        if (startDate == null) {
            throw new IllegalArgumentException("FulfillmentPeriod.startDate.invalid");
        }
        if (endDate == null) {
            throw new IllegalArgumentException("FulfillmentPeriod.endDate.invalid");
        }
        if (!endDate.isAfter(startDate)) {
            throw new IllegalArgumentException("FulfillmentPeriod.invalid");
        }
    }

    public boolean contains(LocalDate checkDate) {
        if (checkDate == null) {
            throw new IllegalArgumentException("FulfillmentPeriod.checkDate.invalid");
        }
        return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FulfillmentPeriod that)) return false;
        return Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }
}
