package com.colsubsidio.jr.report.resolver.commons.strategy;

import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;
import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;

import java.util.List;

/**
 * @author Ingeneo S.A.S
 *
 * Componente que abstrae la obtencion de la metadata, el tipo de objeto con el que se mapea la respuesta de ApiGee
 * y tambien la forma en como se construye los registros de respuesta.
 *
 * Este componente practicamente es la base de todas las implementaciones ya que ayuda al ApiGee Custom Datasource a
 * procesar sus respuestas y crear los reportes.
 *
 * @param <T>, cualquier componente que contenga el formato de la respuesta de los servicios expuestos en ApiGee
 */
public interface IApiGeeReportStrategy<T extends IApiGeeDTO> {

    IApiGeeDomainMetadata getDomainMetadata();

    Class<T> getApiGeeResponseClass();

    List<IApiGeeResponse> buildResponse(T t);
}
