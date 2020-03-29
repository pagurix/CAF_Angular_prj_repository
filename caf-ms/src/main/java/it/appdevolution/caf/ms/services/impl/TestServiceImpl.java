package it.appdevolution.caf.ms.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.appdevolution.caf.ms.dao.TabellaTestDao;
import it.appdevolution.caf.ms.dao.TabellaTestDao2;
import it.appdevolution.caf.ms.domain.TabellaTest;
import it.appdevolution.caf.ms.domain.TabellaTest2;
import it.appdevolution.caf.ms.dto.TabellaTestDTO;
import it.appdevolution.caf.ms.dto.TabellaTestDTO2;
import it.appdevolution.caf.ms.services.TestService;
import it.appdevolution.caf.ms.support.Converter;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TabellaTestDao tabellaTestDao;

	@Autowired
	private TabellaTestDao2 tabellaTestDao2;

	@Override
	public List<TabellaTestDTO> findbyCodice(String codice) throws Exception {
		List<TabellaTest> entityList = tabellaTestDao.findByCodice(codice);		
		
		List<TabellaTestDTO> dtoList = Converter.convert(entityList, TabellaTestDTO.class); 
		
		return dtoList;
	}

	@Transactional
	@Override
	public TabellaTestDTO inserisci(TabellaTestDTO dto) throws Exception {
		
		TabellaTest entity = Converter.convert(dto, TabellaTest.class);
		
		TabellaTest entitySaved = tabellaTestDao.save(entity);
		
		TabellaTestDTO dtoSaved = Converter.convert(entitySaved, TabellaTestDTO.class);
		
		return dtoSaved;
	}
	
	@Transactional
	@Override
	public TabellaTestDTO2 inserisci2(TabellaTestDTO2 dto) throws Exception {
		
		TabellaTest2 entity = Converter.convert(dto, TabellaTest2.class);
		
		TabellaTest2 entitySaved = tabellaTestDao2.save(entity);
		
		TabellaTestDTO2 dtoSaved = Converter.convert(entitySaved, TabellaTestDTO2.class);
		
		return dtoSaved;
	}

	@Override
	public TabellaTestDTO2 read(Long id) throws Exception {
		
		Optional<TabellaTest2> findById = tabellaTestDao2.findById(id);
		
		TabellaTest2 tabellaTest22 = findById.get();
		
		TabellaTestDTO2 testDTO2 = Converter.convert(tabellaTest22, TabellaTestDTO2.class);
		
		return testDTO2; 
	}
	

}
