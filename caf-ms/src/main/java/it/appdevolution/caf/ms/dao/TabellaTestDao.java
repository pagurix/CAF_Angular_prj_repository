package it.appdevolution.caf.ms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.appdevolution.caf.ms.domain.TabellaTest;

public interface TabellaTestDao extends JpaRepository<TabellaTest, Long> {
	
    @Query("SELECT tt FROM TabellaTest tt WHERE tt.codice = :codice ")
    public List<TabellaTest> findByCodice(@Param("codice") String codice);
	
    
    @Query(value = "select * from TABELLA_TEST tt WHERE " +
            "tt.CODICE = :codice",nativeQuery = true)
    public List<TabellaTest> findByCodiceNative(@Param("codice") String codice);
    
}