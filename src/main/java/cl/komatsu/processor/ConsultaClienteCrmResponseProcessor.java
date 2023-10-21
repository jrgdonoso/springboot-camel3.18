package cl.komatsu.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.fusesource.camel.component.sap.model.rfc.Table;
import org.springframework.stereotype.Component;

import cl.komatsu.consultarcliente.ConsultarClienteResponse;
import cl.komatsu.consultarcliente.EKnaType;
import cl.komatsu.consultarcliente.GtAdr12Type;
import cl.komatsu.consultarcliente.GtAdr12Type.GTADR12;
import cl.komatsu.consultarcliente.GtAdr6Type;
import cl.komatsu.consultarcliente.GtAdr6Type.GTADR6;
import cl.komatsu.consultarcliente.GtKnvvs;
import cl.komatsu.consultarcliente.GtKnvvs.GTKNVV;
import cl.komatsu.consultarcliente.GtReturnType;
import cl.komatsu.consultarcliente.GtReturnType.GTRETURN;

@Component
public class ConsultaClienteCrmResponseProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Structure consultaClienteCrmStructure  = exchange.getIn().getBody(Structure.class);

		ConsultarClienteResponse response = new ConsultarClienteResponse();
		
		@SuppressWarnings("unchecked")
		Table<Structure> retornoSAP = consultaClienteCrmStructure.get("GT_BPRET", Table.class);
		
		
		GtReturnType gtReturnType = new GtReturnType();
		for(Structure structure : retornoSAP) {
			GTRETURN gtReturn = new GTRETURN();
			gtReturn.setTYPE(structure.get("TYPE", String.class));
			gtReturn.setMESSAGE(structure.get("MESSAGE", String.class));
			gtReturnType.getGTRETURN().add(gtReturn);
		}
		
		response.setGTRETURNS(gtReturnType);
		
		
		
		Structure kna1SAP = consultaClienteCrmStructure.get("E_KNA1", Structure.class);
		
		EKnaType kna1 = new EKnaType();
		kna1.setKUNNR(kna1SAP.get("KUNNR", String.class));
		kna1.setNAME1(kna1SAP.get("NAME1", String.class));
		kna1.setSORTL(kna1SAP.get("SORTL", String.class));
		kna1.setNAME3(kna1SAP.get("NAME3", String.class));
		kna1.setSTRAS(kna1SAP.get("STRAS", String.class));
		kna1.setORT01(kna1SAP.get("ORT01", String.class));
		kna1.setORT02(kna1SAP.get("ORT02", String.class));
		kna1.setLAND1(kna1SAP.get("LAND1", String.class));
		kna1.setREGIO(kna1SAP.get("REGIO", String.class));
		kna1.setTELF1(kna1SAP.get("TELF1", String.class));
		kna1.setBRSCH(kna1SAP.get("BRSCH", String.class));
		kna1.setLZONE(kna1SAP.get("LZONE", String.class));
		kna1.setKTOKD(kna1SAP.get("KTOKD", String.class));
		response.setEKNA1(kna1);
		
		
		@SuppressWarnings("unchecked")
		Table<Structure> gtKNVVSAP = consultaClienteCrmStructure.get("GT_KNVV", Table.class);
		GtKnvvs gTKNVVS = new GtKnvvs();
		
		for(Structure structure : gtKNVVSAP) {
			GTKNVV gtKVV = new GTKNVV();
			gtKVV.setVKORG(structure.get("VKORG", String.class));
			gtKVV.setVTWEG(structure.get("VTWEG", String.class));
			gtKVV.setSPART(structure.get("SPART", String.class));
			gtKVV.setKDGRP(structure.get("KDGRP", String.class));
			gtKVV.setVKBUR(structure.get("VKBUR", String.class));
			gtKVV.setKKBER(structure.get("KKBER", String.class));
			gtKVV.setVKGRP(structure.get("VKGRP", String.class));
			gtKVV.setZTERM(structure.get("ZTERM", String.class));
			gTKNVVS.getGTKNVV().add(gtKVV);
		}
		response.setGTKNVVS(gTKNVVS);
		
		
		@SuppressWarnings("unchecked")
		Table<Structure> gtadr12SAP = consultaClienteCrmStructure.get("GT_ADR12", Table.class);
		
		GtAdr12Type gTADRS12 = new GtAdr12Type();
		for(Structure structure : gtadr12SAP) {
			GTADR12 gTADR12 = new GTADR12();
			gTADR12.setURIADDR(structure.get("URIADDR", String.class));
			gTADR12.setURITYPE(structure.get("URITYPE", String.class));
			gTADRS12.getGTADR12().add(gTADR12);
		}
		response.setGTADRS12(gTADRS12);
		
		@SuppressWarnings("unchecked")
		Table<Structure> gtadr6SAP = consultaClienteCrmStructure.get("GT_ADR6", Table.class);
		
		GtAdr6Type gTADRS6 = new GtAdr6Type();		
		for(Structure structure : gtadr6SAP) {
			GTADR6 gTADR6 = new GTADR6();
			gTADR6 .setSMTPADDR(structure.get("SMTPADDR", String.class));
			gTADRS6.getGTADR6().add(gTADR6);
		}
		response.setGTADRS6(gTADRS6);
						
		exchange.getOut().setBody(response);
	}
}
