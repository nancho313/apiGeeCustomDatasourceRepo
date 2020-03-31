package com.colsubsidio.jr.report.resolver.commons.response;

import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;

/**
 * Interface que encapsula la logica de obtener la informacion correspondiente de un IApiGeeDTO a partir del nombre
 * de un campo.
 *
 * Este componente es clave ya que ayuda a enlazar la informacion solicitada desde el reporte JRXML hacia la respuesta
 * dada por el servicio de ApiGee. Esto es asi ya que no necesariamente el nombre de los campos en el JRXML van a ser
 * los mismos que el retornado por ApiGee.
 *
 * Ej: Se llama al metodo getFieldValue consultando el valor del campo "direccion", sin embargo, la direccion se
 * encuentra en un objeto anidado dentro de la implementacion del IApiGeeDTO
 * @param <T>
 */
public interface IApiGeeResponse<T extends IApiGeeDTO> {

    /**
     * Obtiene el valor de un campo a partir del nombre
     * @param key, es el nombre del campo
     * @return el valor del campo
     */
    Object getFieldValue(String key);
}
