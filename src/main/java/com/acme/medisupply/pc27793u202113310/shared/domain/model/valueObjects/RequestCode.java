package com.acme.medisupply.pc27793u202113310.shared.domain.model.valueObjects;

public record RequestCode(String code) {
    public RequestCode{
        if(code == null || code.isBlank())
            throw new IllegalArgumentException("requestCode.required");
    }
}
