package it.appdevolution.caf.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import it.appdevolution.caf.ms.dao.TipoPraticaDao;
import it.appdevolution.caf.ms.dto.TipoPraticaDTO;
import it.appdevolution.caf.ms.entity.TipoPratica;
import it.appdevolution.caf.ms.services.PraticaService;
import it.appdevolution.caf.ms.spec.TipoPraticaSpec;
import it.appdevolution.caf.ms.support.Constants;
import it.appdevolution.caf.ms.support.Converter;
import it.appdevolution.caf.ms.support.JsonReqRes;

@Service
public class PraticaServiceImpl implements PraticaService {

	@Autowired
	private TipoPraticaDao dao; 
	
	@Override
	public JsonReqRes search(JsonReqRes jsonReqRes) throws Exception {
		if (jsonReqRes != null) {
			TipoPraticaSpec spec = new TipoPraticaSpec(jsonReqRes.getSearchFilters(), jsonReqRes.getOrder());
			int currentPage = (jsonReqRes.getCurrentPage() == null || jsonReqRes.getCurrentPage() == 0) ? 0 : jsonReqRes.getCurrentPage() - 1;
			int elementForPage = (jsonReqRes.getElementForPage() != null && jsonReqRes.getElementForPage() > 0) ? jsonReqRes.getElementForPage() : Constants.ELEMENT_FOR_PAGE_ALL;
		
			Page<TipoPratica> entityPage = dao.findAll(spec , PageRequest.of(currentPage, elementForPage));
			List<TipoPratica> entityList = entityPage.getContent();
			jsonReqRes.setList(Converter.convert(entityList,TipoPraticaDTO.class));
			jsonReqRes.setTotalPages(entityPage.getTotalPages());
			jsonReqRes.setTotalElements(entityPage.getTotalElements());
		}		
		return jsonReqRes;
	}
}
