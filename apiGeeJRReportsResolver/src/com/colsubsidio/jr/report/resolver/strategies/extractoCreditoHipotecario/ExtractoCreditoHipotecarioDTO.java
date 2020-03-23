package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario;

import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;

import java.util.List;

public class ExtractoCreditoHipotecarioDTO implements IApiGeeDTO {

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

    public class Resultado{

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

    public class Extracto{

        private String tipo_extracto;
        private String extHipo_abono_capital_pesos;
        private String extHipo_abono_capital_uvr;
        private String extHipo_abono_capital2_pesos;
        private String extHipo_abono_capital2_uvr;
        private String extHipo_ciudad;
        private String extHipo_comision_fng;
        private String extHipo_comision_fng_uvr;
        private String extHipo_comision_fng2_pesos;
        private String extHipo_comision_fng2_uvr;
        private String extHipo_cuota_actual;
        private String extHipo_cuota_pendiente;
        private String extHipo_cuotas_mora;
        private String extHipo_desc_plan_amortizacion;
        private String extHipo_direccion;
        private String extHipo_fecha_corte;
        private String extHipo_fecha_limite_pago;
        private String extHipo_fecha_ultimo_pago;
        private String extHipo_gastos_procesales_pesos;
        private String extHipo_gastos_procesales2_pesos;
        private String extHipo_honorarios_abogado_pesos;
        private String extHipo_honorarios_abogado2_pesos;
        private String extHipo_interes_corriente_pesos;
        private String extHipo_interes_corriente_uvr;
        private String extHipo_interes_corriente2_pesos;
        private String extHipo_interes_corriente2_uvr;
        private String extHipo_interes_mora_pesos;
        private String extHipo_interes_mora_uvr;
        private String extHipo_interes_mora2_pesos;
        private String extHipo_interes_mora2_uvr;
        private String extHipo_minimo_pagar_pesos;
        private String extHipo_minimo_pagar_uvr;
        private String extHipo_no_obligacion;
        private String extHipo_no_obligacion_digito;
        private String extHipo_nombre_Cliente;
        private String extHipo_numDoc;
        private String extHipo_otros_cargos_fijos;
        private String extHipo_plazo_tot_meses;
        private String extHipo_saldo_total_pesos;
        private String extHipo_saldo_total_uvr;
        private String extHipo_seguros;
        private String extHipo_seguros_uvr;
        private String extHipo_seguros2_pesos;
        private String extHipo_seguros2_uvr;
        private String extHipo_tasa_comision_fng;
        private String extHipo_tasa_interes_ea;
        private String extHipo_tasa_mora;
        private String extHipo_tasa_seguro_inc_teremoto;
        private String extHipo_tasa_seguro_vida;
        private String extHipo_texto_informativo1;
        private String extHipo_texto_informativo2;
        private String extHipo_texto_informativo3;
        private String extHipo_texto_informativo4;
        private String extHipo_tipo_credito;
        private String extHipo_tipoDoc;
        private String extHipo_TipoExtracto;
        private String extHipo_total_pagado_pesos;
        private String extHipo_total_pagado_uvr;
        private String extHipo_valor_uvr;
        private String extHipoID;
        private String extHipo_faltante_cuota_anterior2_pesos;
        private String extHipo_faltante_cuota_anterior2_uvr;
        private String extHipo_idColsubsidio;
        private String extHipo_numUnicoRefCorpRecaudo;
        private String extHipo_idClienteSinDigito;

        public String getTipo_extracto() {
            return tipo_extracto;
        }

        public void setTipo_extracto(String tipo_extracto) {
            this.tipo_extracto = tipo_extracto;
        }

        public String getExtHipo_abono_capital_pesos() {
            return extHipo_abono_capital_pesos;
        }

        public void setExtHipo_abono_capital_pesos(String extHipo_abono_capital_pesos) {
            this.extHipo_abono_capital_pesos = extHipo_abono_capital_pesos;
        }

        public String getExtHipo_abono_capital_uvr() {
            return extHipo_abono_capital_uvr;
        }

        public void setExtHipo_abono_capital_uvr(String extHipo_abono_capital_uvr) {
            this.extHipo_abono_capital_uvr = extHipo_abono_capital_uvr;
        }

        public String getExtHipo_abono_capital2_pesos() {
            return extHipo_abono_capital2_pesos;
        }

        public void setExtHipo_abono_capital2_pesos(String extHipo_abono_capital2_pesos) {
            this.extHipo_abono_capital2_pesos = extHipo_abono_capital2_pesos;
        }

