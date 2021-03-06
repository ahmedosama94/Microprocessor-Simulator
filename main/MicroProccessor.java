package main;

import hardware.components.ALUopr;
import hardware.components.Register;
import hardware.components.units.ALUUnit;
import hardware.components.units.AddressUnit;
import hardware.components.units.MainMemory;
import hardware.exceptions.HardwareException;

public class MicroProccessor {
	
	private ALUUnit ALU;
	private AddressUnit addrUnit;
	private MainMemory MM;
	
	public MicroProccessor() {
		ALU = new ALUUnit();
		addrUnit = new AddressUnit();
		MM = new MainMemory(200, 16);
		Register buffer = new Register(16);
		Register.addToBuffers(buffer);
		ALU.setDataInputBus(buffer.getOutputBuffer());
		addrUnit.setAddressInputBus(buffer.getOutputBuffer());
		MM.setInputBuffer(ALU.getDataOutputBus());
	}
	
//	ALU.setRSEL(false);
//	ALU.setRMWrite(false);
//	ALU.setEnableB(false);
//	ALU.setEnableA(false);
//	ALU.setALUOperation(ALUopr.CLEAR);
//	ALU.setEXT(false);
//	ALU.setEDL(false);
//	ALU.setEDH(false);
//	ALU.setDOL(false);
//	ALU.setDOH(false);
//	ALU.setERR(false);
//	addrUnit.setEAL(false);
//	addrUnit.setEAH(false);
//	addrUnit.setESP(false);
//	addrUnit.setEOAR(false);
//	addrUnit.setEPC(false);
//	addrUnit.setCAD(0);
//	MM.setAddress(addrUnit.getAddressOutputBus());
//	MM.setReadWrite(false);
	
	public void MOV$() throws HardwareException {
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(true);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		addrUnit.incPC();
		MM.setReadWrite(false);
		MM.setAddress(addrUnit.getAddressOutputBus());
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(true);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		addrUnit.incPC();
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(true);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(true);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(1);
		addrUnit.incOAR();
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		

		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(true);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(true);
		ALU.setRMWrite(true);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(true);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
	}
	
	public void MOV() throws HardwareException {
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(true);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(true);
		ALU.setRMWrite(true);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.B);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();

		
	}	

	public void ADD$() throws HardwareException {
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(true);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		addrUnit.incPC();
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(true);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		addrUnit.incPC();
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(true);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(true);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(1);
		addrUnit.incOAR();
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(true);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(true);
		ALU.setRMWrite(false);
		ALU.setEnableB(true);
		ALU.setEnableA(true);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(true);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.ADD);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(true);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
	}
	
	public void ADD() throws HardwareException {
		
	}
	
	public void JMPU() throws HardwareException {
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		addrUnit.incPC();
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(true);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		addrUnit.incPC();
		
		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(true);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(false);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		addrUnit.incPC();
		

		Register.clockCycleAll();
		
		ALU.setRSEL(false);
		ALU.setRMWrite(false);
		ALU.setEnableB(false);
		ALU.setEnableA(false);
		ALU.setALUOperation(ALUopr.CLEAR);
		ALU.setEXT(false);
		ALU.setEDL(false);
		ALU.setEDH(false);
		ALU.setDOL(false);
		ALU.setDOH(false);
		ALU.setERR(false);
		addrUnit.setEAL(false);
		addrUnit.setEAH(false);
		addrUnit.setESP(false);
		addrUnit.setEOAR(false);
		addrUnit.setEPC(true);
		addrUnit.setCAD(0);
		MM.setAddress(addrUnit.getAddressOutputBus());
		MM.setReadWrite(false);
		
		Register.clockCycleAll();
		
	}

	
	
}
