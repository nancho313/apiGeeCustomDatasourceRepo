package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario;

import com.colsubsidio.jr.report.resolver.commons.domain.ApiGeeDomainMetadataValue;
import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;
import static com.colsubsidio.jr.report.resolver.commons.domain.TypeEnum.*;

import java.util.ArrayList;
import java.util.List;

public class ExtractoCreditoHipotecarioDomainMetadata implements IApiGeeDomainMetadata {

    private List<String> fieldNameList;
    private List<String> typeList;

    public ExtractoCreditoHipotecarioDomainMetadata(){

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
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_abono_capital_pesos", DOUBLE));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_abono_capital_uvr", DOUBLE));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_abono_capital2_pesos", DOUBLE));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_abono_capital2_uvr", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_ciudad", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_comision_fng", STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_comision_fng_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_comision_fng2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_comision_fng2_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_cuota_actual",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_cuota_pendiente",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_cuotas_mora",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_desc_plan_amortizacion",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_direccion",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_fecha_corte",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_fecha_limite_pago",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_fecha_ultimo_pago",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_gastos_procesales_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_gastos_procesales2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_honorarios_abogado_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_honorarios_abogado2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_corriente_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_corriente_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_corriente2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_corriente2_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_mora_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_mora_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_mora2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_interes_mora2_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_minimo_pagar_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_minimo_pagar_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_no_obligacion",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_no_obligacion_digito",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_nombre_Cliente",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_numDoc",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_otros_cargos_fijos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_plazo_tot_meses",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_saldo_total_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_saldo_total_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_seguros",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_seguros_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_seguros2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_seguros2_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tasa_comision_fng",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tasa_interes_ea",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tasa_mora",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tasa_seguro_inc_teremoto",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tasa_seguro_vida",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_texto_informativo1",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_texto_informativo2",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_texto_informativo3",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_texto_informativo4",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tipo_credito",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_tipoDoc",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_TipoExtracto",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_total_pagado_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_total_pagado_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_valor_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipoID",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_faltante_cuota_anterior2_pesos",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_faltante_cuota_anterior2_uvr",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_idColsubsidio",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_numUnicoRefCorpRecaudo",STRING));
        addDomainMetadata(new ApiGeeDomainMetadataValue("extHipo_idClienteSinDigito",STRING));
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
