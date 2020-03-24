package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoConsumo;

import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;

import java.util.List;

public class ExtractoCreditoConsumoDTO implements IApiGeeDTO {

    private List<Resultado> resultado;
    private List<Extracto> extracto;

    public List<Resultado> getResultado() {
        return resultado;
    }

    public void setResultado(List<Resultado> resultado) {
        this.resultado = resultado;
    }

    public List<Extracto> getExtracto() {
        return extracto;
    }

    public void setExtracto(List<Extracto> extracto) {
        this.extracto = extracto;
    }

    public class Resultado {

        private String codigo;
        private String descripcion;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }

    public class Extracto {

        private String tipo_extracto;
        private String extCon_abono_capital;
        private String extCon_abono_capital2;
        private String extCon_ciudad;
        private String extCon_comision_fng;
        private String extCon_comision_fng2;
        private String extCon_cuota_actual;
        private String extCon_cuota_mensual;
        private String extCon_cuota_pendiente;
        private String extCon_cuotas_mora;
        private String extCon_direccion;
        private String extCon_faltante_anterior;
        private String extCon_fecha_corte;
        private String extCon_fecha_pago_a_realizar;
        private String extCon_fecha_ultimo_pago;
        private String extCon_gastos_procesales;
        private String extCon_gastos_procesales2;
        private String extCon_honorarios_abogado;
        private String extCon_honorarios_abogado2;
        private String extCon_interes_corriente;
        private String extCon_interes_corriente2;
        private String extCon_interes_mora;
        private String extCon_interes_mora2;
        private String extCon_minimo_pagar;
        private String extCon_no_obligacion;
        private String extCon_no_obligacion_digito;
        private String extCon_nombre_Cliente;
        private String extCon_numDoc;
        private String extCon_otros_cargos_fijos;
        private String extCon_otros_cargos_fijos2;
        private String extCon_plan_amortizacion;
        private String extCon_plazo_tot_meses;
        private String extCon_saldo_capital;
        private String extCon_saldo_total;
        private String extCon_seguros;
        private String extCon_seguros2;
        private String extCon_tasa_interes_ea;
        private String extCon_tasa_mora;
        private String extCon_texto_informativo1;
        private String extCon_texto_informativo2;
        private String extCon_texto_informativo3;
        private String extCon_texto_informativo4;
        private String extCon_tipo_credito;
        private String extCon_tipoDoc;
        private String extCon_TipoExtracto;
        private String extCon_total_capital_pagado;
        private String extCon_total_pagado;
        private String extConID;
        private String extCon_idColsubsidio;
        private String extCon_numUnicoRefCorpRecaudo;
        private String extCon_idClienteSinDigito;

        public String getTipo_extracto() {
            return tipo_extracto;
        }

        public void setTipo_extracto(String tipo_extracto) {
            this.tipo_extracto = tipo_extracto;
        }

        public String getExtCon_abono_capital() {
            return extCon_abono_capital;
        }

        public void setExtCon_abono_capital(String extCon_abono_capital) {
            this.extCon_abono_capital = extCon_abono_capital;
        }

        public String getExtCon_abono_capital2() {
            return extCon_abono_capital2;
        }

        public void setExtCon_abono_capital2(String extCon_abono_capital2) {
            this.extCon_abono_capital2 = extCon_abono_capital2;
        }

        public String getExtCon_ciudad() {
            return extCon_ciudad;
        }

        public void setExtCon_ciudad(String extCon_ciudad) {
            this.extCon_ciudad = extCon_ciudad;
        }

        public String getExtCon_comision_fng() {
            return extCon_comision_fng;
        }

        public void setExtCon_comision_fng(String extCon_comision_fng) {
            this.extCon_comision_fng = extCon_comision_fng;
        }

        public String getExtCon_comision_fng2() {
            return extCon_comision_fng2;
        }

        public void setExtCon_comision_fng2(String extCon_comision_fng2) {
            this.extCon_comision_fng2 = extCon_comision_fng2;
        }

        public String getExtCon_cuota_actual() {
            return extCon_cuota_actual;
        }

        public void setExtCon_cuota_actual(String extCon_cuota_actual) {
            this.extCon_cuota_actual = extCon_cuota_actual;
        }

        public String getExtCon_cuota_mensual() {
            return extCon_cuota_mensual;
        }

        public void setExtCon_cuota_mensual(String extCon_cuota_mensual) {
            this.extCon_cuota_mensual = extCon_cuota_mensual;
        }

        public String getExtCon_cuota_pendiente() {
            return extCon_cuota_pendiente;
        }

        public void setExtCon_cuota_pendiente(String extCon_cuota_pendiente) {
            this.extCon_cuota_pendiente = extCon_cuota_pendiente;
        }

        public String getExtCon_cuotas_mora() {
            return extCon_cuotas_mora;
        }

        public void setExtCon_cuotas_mora(String extCon_cuotas_mora) {
            this.extCon_cuotas_mora = extCon_cuotas_mora;
        }

        public String getExtCon_direccion() {
            return extCon_direccion;
        }

        public void setExtCon_direccion(String extCon_direccion) {
            this.extCon_direccion = extCon_direccion;
        }

