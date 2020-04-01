package it.appdevolution.caf.ms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.appdevolution.caf.ms.entity.TipoPratica;

public interface TipoPraticaDao extends JpaRepository<TipoPratica, Long>, JpaSpecificationExecutor<TipoPratica> {
	
    @Query("SELECT tp FROM TipoPratica tp WHERE tp.codice = :codice ")
    public List<TipoPratica> searchTipoPratica(@Param("codice") String codice);
	
    
//    @Query(value = "select * from TABELLA_TEST tt WHERE tt.CODICE = :codice",nativeQuery = true)
//    public List<TipoPratica> findByCodiceNative(@Param("codice") String codice);
    
}