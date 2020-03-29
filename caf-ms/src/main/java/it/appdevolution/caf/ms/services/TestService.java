package it.appdevolution.caf.ms.services;

import java.util.List;

import it.appdevolution.caf.ms.dto.TabellaTestDTO;
import it.appdevolution.caf.ms.dto.TabellaTestDTO2;

public interface TestService {

	public List<TabellaTestDTO> findbyCodice(String test) throws Exception;

	public TabellaTestDTO inserisci(TabellaTestDTO dto) throws Exception;
	
	public TabellaTestDTO2 inserisci2(TabellaTestDTO2 dto) throws Exception;	
	
	public TabellaTestDTO2 read(Long id) throws Exception;

}
