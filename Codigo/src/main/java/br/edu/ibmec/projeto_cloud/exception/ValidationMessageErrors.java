package br.edu.ibmec.projeto_cloud.exception;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ValidationMessageErrors {
    private String message = "Existem erros na requisição";  // Mensagem para indicar que existem erros
    private List<ValidationError> errors = new ArrayList<>();  // Lista de erros de validação
    
    // Método para adicionar um erro à lista de erro
    public void addError(String field, String errorMessage) {
        ValidationError error = new ValidationError();
        error.setField(field);
        error.setMessage(errorMessage);
        errors.add(error);
    }
}