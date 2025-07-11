package com.alulacursos.screenmatch.excepsion;

public class ErrorDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
