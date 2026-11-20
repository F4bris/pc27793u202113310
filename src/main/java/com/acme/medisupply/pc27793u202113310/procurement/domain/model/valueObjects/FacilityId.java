package com.acme.medisupply.pc27793u202113310.procurement.domain.model.valueObjects;

import java.util.UUID;

public record FacilityId(UUID value) {
    public FacilityId {
        if(value == null)
            throw new IllegalArgumentException("facilityId.required");
    }
}