        public String getExtHipo_abono_capital2_uvr() {
            return extHipo_abono_capital2_uvr;
        }

        public void setExtHipo_abono_capital2_uvr(String extHipo_abono_capital2_uvr) {
            this.extHipo_abono_capital2_uvr = extHipo_abono_capital2_uvr;
        }

        public String getExtHipo_ciudad() {
            return extHipo_ciudad;
        }

        public void setExtHipo_ciudad(String extHipo_ciudad) {
            this.extHipo_ciudad = extHipo_ciudad;
        }

        public String getExtHipo_comision_fng() {
            return extHipo_comision_fng;
        }

        public void setExtHipo_comision_fng(String extHipo_comision_fng) {
            this.extHipo_comision_fng = extHipo_comision_fng;
        }

        public String getExtHipo_comision_fng_uvr() {
            return extHipo_comision_fng_uvr;
        }

        public void setExtHipo_comision_fng_uvr(String extHipo_comision_fng_uvr) {
            this.extHipo_comision_fng_uvr = extHipo_comision_fng_uvr;
        }

        public String getExtHipo_comision_fng2_pesos() {
            return extHipo_comision_fng2_pesos;
        }

        public void setExtHipo_comision_fng2_pesos(String extHipo_comision_fng2_pesos) {
            this.extHipo_comision_fng2_pesos = extHipo_comision_fng2_pesos;
        }

        public String getExtHipo_comision_fng2_uvr() {
            return extHipo_comision_fng2_uvr;
        }

        public void setExtHipo_comision_fng2_uvr(String extHipo_comision_fng2_uvr) {
            this.extHipo_comision_fng2_uvr = extHipo_comision_fng2_uvr;
        }

        public String getExtHipo_cuota_actual() {
            return extHipo_cuota_actual;
        }

        public void setExtHipo_cuota_actual(String extHipo_cuota_actual) {
            this.extHipo_cuota_actual = extHipo_cuota_actual;
        }

        public String getExtHipo_cuota_pendiente() {
            return extHipo_cuota_pendiente;
        }

        public void setExtHipo_cuota_pendiente(String extHipo_cuota_pendiente) {
            this.extHipo_cuota_pendiente = extHipo_cuota_pendiente;
        }

        public String getExtHipo_cuotas_mora() {
            return extHipo_cuotas_mora;
        }

        public void setExtHipo_cuotas_mora(String extHipo_cuotas_mora) {
            this.extHipo_cuotas_mora = extHipo_cuotas_mora;
        }

        public String getExtHipo_desc_plan_amortizacion() {
            return extHipo_desc_plan_amortizacion;
        }

        public void setExtHipo_desc_plan_amortizacion(String extHipo_desc_plan_amortizacion) {
            this.extHipo_desc_plan_amortizacion = extHipo_desc_plan_amortizacion;
        }

        public String getExtHipo_direccion() {
            return extHipo_direccion;
        }

        public void setExtHipo_direccion(String extHipo_direccion) {
            this.extHipo_direccion = extHipo_direccion;
        }

        public String getExtHipo_fecha_corte() {
            return extHipo_fecha_corte;
        }

        public void setExtHipo_fecha_corte(String extHipo_fecha_corte) {
            this.extHipo_fecha_corte = extHipo_fecha_corte;
        }

        public String getExtHipo_fecha_limite_pago() {
            return extHipo_fecha_limite_pago;
        }

        public void setExtHipo_fecha_limite_pago(String extHipo_fecha_limite_pago) {
            this.extHipo_fecha_limite_pago = extHipo_fecha_limite_pago;
        }

        public String getExtHipo_fecha_ultimo_pago() {
            return extHipo_fecha_ultimo_pago;
        }

        public void setExtHipo_fecha_ultimo_pago(String extHipo_fecha_ultimo_pago) {
            this.extHipo_fecha_ultimo_pago = extHipo_fecha_ultimo_pago;
        }

        public String getExtHipo_gastos_procesales_pesos() {
            return extHipo_gastos_procesales_pesos;
        }

        public void setExtHipo_gastos_procesales_pesos(String extHipo_gastos_procesales_pesos) {
            this.extHipo_gastos_procesales_pesos = extHipo_gastos_procesales_pesos;
        }

        public String getExtHipo_gastos_procesales2_pesos() {
            return extHipo_gastos_procesales2_pesos;
        }

