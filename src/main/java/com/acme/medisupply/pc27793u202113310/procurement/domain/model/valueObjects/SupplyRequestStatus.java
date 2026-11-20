package com.acme.medisupply.pc27793u202113310.procurement.domain.model.valueObjects;

import java.util.Locale;

public enum SupplyRequestStatus {
    PENDING,
    APPROVED,
    FULFILLED,
    CANCELLED;

    public static SupplyRequestStatus fromText(String value){
        if(value == null || value.isBlank())
            return PENDING;
        try {
            return valueOf(value.trim().toUpperCase(Locale.ROOT));
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("supplyRquestStatus.invalid");
        }
    }
}