        public String getExtCon_faltante_anterior() {
            return extCon_faltante_anterior;
        }

        public void setExtCon_faltante_anterior(String extCon_faltante_anterior) {
            this.extCon_faltante_anterior = extCon_faltante_anterior;
        }

        public String getExtCon_fecha_corte() {
            return extCon_fecha_corte;
        }

        public void setExtCon_fecha_corte(String extCon_fecha_corte) {
            this.extCon_fecha_corte = extCon_fecha_corte;
        }

        public String getExtCon_fecha_pago_a_realizar() {
            return extCon_fecha_pago_a_realizar;
        }

        public void setExtCon_fecha_pago_a_realizar(String extCon_fecha_pago_a_realizar) {
            this.extCon_fecha_pago_a_realizar = extCon_fecha_pago_a_realizar;
        }

        public String getExtCon_fecha_ultimo_pago() {
            return extCon_fecha_ultimo_pago;
        }

        public void setExtCon_fecha_ultimo_pago(String extCon_fecha_ultimo_pago) {
            this.extCon_fecha_ultimo_pago = extCon_fecha_ultimo_pago;
        }

        public String getExtCon_gastos_procesales() {
            return extCon_gastos_procesales;
        }

        public void setExtCon_gastos_procesales(String extCon_gastos_procesales) {
            this.extCon_gastos_procesales = extCon_gastos_procesales;
        }

        public String getExtCon_gastos_procesales2() {
            return extCon_gastos_procesales2;
        }

        public void setExtCon_gastos_procesales2(String extCon_gastos_procesales2) {
            this.extCon_gastos_procesales2 = extCon_gastos_procesales2;
        }

        public String getExtCon_honorarios_abogado() {
            return extCon_honorarios_abogado;
        }

        public void setExtCon_honorarios_abogado(String extCon_honorarios_abogado) {
            this.extCon_honorarios_abogado = extCon_honorarios_abogado;
        }

        public String getExtCon_honorarios_abogado2() {
            return extCon_honorarios_abogado2;
        }

        public void setExtCon_honorarios_abogado2(String extCon_honorarios_abogado2) {
            this.extCon_honorarios_abogado2 = extCon_honorarios_abogado2;
        }

        public String getExtCon_interes_corriente() {
            return extCon_interes_corriente;
        }

        public void setExtCon_interes_corriente(String extCon_interes_corriente) {
            this.extCon_interes_corriente = extCon_interes_corriente;
        }

        public String getExtCon_interes_corriente2() {
            return extCon_interes_corriente2;
        }

        public void setExtCon_interes_corriente2(String extCon_interes_corriente2) {
            this.extCon_interes_corriente2 = extCon_interes_corriente2;
        }

        public String getExtCon_interes_mora() {
            return extCon_interes_mora;
        }

        public void setExtCon_interes_mora(String extCon_interes_mora) {
            this.extCon_interes_mora = extCon_interes_mora;
        }

        public String getExtCon_interes_mora2() {
            return extCon_interes_mora2;
        }

        public void setExtCon_interes_mora2(String extCon_interes_mora2) {
            this.extCon_interes_mora2 = extCon_interes_mora2;
        }

        public String getExtCon_minimo_pagar() {
            return extCon_minimo_pagar;
        }

        public void setExtCon_minimo_pagar(String extCon_minimo_pagar) {
            this.extCon_minimo_pagar = extCon_minimo_pagar;
        }

        public String getExtCon_no_obligacion() {
            return extCon_no_obligacion;
        }

        public void setExtCon_no_obligacion(String extCon_no_obligacion) {
            this.extCon_no_obligacion = extCon_no_obligacion;
        }

        public String getExtCon_no_obligacion_digito() {
            return extCon_no_obligacion_digito;
        }

        public void setExtCon_no_obligacion_digito(String extCon_no_obligacion_digito) {
            this.extCon_no_obligacion_digito = extCon_no_obligacion_digito;
        }

        public String getExtCon_nombre_Cliente() {
            return extCon_nombre_Cliente;
        }

        public void setExtCon_nombre_Cliente(String extCon_nombre_Cliente) {
            this.extCon_nombre_Cliente = extCon_nombre_Cliente;
        }

        public String getExtCon_numDoc() {
            return extCon_numDoc;
        }

        public void setExtCon_numDoc(String extCon_numDoc) {
            this.extCon_numDoc = extCon_numDoc;
        }

        public String getExtCon_otros_cargos_fijos() {
            return extCon_otros_cargos_fijos;
        }

        public void setExtCon_otros_cargos_fijos(String extCon_otros_cargos_fijos) {
            this.extCon_otros_cargos_fijos = extCon_otros_cargos_fijos;
        }

        public String getExtCon_otros_cargos_fijos2() {
            return extCon_otros_cargos_fijos2;
        }

        public void setExtCon_otros_cargos_fijos2(String extCon_otros_cargos_fijos2) {
            this.extCon_otros_cargos_fijos2 = extCon_otros_cargos_fijos2;
        }

        public String getExtCon_plan_amortizacion() {
            return extCon_plan_amortizacion;
        }

