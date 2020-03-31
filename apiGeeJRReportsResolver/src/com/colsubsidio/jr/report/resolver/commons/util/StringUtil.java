package com.colsubsidio.jr.report.resolver.commons.util;

/**
 * @author Ingeneo S.A.S
 *
 * Singleton utilitario para manejar funcionalidades con los campos String
 */
public enum StringUtil {

    INSTANCE
    ;

    /**
     * Valida si el valor de un string es vacio, donde vacio es igual a null o un string vacio
     * @param value, es el valor a validar
     * @return TRUE si efectivamente el string esta vacio, de lo contrario FALSE
     */
    public boolean isEmptyString(String value){

        return value == null || value.isEmpty();
    }

    /**
     * Formatea el valor de una respuesta, teniendo en cuenta que si el valor original es vacio, se reemplaza por uno
     * valido.
     * Este metodo ayuda a que un campo en JasperReports tenga un valor valido para trabajar.
     * @param originalValue, es el valor original
     * @param validEmptyValue, es un valor vacio original
     * @return si el valor original es valido, se retornara ese mismo, de lo contrario retornara el valor vacio valido
     */
    public String formatValue(String originalValue, String validEmptyValue){

        return isEmptyString(originalValue) ? validEmptyValue : originalValue;
    }
}
