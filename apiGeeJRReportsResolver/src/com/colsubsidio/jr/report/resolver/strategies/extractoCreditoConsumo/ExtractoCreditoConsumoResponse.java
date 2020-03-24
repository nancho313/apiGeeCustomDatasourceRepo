package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoConsumo;

import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;

import java.math.BigDecimal;

public class ExtractoCreditoConsumoResponse implements IApiGeeResponse {

    private ExtractoCreditoConsumoDTO.Extracto reportDTO;

    public ExtractoCreditoConsumoResponse(ExtractoCreditoConsumoDTO.Extracto reportDTO) {
        this.reportDTO = reportDTO;
    }

    @Override
    public Object getFieldValue(String key) {

        Object result = null;

        if ("tipo_extracto".equals(key)) {
            result = Integer.parseInt(reportDTO.getTipo_extracto());
        } else if ("extCon_abono_capital".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_abono_capital());
        } else if ("extCon_abono_capital2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_abono_capital2());
        } else if ("extCon_ciudad".equals(key)) {
            result = reportDTO.getExtCon_ciudad();
        } else if ("extCon_comision_fng".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_comision_fng());
        } else if ("extCon_comision_fng2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_comision_fng2());
        } else if ("extCon_cuota_actual".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_cuota_actual());
        } else if ("extCon_cuota_mensual".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_cuota_mensual());
        } else if ("extCon_cuota_pendiente".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_cuota_pendiente());
        } else if ("extCon_cuotas_mora".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_cuotas_mora());
        } else if ("extCon_direccion".equals(key)) {
            result = reportDTO.getExtCon_direccion();
        } else if ("extCon_faltante_anterior".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_faltante_anterior());
        } else if ("extCon_fecha_corte".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_fecha_corte());
        } else if ("extCon_fecha_pago_a_realizar".equals(key)) {
            result = reportDTO.getExtCon_fecha_pago_a_realizar();
        } else if ("extCon_fecha_ultimo_pago".equals(key)) {
            result = reportDTO.getExtCon_fecha_ultimo_pago();
        } else if ("extCon_gastos_procesales".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_gastos_procesales());
        } else if ("extCon_gastos_procesales2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_gastos_procesales2());
        } else if ("extCon_honorarios_abogado".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_honorarios_abogado());
        } else if ("extCon_honorarios_abogado2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_honorarios_abogado2());
        } else if ("extCon_interes_corriente".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_interes_corriente());
        } else if ("extCon_interes_corriente2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_interes_corriente2());
        } else if ("extCon_interes_mora".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_interes_mora());
        } else if ("extCon_interes_mora2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_interes_mora2());
        } else if ("extCon_minimo_pagar".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_minimo_pagar());
        } else if ("extCon_no_obligacion".equals(key)) {
            result = Long.parseLong(reportDTO.getExtCon_no_obligacion());
        } else if ("extCon_no_obligacion_digito".equals(key)) {
            result = reportDTO.getExtCon_no_obligacion_digito();
        } else if ("extCon_nombre_Cliente".equals(key)) {
            result = reportDTO.getExtCon_nombre_Cliente();
        } else if ("extCon_numDoc".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_numDoc());
        } else if ("extCon_otros_cargos_fijos".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_otros_cargos_fijos());
        } else if ("extCon_otros_cargos_fijos2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_otros_cargos_fijos2());
        } else if ("extCon_plan_amortizacion".equals(key)) {
            result = reportDTO.getExtCon_plan_amortizacion();
        } else if ("extCon_plazo_tot_meses".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_plazo_tot_meses());
        } else if ("extCon_saldo_capital".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_saldo_capital());
        } else if ("extCon_saldo_total".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_saldo_total());
        } else if ("extCon_seguros".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_seguros());
        } else if ("extCon_seguros2".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_seguros2());
        } else if ("extCon_tasa_interes_ea".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_tasa_interes_ea());
        } else if ("extCon_tasa_mora".equals(key)) {
            result = reportDTO.getExtCon_tasa_mora();
        } else if ("extCon_texto_informativo1".equals(key)) {
            result = reportDTO.getExtCon_texto_informativo1();
        } else if ("extCon_texto_informativo2".equals(key)) {
            result = reportDTO.getExtCon_texto_informativo2();
        } else if ("extCon_texto_informativo3".equals(key)) {
            result = reportDTO.getExtCon_texto_informativo3();
        } else if ("extCon_texto_informativo4".equals(key)) {
            result = reportDTO.getExtCon_texto_informativo4();
        } else if ("extCon_tipo_credito".equals(key)) {
            result = reportDTO.getExtCon_tipo_credito();
        } else if ("extCon_tipoDoc".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_tipoDoc());
        } else if ("extCon_TipoExtracto".equals(key)) {
            result = reportDTO.getExtCon_TipoExtracto();
        } else if ("extCon_total_capital_pagado".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_total_capital_pagado());
        } else if ("extCon_total_pagado".equals(key)) {
            result = new BigDecimal(reportDTO.getExtCon_total_pagado());
        } else if ("extConID".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtConID());
        } else if ("extCon_idColsubsidio".equals(key)) {
            result = Long.parseLong(reportDTO.getExtCon_idColsubsidio());
        } else if ("extCon_numUnicoRefCorpRecaudo".equals(key)) {
            result = reportDTO.getExtCon_numUnicoRefCorpRecaudo();
        } else if ("extCon_idClienteSinDigito".equals(key)) {
            result = Integer.parseInt(reportDTO.getExtCon_idClienteSinDigito());
        }
        return result;
    }
}
