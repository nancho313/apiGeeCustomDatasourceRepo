package com.colsubsidio.jr.report.resolver.commons.domain;

import java.util.List;

/**
 * Contrato con el que se deben basar todas las implementaciones para retornar la metadata correspondiente al reporte.
 * Las dos colecciones deben tener el mismo numero de registros y en el mismo orden tanto del nombre del campo como el
 * tipo de dato
 */
public interface IApiGeeDomainMetadata {

    /**
     * Retorna todos los nombres de los campos del reporte
     * @return lista de strings
     */
    List<String> getFieldNameList();

    /**
     * Retorna todos los tipos de datos de cada uno de los campos
     * @return lista de strings
     */
    List<String> getTypeList();
}
