package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario;

import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;

public class ExtractoCreditoHipotecarioResponse implements IApiGeeResponse<ExtractoCreditoHipotecarioDTO> {

    private ExtractoCreditoHipotecarioDTO.Extracto reportDTO;

    public ExtractoCreditoHipotecarioResponse(ExtractoCreditoHipotecarioDTO.Extracto reportDTO) {
        this.reportDTO = reportDTO;
    }

    @Override
    public Object getFieldValue(String key) {

        Object result = null;
        if ("tipo_extracto".equals(key)) {
            result = Integer.parseInt(reportDTO.getTipo_extracto());
        } else if ("extHipo_abono_capital_pesos" .equals(key)){
            result = Double.parseDouble(reportDTO.getExtHipo_abono_capital_pesos());
        } else if("extHipo_abono_capital_uvr ".equals(key)){
            result = Double.parseDouble(reportDTO.getExtHipo_abono_capital_uvr());
        }
        else if("extHipo_abono_capital2_pesos ".equals(key)){
            result = Double.parseDouble(reportDTO.getExtHipo_abono_capital2_pesos ());
        }
        else if("extHipo_abono_capital2_uvr ".equals(key)){
            result = reportDTO.getExtHipo_abono_capital2_uvr ();
        }
        else if("extHipo_ciudad".equals(key)){
            result = reportDTO.getExtHipo_ciudad();
        }
        else if("extHipo_comision_fng ".equals(key)){
            result = reportDTO.getExtHipo_comision_fng ();
        }
        else if("extHipo_comision_fng_uvr".equals(key)){
            result = reportDTO.getExtHipo_comision_fng_uvr();
        }
        else if("extHipo_comision_fng2_pesos".equals(key)){
            result = reportDTO.getExtHipo_comision_fng2_pesos();
        }
        else if("extHipo_comision_fng2_uvr".equals(key)){
            result = reportDTO.getExtHipo_comision_fng2_uvr();
        }
        else if("extHipo_cuota_actual".equals(key)){
            result = reportDTO.getExtHipo_cuota_actual();
        }
        else if("extHipo_cuota_pendiente".equals(key)){
            result = reportDTO.getExtHipo_cuota_pendiente();
        }
        else if("extHipo_cuotas_mora".equals(key)){
            result = reportDTO.getExtHipo_cuotas_mora();
        }
        else if("extHipo_desc_plan_amortizacion".equals(key)){
            result = reportDTO.getExtHipo_desc_plan_amortizacion();
        }
        else if("extHipo_direccion".equals(key)){
            result = reportDTO.getExtHipo_direccion();
        }
        else if("extHipo_fecha_corte".equals(key)){
            result = reportDTO.getExtHipo_fecha_corte();
        }
        else if("extHipo_fecha_limite_pago".equals(key)){
            result = reportDTO.getExtHipo_fecha_limite_pago();
        }
        else if("extHipo_fecha_ultimo_pago".equals(key)){
            result = reportDTO.getExtHipo_fecha_ultimo_pago();
        }
        else if("extHipo_gastos_procesales_pesos".equals(key)){
            result = reportDTO.getExtHipo_gastos_procesales_pesos();
        }
        else if("extHipo_gastos_procesales2_pesos".equals(key)){
            result = reportDTO.getExtHipo_gastos_procesales2_pesos();
        }
        else if("extHipo_honorarios_abogado_pesos".equals(key)){
            result = reportDTO.getExtHipo_honorarios_abogado_pesos();
        }
        else if("extHipo_honorarios_abogado2_pesos".equals(key)){
            result = reportDTO.getExtHipo_honorarios_abogado2_pesos();
        }
        else if("extHipo_interes_corriente_pesos".equals(key)){
            result = reportDTO.getExtHipo_interes_corriente_pesos();
        }
        else if("extHipo_interes_corriente_uvr".equals(key)){
            result = reportDTO.getExtHipo_interes_corriente_uvr();
        }
        else if("extHipo_interes_corriente2_pesos".equals(key)){
            result = reportDTO.getExtHipo_interes_corriente2_pesos();
        }
        else if("extHipo_interes_corriente2_uvr".equals(key)){
            result = reportDTO.getExtHipo_interes_corriente2_uvr();
        }
        else if("extHipo_interes_mora_pesos".equals(key)){
            result = reportDTO.getExtHipo_interes_mora_pesos();
        }
        else if("extHipo_interes_mora_uvr".equals(key)){
            result = reportDTO.getExtHipo_interes_mora_uvr();
        }
        else if("extHipo_interes_mora2_pesos".equals(key)){
            result = reportDTO.getExtHipo_interes_mora2_pesos();
        }
        else if("extHipo_interes_mora2_uvr".equals(key)){
            result = reportDTO.getExtHipo_interes_mora2_uvr();
        }
        else if("extHipo_minimo_pagar_pesos".equals(key)){
            result = reportDTO.getExtHipo_minimo_pagar_pesos();
        }
        else if("extHipo_minimo_pagar_uvr".equals(key)){
            result = reportDTO.getExtHipo_minimo_pagar_uvr();
        }
        else if("extHipo_no_obligacion".equals(key)){
            result = reportDTO.getExtHipo_no_obligacion();
        }
        else if("extHipo_no_obligacion_digito".equals(key)){
            result = reportDTO.getExtHipo_no_obligacion_digito();
        }
        else if("extHipo_nombre_Cliente".equals(key)){
            result = reportDTO.getExtHipo_nombre_Cliente();
        }
        else if("extHipo_numDoc".equals(key)){
            result = reportDTO.getExtHipo_numDoc();
        }
        else if("extHipo_otros_cargos_fijos".equals(key)){
            result = reportDTO.getExtHipo_otros_cargos_fijos();
        }
        else if("extHipo_plazo_tot_meses".equals(key)){
            result = reportDTO.getExtHipo_plazo_tot_meses();
        }
        else if("extHipo_saldo_total_pesos".equals(key)){
            result = reportDTO.getExtHipo_saldo_total_pesos();
        }
        else if("extHipo_saldo_total_uvr".equals(key)){
            result = reportDTO.getExtHipo_saldo_total_uvr();
        }
        else if("extHipo_seguros".equals(key)){
            result = reportDTO.getExtHipo_seguros();
        }
        else if("extHipo_seguros_uvr".equals(key)){
            result = reportDTO.getExtHipo_seguros_uvr();
        }
        else if("extHipo_seguros2_pesos".equals(key)){
            result = reportDTO.getExtHipo_seguros2_pesos();
        }
        else if("extHipo_seguros2_uvr".equals(key)){
            result = reportDTO.getExtHipo_seguros2_uvr();
        }
        else if("extHipo_tasa_comision_fng".equals(key)){
            result = reportDTO.getExtHipo_tasa_comision_fng();
        }
        else if("extHipo_tasa_interes_ea".equals(key)){
            result = reportDTO.getExtHipo_tasa_interes_ea();
        }
        else if("extHipo_tasa_mora".equals(key)){
            result = reportDTO.getExtHipo_tasa_mora();
        }
        else if("extHipo_tasa_seguro_inc_teremoto".equals(key)){
            result = reportDTO.getExtHipo_tasa_seguro_inc_teremoto();
        }
        else if("extHipo_tasa_seguro_vida".equals(key)){
            result = reportDTO.getExtHipo_tasa_seguro_vida();
        }
        else if("extHipo_texto_informativo1".equals(key)){
            result = reportDTO.getExtHipo_texto_informativo1();
        }
        else if("extHipo_texto_informativo2".equals(key)){
            result = reportDTO.getExtHipo_texto_informativo2();
        }
        else if("extHipo_texto_informativo3".equals(key)){
            result = reportDTO.getExtHipo_texto_informativo3();
        }
        else if("extHipo_texto_informativo4".equals(key)){
            result = reportDTO.getExtHipo_texto_informativo4();
        }
        else if("extHipo_tipo_credito".equals(key)){
            result = reportDTO.getExtHipo_tipo_credito();
        }
        else if("extHipo_tipoDoc".equals(key)){
            result = reportDTO.getExtHipo_tipoDoc();
        }
        else if("extHipo_TipoExtracto".equals(key)){
            result = reportDTO.getExtHipo_TipoExtracto();
        }
        else if("extHipo_total_pagado_pesos".equals(key)){
            result = reportDTO.getExtHipo_total_pagado_pesos();
        }
        else if("extHipo_total_pagado_uvr".equals(key)){
            result = reportDTO.getExtHipo_total_pagado_uvr();
        }
        else if("extHipo_valor_uvr".equals(key)){
            result = reportDTO.getExtHipo_valor_uvr();
        }
        else if("extHipoID".equals(key)){
            result = reportDTO.getExtHipoID();
        }
        else if("extHipo_faltante_cuota_anterior2_pesos".equals(key)){
            result = reportDTO.getExtHipo_faltante_cuota_anterior2_pesos();
        }
        else if("extHipo_faltante_cuota_anterior2_uvr".equals(key)){
            result = reportDTO.getExtHipo_faltante_cuota_anterior2_uvr();
        }
        else if("extHipo_idColsubsidio".equals(key)){
            result = reportDTO.getExtHipo_idColsubsidio();
        }
        else if("extHipo_numUnicoRefCorpRecaudo".equals(key)){
            result = reportDTO.getExtHipo_numUnicoRefCorpRecaudo();
        }
        else if("extHipo_idClienteSinDigito".equals(key)){
            result = reportDTO.getExtHipo_idClienteSinDigito();
        }

        return result;
    }
}