        public void setExtCon_plan_amortizacion(String extCon_plan_amortizacion) {
            this.extCon_plan_amortizacion = extCon_plan_amortizacion;
        }

        public String getExtCon_plazo_tot_meses() {
            return extCon_plazo_tot_meses;
        }

        public void setExtCon_plazo_tot_meses(String extCon_plazo_tot_meses) {
            this.extCon_plazo_tot_meses = extCon_plazo_tot_meses;
        }

        public String getExtCon_saldo_capital() {
            return extCon_saldo_capital;
        }

        public void setExtCon_saldo_capital(String extCon_saldo_capital) {
            this.extCon_saldo_capital = extCon_saldo_capital;
        }

        public String getExtCon_saldo_total() {
            return extCon_saldo_total;
        }

        public void setExtCon_saldo_total(String extCon_saldo_total) {
            this.extCon_saldo_total = extCon_saldo_total;
        }

        public String getExtCon_seguros() {
            return extCon_seguros;
        }

        public void setExtCon_seguros(String extCon_seguros) {
            this.extCon_seguros = extCon_seguros;
        }

        public String getExtCon_seguros2() {
            return extCon_seguros2;
        }

        public void setExtCon_seguros2(String extCon_seguros2) {
            this.extCon_seguros2 = extCon_seguros2;
        }

        public String getExtCon_tasa_interes_ea() {
            return extCon_tasa_interes_ea;
        }

        public void setExtCon_tasa_interes_ea(String extCon_tasa_interes_ea) {
            this.extCon_tasa_interes_ea = extCon_tasa_interes_ea;
        }

        public String getExtCon_tasa_mora() {
            return extCon_tasa_mora;
        }

        public void setExtCon_tasa_mora(String extCon_tasa_mora) {
            this.extCon_tasa_mora = extCon_tasa_mora;
        }

        public String getExtCon_texto_informativo1() {
            return extCon_texto_informativo1;
        }

        public void setExtCon_texto_informativo1(String extCon_texto_informativo1) {
            this.extCon_texto_informativo1 = extCon_texto_informativo1;
        }

        public String getExtCon_texto_informativo2() {
            return extCon_texto_informativo2;
        }

        public void setExtCon_texto_informativo2(String extCon_texto_informativo2) {
            this.extCon_texto_informativo2 = extCon_texto_informativo2;
        }

        public String getExtCon_texto_informativo3() {
            return extCon_texto_informativo3;
        }

        public void setExtCon_texto_informativo3(String extCon_texto_informativo3) {
            this.extCon_texto_informativo3 = extCon_texto_informativo3;
        }

        public String getExtCon_texto_informativo4() {
            return extCon_texto_informativo4;
        }

        public void setExtCon_texto_informativo4(String extCon_texto_informativo4) {
            this.extCon_texto_informativo4 = extCon_texto_informativo4;
        }

        public String getExtCon_tipo_credito() {
            return extCon_tipo_credito;
        }

        public void setExtCon_tipo_credito(String extCon_tipo_credito) {
            this.extCon_tipo_credito = extCon_tipo_credito;
        }

        public String getExtCon_tipoDoc() {
            return extCon_tipoDoc;
        }

        public void setExtCon_tipoDoc(String extCon_tipoDoc) {
            this.extCon_tipoDoc = extCon_tipoDoc;
        }

        public String getExtCon_TipoExtracto() {
            return extCon_TipoExtracto;
        }

        public void setExtCon_TipoExtracto(String extCon_TipoExtracto) {
            this.extCon_TipoExtracto = extCon_TipoExtracto;
        }

        public String getExtCon_total_capital_pagado() {
            return extCon_total_capital_pagado;
        }

        public void setExtCon_total_capital_pagado(String extCon_total_capital_pagado) {
            this.extCon_total_capital_pagado = extCon_total_capital_pagado;
        }

        public String getExtCon_total_pagado() {
            return extCon_total_pagado;
        }

        public void setExtCon_total_pagado(String extCon_total_pagado) {
            this.extCon_total_pagado = extCon_total_pagado;
        }

        public String getExtConID() {
            return extConID;
        }

        public void setExtConID(String extConID) {
            this.extConID = extConID;
        }

        public String getExtCon_idColsubsidio() {
            return extCon_idColsubsidio;
        }

        public void setExtCon_idColsubsidio(String extCon_idColsubsidio) {
            this.extCon_idColsubsidio = extCon_idColsubsidio;
        }

        public String getExtCon_numUnicoRefCorpRecaudo() {
            return extCon_numUnicoRefCorpRecaudo;
        }

        public void setExtCon_numUnicoRefCorpRecaudo(String extCon_numUnicoRefCorpRecaudo) {
            this.extCon_numUnicoRefCorpRecaudo = extCon_numUnicoRefCorpRecaudo;
        }

        public String getExtCon_idClienteSinDigito() {
            return extCon_idClienteSinDigito;
        }

        public void setExtCon_idClienteSinDigito(String extCon_idClienteSinDigito) {
            this.extCon_idClienteSinDigito = extCon_idClienteSinDigito;
        }
    }
}