        public void setExtHipo_gastos_procesales2_pesos(String extHipo_gastos_procesales2_pesos) {
            this.extHipo_gastos_procesales2_pesos = extHipo_gastos_procesales2_pesos;
        }

        public String getExtHipo_honorarios_abogado_pesos() {
            return extHipo_honorarios_abogado_pesos;
        }

        public void setExtHipo_honorarios_abogado_pesos(String extHipo_honorarios_abogado_pesos) {
            this.extHipo_honorarios_abogado_pesos = extHipo_honorarios_abogado_pesos;
        }

        public String getExtHipo_honorarios_abogado2_pesos() {
            return extHipo_honorarios_abogado2_pesos;
        }

        public void setExtHipo_honorarios_abogado2_pesos(String extHipo_honorarios_abogado2_pesos) {
            this.extHipo_honorarios_abogado2_pesos = extHipo_honorarios_abogado2_pesos;
        }

        public String getExtHipo_interes_corriente_pesos() {
            return extHipo_interes_corriente_pesos;
        }

        public void setExtHipo_interes_corriente_pesos(String extHipo_interes_corriente_pesos) {
            this.extHipo_interes_corriente_pesos = extHipo_interes_corriente_pesos;
        }

        public String getExtHipo_interes_corriente_uvr() {
            return extHipo_interes_corriente_uvr;
        }

        public void setExtHipo_interes_corriente_uvr(String extHipo_interes_corriente_uvr) {
            this.extHipo_interes_corriente_uvr = extHipo_interes_corriente_uvr;
        }

        public String getExtHipo_interes_corriente2_pesos() {
            return extHipo_interes_corriente2_pesos;
        }

        public void setExtHipo_interes_corriente2_pesos(String extHipo_interes_corriente2_pesos) {
            this.extHipo_interes_corriente2_pesos = extHipo_interes_corriente2_pesos;
        }

        public String getExtHipo_interes_corriente2_uvr() {
            return extHipo_interes_corriente2_uvr;
        }

        public void setExtHipo_interes_corriente2_uvr(String extHipo_interes_corriente2_uvr) {
            this.extHipo_interes_corriente2_uvr = extHipo_interes_corriente2_uvr;
        }

        public String getExtHipo_interes_mora_pesos() {
            return extHipo_interes_mora_pesos;
        }

        public void setExtHipo_interes_mora_pesos(String extHipo_interes_mora_pesos) {
            this.extHipo_interes_mora_pesos = extHipo_interes_mora_pesos;
        }

        public String getExtHipo_interes_mora_uvr() {
            return extHipo_interes_mora_uvr;
        }

        public void setExtHipo_interes_mora_uvr(String extHipo_interes_mora_uvr) {
            this.extHipo_interes_mora_uvr = extHipo_interes_mora_uvr;
        }

        public String getExtHipo_interes_mora2_pesos() {
            return extHipo_interes_mora2_pesos;
        }

        public void setExtHipo_interes_mora2_pesos(String extHipo_interes_mora2_pesos) {
            this.extHipo_interes_mora2_pesos = extHipo_interes_mora2_pesos;
        }

        public String getExtHipo_interes_mora2_uvr() {
            return extHipo_interes_mora2_uvr;
        }

        public void setExtHipo_interes_mora2_uvr(String extHipo_interes_mora2_uvr) {
            this.extHipo_interes_mora2_uvr = extHipo_interes_mora2_uvr;
        }

        public String getExtHipo_minimo_pagar_pesos() {
            return extHipo_minimo_pagar_pesos;
        }

        public void setExtHipo_minimo_pagar_pesos(String extHipo_minimo_pagar_pesos) {
            this.extHipo_minimo_pagar_pesos = extHipo_minimo_pagar_pesos;
        }

        public String getExtHipo_minimo_pagar_uvr() {
            return extHipo_minimo_pagar_uvr;
        }

        public void setExtHipo_minimo_pagar_uvr(String extHipo_minimo_pagar_uvr) {
            this.extHipo_minimo_pagar_uvr = extHipo_minimo_pagar_uvr;
        }

        public String getExtHipo_no_obligacion() {
            return extHipo_no_obligacion;
        }

        public void setExtHipo_no_obligacion(String extHipo_no_obligacion) {
            this.extHipo_no_obligacion = extHipo_no_obligacion;
        }

        public String getExtHipo_no_obligacion_digito() {
            return extHipo_no_obligacion_digito;
        }

        public void setExtHipo_no_obligacion_digito(String extHipo_no_obligacion_digito) {
            this.extHipo_no_obligacion_digito = extHipo_no_obligacion_digito;
        }

