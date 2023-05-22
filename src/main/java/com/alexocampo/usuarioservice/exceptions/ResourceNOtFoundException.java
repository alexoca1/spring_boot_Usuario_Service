package com.alexocampo.usuarioservice.exceptions;

public class ResourceNOtFoundException extends RuntimeException {

    public ResourceNOtFoundException() {
        super("Recurso no encontrado en el servidor");
    }

    public ResourceNOtFoundException(String message) {

        super(message);
    }


}
