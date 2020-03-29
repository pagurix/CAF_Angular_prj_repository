package it.appdevolution.caf.ms.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@Component
public class JsonReqRes {
    
	//request data
    private int elementForPage;
    private int currentPage;
    private Map<String, Object> searchFilters;
    private List<Map<String, String>> order;
    
    //response data
    private List<?> list;
    private int totalPages;
    private long totalElements;

}
