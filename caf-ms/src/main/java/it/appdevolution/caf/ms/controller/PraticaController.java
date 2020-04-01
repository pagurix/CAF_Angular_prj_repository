package it.appdevolution.caf.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.appdevolution.caf.ms.services.PraticaService;
import it.appdevolution.caf.ms.support.JsonReqRes;
import it.appdevolution.caf.ms.support.ResponseWrapper;


@RestController
@RequestMapping("/services")
public class PraticaController {
	
	@Autowired
	private PraticaService praticaService;
	
    @PostMapping("/tipopratica/search")
    public @ResponseBody ResponseEntity<ResponseWrapper<JsonReqRes>> searchPratica(@RequestBody(required=false) JsonReqRes jsonReqRes) throws Exception {
    	
    	jsonReqRes = praticaService.search(jsonReqRes);
    	
    	ResponseWrapper<JsonReqRes> esito = new ResponseWrapper<JsonReqRes>();
        esito.setResult(jsonReqRes);
        esito.setHttpErrorCode(HttpStatus.OK.value());
        esito.setEsito((true));

        return new ResponseEntity<ResponseWrapper<JsonReqRes>>(esito, HttpStatus.OK);
    }
    
//    @PostMapping("test/inseriscit2")
//    public @ResponseBody ResponseEntity<ResponseWrapper<TabellaTestDTO2>> inserisci2( @RequestBody TabellaTestDTO2 dto) throws Exception {
//    	
//    	TabellaTestDTO2 dtoSaved = testService.inserisci2(dto);
//    	
//    	ResponseWrapper<TabellaTestDTO2> esito = new ResponseWrapper<TabellaTestDTO2>();
//        esito.setResult(dtoSaved);
//        esito.setHttpErrorCode(HttpStatus.OK.value());
//        esito.setEsito((true));
//
//        return new ResponseEntity<ResponseWrapper<TabellaTestDTO2>>(esito, HttpStatus.OK);
//    }
//    
//    @PostMapping("test/leggi/codice")
//    public @ResponseBody ResponseEntity<ResponseWrapper<List<TabellaTestDTO>>> leggi( @RequestBody String codice) throws Exception {
//    	
//    	List<TabellaTestDTO> dtoList = testService.findbyCodice(codice);
//    	
//    	ResponseWrapper<List<TabellaTestDTO>> esito = new ResponseWrapper<List<TabellaTestDTO>>();
//        esito.setResult(dtoList);
//        esito.setHttpErrorCode(HttpStatus.OK.value());
//        esito.setEsito((true));
//
//        return new ResponseEntity<ResponseWrapper<List<TabellaTestDTO>>>(esito, HttpStatus.OK);
//
//    }
//    
//    @GetMapping("test/read/id")
//    public @ResponseBody ResponseEntity<ResponseWrapper<TabellaTestDTO2>> read( @PathParam(value = "id") Long id) throws Exception {
//    	
//    	TabellaTestDTO2 read = testService.read(id);
//    	
//    	ResponseWrapper<TabellaTestDTO2> esito = new ResponseWrapper<TabellaTestDTO2>();
//        esito.setResult(read);
//        esito.setHttpErrorCode(HttpStatus.OK.value());
//        esito.setEsito((true));
//
//        return new ResponseEntity<ResponseWrapper<TabellaTestDTO2>>(esito, HttpStatus.OK);
//
//    }

}