        public String getExtHipo_nombre_Cliente() {
            return extHipo_nombre_Cliente;
        }

        public void setExtHipo_nombre_Cliente(String extHipo_nombre_Cliente) {
            this.extHipo_nombre_Cliente = extHipo_nombre_Cliente;
        }

        public String getExtHipo_numDoc() {
            return extHipo_numDoc;
        }

        public void setExtHipo_numDoc(String extHipo_numDoc) {
            this.extHipo_numDoc = extHipo_numDoc;
        }

        public String getExtHipo_otros_cargos_fijos() {
            return extHipo_otros_cargos_fijos;
        }

        public void setExtHipo_otros_cargos_fijos(String extHipo_otros_cargos_fijos) {
            this.extHipo_otros_cargos_fijos = extHipo_otros_cargos_fijos;
        }

        public String getExtHipo_plazo_tot_meses() {
            return extHipo_plazo_tot_meses;
        }

        public void setExtHipo_plazo_tot_meses(String extHipo_plazo_tot_meses) {
            this.extHipo_plazo_tot_meses = extHipo_plazo_tot_meses;
        }

        public String getExtHipo_saldo_total_pesos() {
            return extHipo_saldo_total_pesos;
        }

        public void setExtHipo_saldo_total_pesos(String extHipo_saldo_total_pesos) {
            this.extHipo_saldo_total_pesos = extHipo_saldo_total_pesos;
        }

        public String getExtHipo_saldo_total_uvr() {
            return extHipo_saldo_total_uvr;
        }

        public void setExtHipo_saldo_total_uvr(String extHipo_saldo_total_uvr) {
            this.extHipo_saldo_total_uvr = extHipo_saldo_total_uvr;
        }

        public String getExtHipo_seguros() {
            return extHipo_seguros;
        }

        public void setExtHipo_seguros(String extHipo_seguros) {
            this.extHipo_seguros = extHipo_seguros;
        }

        public String getExtHipo_seguros_uvr() {
            return extHipo_seguros_uvr;
        }

        public void setExtHipo_seguros_uvr(String extHipo_seguros_uvr) {
            this.extHipo_seguros_uvr = extHipo_seguros_uvr;
        }

        public String getExtHipo_seguros2_pesos() {
            return extHipo_seguros2_pesos;
        }

        public void setExtHipo_seguros2_pesos(String extHipo_seguros2_pesos) {
            this.extHipo_seguros2_pesos = extHipo_seguros2_pesos;
        }

        public String getExtHipo_seguros2_uvr() {
            return extHipo_seguros2_uvr;
        }

        public void setExtHipo_seguros2_uvr(String extHipo_seguros2_uvr) {
            this.extHipo_seguros2_uvr = extHipo_seguros2_uvr;
        }

        public String getExtHipo_tasa_comision_fng() {
            return extHipo_tasa_comision_fng;
        }

        public void setExtHipo_tasa_comision_fng(String extHipo_tasa_comision_fng) {
            this.extHipo_tasa_comision_fng = extHipo_tasa_comision_fng;
        }

        public String getExtHipo_tasa_interes_ea() {
            return extHipo_tasa_interes_ea;
        }

        public void setExtHipo_tasa_interes_ea(String extHipo_tasa_interes_ea) {
            this.extHipo_tasa_interes_ea = extHipo_tasa_interes_ea;
        }

        public String getExtHipo_tasa_mora() {
            return extHipo_tasa_mora;
        }

        public void setExtHipo_tasa_mora(String extHipo_tasa_mora) {
            this.extHipo_tasa_mora = extHipo_tasa_mora;
        }

        public String getExtHipo_tasa_seguro_inc_teremoto() {
            return extHipo_tasa_seguro_inc_teremoto;
        }

        public void setExtHipo_tasa_seguro_inc_teremoto(String extHipo_tasa_seguro_inc_teremoto) {
            this.extHipo_tasa_seguro_inc_teremoto = extHipo_tasa_seguro_inc_teremoto;
        }

        public String getExtHipo_tasa_seguro_vida() {
            return extHipo_tasa_seguro_vida;
        }

        public void setExtHipo_tasa_seguro_vida(String extHipo_tasa_seguro_vida) {
            this.extHipo_tasa_seguro_vida = extHipo_tasa_seguro_vida;
        }

        public String getExtHipo_texto_informativo1() {
            return extHipo_texto_informativo1;
        }

