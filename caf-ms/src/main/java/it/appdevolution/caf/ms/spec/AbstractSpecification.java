package it.appdevolution.caf.ms.spec;

import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractSpecification {

    protected static final String SORT_COLUMN = "sortColumn";
    protected static final String SORT_DIRECTION = "sortDirection";
    protected static final String ASC = "asc";
    protected static final String DESC = "desc";

    protected final String DATA_FINE_RECORD = "dataFineRecord";

    protected final String DATA_INIZIO_RECORD = "dataInizioRecord";

    protected final String DATA_ULTIMA_MODIFICA = "dataUltimaModifica";
	
    protected final String UTENTE_ULTIMA_MODIFICA = "";
    
    protected Map<String, Object> criteriaMap;

    protected  List<Map<String, String>> order;

    public AbstractSpecification(){}
    
    public AbstractSpecification(Map<String, Object> criteriaMap) {
        this.criteriaMap = criteriaMap;
    }

    public AbstractSpecification(Map<String, Object> criteriaMap, List<Map<String, String>> order) {
        this.criteriaMap = criteriaMap;
        this.order = order;
    }

    protected void selectOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        this.initJoinTable(root);        
        if (order != null && !order.isEmpty()) {
        	this.customOrder(root, query, criteriaBuilder, order);        
        } else {
            this.defaultOrder(root, query, criteriaBuilder);
        }
    }

    protected abstract void customOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder, List<Map<String, String>> order);

    protected abstract void defaultOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder);

    protected abstract void initJoinTable(Root<?> root);
    
}