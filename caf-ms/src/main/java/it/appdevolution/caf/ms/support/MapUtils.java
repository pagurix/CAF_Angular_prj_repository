package it.appdevolution.caf.ms.support;

import java.util.Map;

public class MapUtils {

    public static String getValue(Map<String, Object> map, String keySearch) {

        if (map != null) {
            if (map.containsKey(keySearch)) {
                Object value = map.get(keySearch);
                if (value instanceof String && !value.toString().isEmpty()) {
                    return value.toString();
                } else if ((value instanceof Long || value instanceof Integer || value instanceof Double) && value != null) {
                    return value.toString();
                } else if ((value instanceof Boolean) && value != null) {
                    return ((Boolean) value).toString();                	
                } else if (value instanceof Map) {
                    Map<String, Object> subMap = (Map<String, Object>) value;
                    return getValue(subMap, keySearch);
                } else {
                }
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String && key.equalsIgnoreCase(keySearch)) {
                    return (String) value;
                } else if ((value instanceof Long || value instanceof Integer || value instanceof Double) && value != null && key.equalsIgnoreCase(keySearch)) {
                    return value.toString();
                } else if ((value instanceof Boolean) && value != null) {
                    return ((Boolean) value).toString();
                } else if (value instanceof Map) {
                    Map<String, Object> subMap = (Map<String, Object>) value;
                    return getValue(subMap, keySearch);
                } else {
                    //TODO
                }
            }
        }
        return "";
    }
}
