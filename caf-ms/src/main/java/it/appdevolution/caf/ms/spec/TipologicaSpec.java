//package it.appdevolution.caf.ms.spec;
//
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.data.rest.core.util.MapUtils;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//public class TipologicaSpec<T> extends AbstractSpecification implements Specification<T>{
//
//	protected String entityName;
//	
//	protected Class<T> clazz;
//
//    public TipologicaSpec(Map<String, Object> criteriaMap, Class<T> clazz) {
//    	super(criteriaMap);
//    	this.clazz = clazz;
//    	this.entityName = clazz.getName();
//    }
//
//	public TipologicaSpec(Map<String, Object> criteriaMap, Class<T> clazz, List<Map<String, String>> order) {
//		super(criteriaMap, order);
//		this.clazz = clazz;
//		this.entityName = clazz.getName();
//	}
//
//    @Override
//    protected void customOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder, List<Map<String, String>> order) {
//
//    }
//
//    @Override
//    protected void defaultOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//
//    }
//
//    @Override
//    protected void initJoinTable(Root<?> root) {
//    }
//
//    @Override
//    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//        this.selectOrder(root, query, criteriaBuilder);
//        List<Predicate> predicates = new ArrayList<>();
//        
//        if (criteriaMap != null && !criteriaMap.isEmpty()) {
//
//            String nomeCampoDescrizione = MapUtils.getValue(criteriaMap, "nomeCampoDescrizione");
//            String descrizione = MapUtils.getValue(criteriaMap, nomeCampoDescrizione);
//            if (!descrizione.isEmpty()) {
//                Predicate p = criteriaBuilder.like(criteriaBuilder.upper(root.<String>get(nomeCampoDescrizione)), "%" + descrizione.toUpperCase() + "%");
//                predicates.add(p);
//            }
//            
//            Boolean valid = new Boolean(MapUtils.getValue(criteriaMap, "valid"));
//            if (valid) {
//            	Date today = PrevUtils.getCurrentDate(); 
//		        if (BaseEntityNormal.class.isAssignableFrom(clazz)) {
//		        	Predicate p1 = criteriaBuilder.lessThanOrEqualTo(root.<Date>get("dataInizioRecord"), today);
//		        	predicates.add(p1);
//		        	Predicate p2 = criteriaBuilder.greaterThanOrEqualTo(root.<Date>get("dataFineRecord"), today);
//		        	predicates.add(p2);
//
//		        } else if (BaseEntityHistoric.class.isAssignableFrom(clazz)) {
//		        	Predicate p1 = criteriaBuilder.lessThanOrEqualTo(root.<Date>get("dataInizioValidita"), today);
//		        	predicates.add(p1);
//		        	Predicate p2 = criteriaBuilder.greaterThanOrEqualTo(root.<Date>get("dataFineValidita"), today);
//		        	predicates.add(p2);
//		        }				
//			}
//        }
//        
//        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
//    }
//    
//    public void addCriteria(String name, String value) {
//    	this.criteriaMap.put(name, value);    	
//    }
//    
//	public Map<String, Object> getCriteriaMap() {
//		return criteriaMap;
//	}
//
//	public void setCriteriaMap(Map<String, Object> criteriaMap) {
//		this.criteriaMap = criteriaMap;
//	}
//
//	public String getEntityName() {
//		return entityName;
//	}
//
//	public void setEntityName(String entityName) {
//		this.entityName = entityName;
//	}
//}
