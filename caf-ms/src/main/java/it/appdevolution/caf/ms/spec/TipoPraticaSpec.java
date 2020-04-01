package it.appdevolution.caf.ms.spec;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import it.appdevolution.caf.ms.entity.TipoPratica;
import it.appdevolution.caf.ms.util.MapUtils;


public class TipoPraticaSpec extends AbstractSpecification implements Specification<TipoPratica> {

    private static final long serialVersionUID = 1;
    
    public TipoPraticaSpec(Map<String, Object> criteriaMap) {
        super(criteriaMap);
    }

    public TipoPraticaSpec(Map<String, Object> criteriaMap, List<Map<String, String>> order) {
    	super(criteriaMap , order);
	}

	@Override
    protected void customOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder, List<Map<String, String>> order) {

    	if (order != null && !order.isEmpty() ) {
    		List <Order> orderList = new ArrayList<Order>();
    		for (Map<String, String> orderElement : order) {
    			switch (orderElement.get("column")) {
        		case "descrizione":
        			if (orderElement.get("dir").equalsIgnoreCase((ASC))) {
        				orderList.add(criteriaBuilder.asc(root.get("descrizione")));
        			} else {
        				orderList.add(criteriaBuilder.desc(root.get("descrizione")));
        			}
        			break;
        		case "nome":
        			if (orderElement.get("dir").equalsIgnoreCase((ASC))) {
        				orderList.add(criteriaBuilder.asc(root.get("nome")));
        			} else {
        				orderList.add(criteriaBuilder.desc(root.get("nome")));
        			}
        			break;
                case "codice":
                    if (orderElement.get("dir").equalsIgnoreCase((ASC))) {
                        orderList.add(criteriaBuilder.asc(root.get("codice")));
                    } else {
                        orderList.add(criteriaBuilder.desc(root.get("codice")));
                    }
                    break;
    			default: 
        			if (orderElement.get("dir").equalsIgnoreCase((ASC))) {
        				orderList.add(criteriaBuilder.asc(root.get("nome")));
        			} else {
        				orderList.add(criteriaBuilder.desc(root.get("nome")));
        			}
        			break;    				
    			}
    		}
    		query.orderBy(orderList);
		} 
    }

    @Override
    protected void defaultOrder(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		List <Order> orderList = new ArrayList<Order>();
		orderList.add(criteriaBuilder.asc(root.get("nome")));
    	query.orderBy(orderList);    	
    }

    @Override
    public Predicate toPredicate(Root<TipoPratica> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
    	this.selectOrder(root, query, criteriaBuilder);
        List<Predicate> predicates = new ArrayList<>();

        if (criteriaMap != null && !criteriaMap.isEmpty()) {
        	

//            String fullTextSearch =  MapUtils.getValue(criteriaMap, "fullTextSearch");
//            fullTextSearch = fullTextSearch.toUpperCase();
//            if (!fullTextSearch.isEmpty()) {
//                Predicate p1 = criteriaBuilder.like(criteriaBuilder.upper(root.<String>get("descTipiElabStip")), "%" + fullTextSearch + "%");
//                Predicate p2 = criteriaBuilder.like(criteriaBuilder.upper(root.<String>get("codiTipiElabStip")), "%" + fullTextSearch + "%");
//                Predicate p3 = criteriaBuilder.like(criteriaBuilder.function("to_char", String.class, root.get("dataInizioRecord"), criteriaBuilder.literal("DD/MM/YYYY")), "%" + fullTextSearch + "%");
//                Predicate p4 = criteriaBuilder.like(criteriaBuilder.function("to_char", String.class, root.get("dataFineRecord"), criteriaBuilder.literal("DD/MM/YYYY")), "%" + fullTextSearch + "%");
//                Predicate orP = criteriaBuilder.or(p1, p2, p3, p4);
//                predicates.add(orP);
//            }

        	String fullTextNameSearch =  MapUtils.getValue(criteriaMap, "fullTextNameSearch");
			fullTextNameSearch = fullTextNameSearch.toUpperCase();
			String[] split = fullTextNameSearch.split(" ");
			ArrayList<String> stringPart = new ArrayList<String>(Arrays.asList(split));
			if (!stringPart.isEmpty()) {
			  for (String string : stringPart) {
				  Predicate p = criteriaBuilder.like(criteriaBuilder.upper(root.<String>get("name")), "%" + string + "%");
				  predicates.add(p);
			  }
			}
        	
        	String codice = MapUtils.getValue(criteriaMap, "codice");
        	if (!codice.isEmpty()) {
        	    Predicate p = criteriaBuilder.equal(criteriaBuilder.upper(root.get("codice")), codice.toUpperCase());
                predicates.add(p);
        	}
        	String nome = MapUtils.getValue(criteriaMap, "nome");
        	if (!nome.isEmpty()) {
        	    Predicate p = criteriaBuilder.like(criteriaBuilder.upper(root.get("nome")), "%" + nome.toUpperCase() + "%");
                predicates.add(p);
        	}
        	String descrizione = MapUtils.getValue(criteriaMap, "descrizione");
        	if (!descrizione.isEmpty()) {
                Predicate p = criteriaBuilder.like(criteriaBuilder.upper(root.<String>get("descrizione")), "%" + descrizione.toUpperCase() + "%");
                predicates.add(p);
        	}
        	String abilitata = MapUtils.getValue(criteriaMap, "abilitata");
        	if (!abilitata.isEmpty()) {
        		if (abilitata.equalsIgnoreCase("true") || abilitata.equalsIgnoreCase("false")) {
        			Predicate p = criteriaBuilder.equal(root.get("abilitata"), new Boolean(abilitata));
        			predicates.add(p);
        		}         	
        	}
        	
//            String dataInizioRecord = MapUtils.getValue(criteriaMap, "dataInizioRecord");
//            Date dateInizioRecord;
//            if (!dataInizioRecord.isEmpty()) {
//                dateInizioRecord = PrevUtils.parseDateString(dataInizioRecord);
//                if (dateInizioRecord  == null) {
//                    throw new PrevValidationException("DataInizioRecord '" + dataInizioRecord + "' non valida","dataInizioRecord");
//                }
//                Predicate p = criteriaBuilder.greaterThanOrEqualTo(root.get("dataInizioRecord"), dateInizioRecord);
//                predicates.add(p);
//            }
//
//            String dataFineRecord =  MapUtils.getValue(criteriaMap, "dataFineRecord");
//            Date dateFineRecord;
//            if (!dataFineRecord.isEmpty()) {
//                dateFineRecord = PrevUtils.parseDateString(dataFineRecord);
//                if (dateFineRecord  == null) {
//                    throw new PrevValidationException("DataFineRecord '" + dataFineRecord + "' non valida","dataFineRecord");
//                }
//                LocalDateTime localDateTime = dateFineRecord.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//                localDateTime = localDateTime.plusDays(1);
//                dateFineRecord = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
//                Predicate p = criteriaBuilder.lessThanOrEqualTo(root.get("dataFineRecord"), dateFineRecord);
//                predicates.add(p);
//            }
       	
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }

    @Override
    protected void initJoinTable(Root<?> root) {
    }

}