        public void setExtHipo_texto_informativo1(String extHipo_texto_informativo1) {
            this.extHipo_texto_informativo1 = extHipo_texto_informativo1;
        }

        public String getExtHipo_texto_informativo2() {
            return extHipo_texto_informativo2;
        }

        public void setExtHipo_texto_informativo2(String extHipo_texto_informativo2) {
            this.extHipo_texto_informativo2 = extHipo_texto_informativo2;
        }

        public String getExtHipo_texto_informativo3() {
            return extHipo_texto_informativo3;
        }

        public void setExtHipo_texto_informativo3(String extHipo_texto_informativo3) {
            this.extHipo_texto_informativo3 = extHipo_texto_informativo3;
        }

        public String getExtHipo_texto_informativo4() {
            return extHipo_texto_informativo4;
        }

        public void setExtHipo_texto_informativo4(String extHipo_texto_informativo4) {
            this.extHipo_texto_informativo4 = extHipo_texto_informativo4;
        }

        public String getExtHipo_tipo_credito() {
            return extHipo_tipo_credito;
        }

        public void setExtHipo_tipo_credito(String extHipo_tipo_credito) {
            this.extHipo_tipo_credito = extHipo_tipo_credito;
        }

        public String getExtHipo_tipoDoc() {
            return extHipo_tipoDoc;
        }

        public void setExtHipo_tipoDoc(String extHipo_tipoDoc) {
            this.extHipo_tipoDoc = extHipo_tipoDoc;
        }

        public String getExtHipo_TipoExtracto() {
            return extHipo_TipoExtracto;
        }

        public void setExtHipo_TipoExtracto(String extHipo_TipoExtracto) {
            this.extHipo_TipoExtracto = extHipo_TipoExtracto;
        }

        public String getExtHipo_total_pagado_pesos() {
            return extHipo_total_pagado_pesos;
        }

        public void setExtHipo_total_pagado_pesos(String extHipo_total_pagado_pesos) {
            this.extHipo_total_pagado_pesos = extHipo_total_pagado_pesos;
        }

        public String getExtHipo_total_pagado_uvr() {
            return extHipo_total_pagado_uvr;
        }

        public void setExtHipo_total_pagado_uvr(String extHipo_total_pagado_uvr) {
            this.extHipo_total_pagado_uvr = extHipo_total_pagado_uvr;
        }

        public String getExtHipo_valor_uvr() {
            return extHipo_valor_uvr;
        }

        public void setExtHipo_valor_uvr(String extHipo_valor_uvr) {
            this.extHipo_valor_uvr = extHipo_valor_uvr;
        }

        public String getExtHipoID() {
            return extHipoID;
        }

        public void setExtHipoID(String extHipoID) {
            this.extHipoID = extHipoID;
        }

        public String getExtHipo_faltante_cuota_anterior2_pesos() {
            return extHipo_faltante_cuota_anterior2_pesos;
        }

        public void setExtHipo_faltante_cuota_anterior2_pesos(String extHipo_faltante_cuota_anterior2_pesos) {
            this.extHipo_faltante_cuota_anterior2_pesos = extHipo_faltante_cuota_anterior2_pesos;
        }

        public String getExtHipo_faltante_cuota_anterior2_uvr() {
            return extHipo_faltante_cuota_anterior2_uvr;
        }

        public void setExtHipo_faltante_cuota_anterior2_uvr(String extHipo_faltante_cuota_anterior2_uvr) {
            this.extHipo_faltante_cuota_anterior2_uvr = extHipo_faltante_cuota_anterior2_uvr;
        }

        public String getExtHipo_idColsubsidio() {
            return extHipo_idColsubsidio;
        }

        public void setExtHipo_idColsubsidio(String extHipo_idColsubsidio) {
            this.extHipo_idColsubsidio = extHipo_idColsubsidio;
        }

        public String getExtHipo_numUnicoRefCorpRecaudo() {
            return extHipo_numUnicoRefCorpRecaudo;
        }

        public void setExtHipo_numUnicoRefCorpRecaudo(String extHipo_numUnicoRefCorpRecaudo) {
            this.extHipo_numUnicoRefCorpRecaudo = extHipo_numUnicoRefCorpRecaudo;
        }

        public String getExtHipo_idClienteSinDigito() {
            return extHipo_idClienteSinDigito;
        }

        public void setExtHipo_idClienteSinDigito(String extHipo_idClienteSinDigito) {
            this.extHipo_idClienteSinDigito = extHipo_idClienteSinDigito;
        }
    }
}
