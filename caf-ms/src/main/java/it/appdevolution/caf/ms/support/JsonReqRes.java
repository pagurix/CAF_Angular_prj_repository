package it.appdevolution.caf.ms.support;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class JsonReqRes {
    
	//request data
    private Integer elementForPage;
    private Integer currentPage;
    private Map<String, Object> searchFilters;
    private List<Map<String, String>> order;
    
    //response data
    private List<?> list;
    private Integer totalPages;
    private Long totalElements;

}
