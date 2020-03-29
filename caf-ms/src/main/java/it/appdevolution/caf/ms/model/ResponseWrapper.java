package it.appdevolution.caf.ms.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseWrapper<T> {

    private boolean esito;
    private Integer httpErrorCode;
    private String successMessage;
    private T result;
    private List<String> validationErrors = new ArrayList<>();    
    
}