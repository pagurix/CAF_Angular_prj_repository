package it.appdevolution.caf.ms.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

public class Converter {

	static public <I, O> O convert(I input, Class<O> o) throws Exception {
		O output = null;
		if (input != null) {
			try {
				output = o.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				throw new Exception(e);
			}		
			BeanUtils.copyProperties(input, output);
		}
		return output;
	}

	static public <I, O> List<O> convert(List<I> inputList, Class<O> o) throws Exception {
		List<O> outputList = new ArrayList<O>();
		if (inputList != null) {
			for (I input : inputList) {
				O output = convert(input, o);
				outputList.add(output);
			}
		}
		return outputList;
	}

	
//	
//	static public <I, O, EPK> List<O> convert(List<I> inputList, Class<O> o, Class<EPK> epk) throws PrevBusinessException {
//		List<O> outputList = new ArrayList<O>();
//		if (inputList != null) {
//			for (I input : inputList) {
//				O output = convert(input, o, epk);
//				outputList.add(output);
//			}
//		}
//		return outputList;
//	}
//	
//	
//	@SuppressWarnings("unchecked")
//	static public <I, O, EPK> O convert(I input, Class<O> o, Class<EPK> epk) throws PrevBusinessException {
//		O output = null;
//		if (input != null) {
//			try {
//				output = o.newInstance();
//			} catch (InstantiationException | IllegalAccessException e) {
//				e.printStackTrace();
//				throw e;
//			}		
//			BeanUtils.copyProperties(input, output);
//			
//			EPK entityPk = null;
//			try {
//				entityPk = (EPK) (input.getClass().getMethod("getId")).invoke(input);
//				BeanUtils.copyProperties(entityPk, output);					
//			} catch (Exception  e) {}
//			if (entityPk == null) {
//				try {
//					entityPk = epk.newInstance();
//					BeanUtils.copyProperties(input, entityPk);
//					(output.getClass().getMethod("setId", entityPk.getClass())).invoke(output, entityPk);					
//				} catch (Exception e) {}				
//			}			
//		}
//		return output;
//	}

}
