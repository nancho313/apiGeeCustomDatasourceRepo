package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoConsumo;

import com.colsubsidio.jr.report.resolver.commons.domain.ApiGeeDomainMetadataValue;
import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;

import java.util.ArrayList;
import java.util.List;

import static com.colsubsidio.jr.report.resolver.commons.domain.TypeEnum.*;

public class ExtractoCreditoConsumoDomainMetadata implements IApiGeeDomainMetadata {

    private List<String> fieldNameList;
    private List<String> typeList;

    public ExtractoCreditoConsumoDomainMetadata(){

        init();
    }

    @Override
    public List<String> getFieldNameList() {
        return fieldNameList;
    }

    @Override
    public List<String> getTypeList() {
        return typeList;
    }

    private void init(){

        addDomainMetadata(new ApiGeeDomainMetadataValue("tipo_extracto", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_abono_capital", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_abono_capital2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_ciudad", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_comision_fng", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_comision_fng2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_cuota_actual", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_cuota_mensual", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_cuota_pendiente", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_cuotas_mora", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_direccion", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_faltante_anterior", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_fecha_corte", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_fecha_pago_a_realizar", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_fecha_ultimo_pago", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_gastos_procesales", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_gastos_procesales2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_honorarios_abogado", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_honorarios_abogado2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_interes_corriente", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_interes_corriente2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_interes_mora", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_interes_mora2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_minimo_pagar", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_no_obligacion", LONG));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_no_obligacion_digito", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_nombre_Cliente", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_numDoc", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_otros_cargos_fijos", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_otros_cargos_fijos2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_plan_amortizacion", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_plazo_tot_meses", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_saldo_capital", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_saldo_total", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_seguros", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_seguros2", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_tasa_interes_ea", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_tasa_mora", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_texto_informativo1", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_texto_informativo2", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_texto_informativo3", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_texto_informativo4", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_tipo_credito", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_tipoDoc", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_TipoExtracto", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_total_capital_pagado", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_total_pagado", BIG_DECIMAL));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extConID", INTEGER));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_idColsubsidio", LONG));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_numUnicoRefCorpRecaudo", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extCon_idClienteSinDigito", INTEGER));
    }

    private void addDomainMetadata(ApiGeeDomainMetadataValue metadataValue){

        if(fieldNameList == null){

            fieldNameList = new ArrayList<>();
        }

        if(typeList == null){

            typeList = new ArrayList<>();
        }

        if(metadataValue != null){

            fieldNameList.add(metadataValue.getFieldName());
            typeList.add(metadataValue.getType().getValue());
        }
    }
}
