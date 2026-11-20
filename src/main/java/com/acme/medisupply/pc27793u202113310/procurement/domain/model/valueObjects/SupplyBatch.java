package com.acme.medisupply.pc27793u202113310.procurement.domain.model.valueObjects;

public record SupplyBatch(Integer quantity, String unit) {

    public SupplyBatch{
        if(unit == null || unit.isBlank())
            throw new IllegalArgumentException("supplyBatch.required");

        if(quantity <= 0)
            throw new IllegalArgumentException("supplyBatch.invalid");
    }

    public SupplyBatch addUnits(Integer additionalQuantity){
        if(additionalQuantity == null || additionalQuantity <= 0)
            throw new IllegalArgumentException("supplyBtach.additionalQuantity.invalid");

        if(this.quantity > Integer.MAX_VALUE - additionalQuantity)
            throw new IllegalArgumentException("supplyBatch.quantity.invalid");

        return new SupplyBatch(this.quantity + additionalQuantity, this.unit);
    }

}
