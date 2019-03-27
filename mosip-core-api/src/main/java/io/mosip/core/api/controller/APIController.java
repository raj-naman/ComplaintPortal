package io.mosip.core.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.mosip.core.api.model.Address;
import io.mosip.core.api.response.AddressResponse;
import io.mosip.core.api.response.UINReprintResponse;
import io.mosip.core.api.response.VINGeneration;
import io.mosip.core.api.response.VINRevoke;

@RestController
@RequestMapping("/mosip/core/v1.0/api")
public class APIController {
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	@RequestMapping("/test")
	public String test() {
		return "Working";
	}
	
	
	@RequestMapping(value="/vin/generate" ,method=RequestMethod.POST)
	public VINGeneration genVINPOST(@RequestParam(value="uin", defaultValue="NA") String uin) {
		if(uin==null||uin.equalsIgnoreCase("NA")) {
			return new VINGeneration(0L,"Failed","Invalid UIN",sdf.format(new Date(System.currentTimeMillis())));
		}else {
			//db maintain
		return new VINGeneration(System.currentTimeMillis(),"OK","Accepted",sdf.format(new Date(System.currentTimeMillis())));
		}
	}
	

	@RequestMapping(value="/vin/generate" ,method=RequestMethod.GET)
	public VINGeneration genVINGET(@RequestParam(value="uin", defaultValue="NA") String uin) {
		if(uin==null||uin.equalsIgnoreCase("NA")) {
			return new VINGeneration(0L,"Failed","Invalid UIN",sdf.format(new Date(System.currentTimeMillis())));
			
		}else {
			//db maintain
		return new VINGeneration(System.currentTimeMillis(),"OK","Accepted",sdf.format(new Date(System.currentTimeMillis())));
		}
	}
	
	
	@RequestMapping(value="/vin/revoke" ,method=RequestMethod.POST)
	public VINRevoke revVINPOST(@RequestParam(value="vin", defaultValue="0") Long vin) {
		if(vin==null||vin.longValue()<=0) {
			return new VINRevoke(0L,"Failed","Invalid UIN",sdf.format(new Date(System.currentTimeMillis())));
		}else {
			//db maintain
		return new VINRevoke(vin.longValue(),"OK","VIN Revoked Successfully",sdf.format(new Date(System.currentTimeMillis())));
		}
	}
	

	@RequestMapping(value="/vin/revoke" ,method=RequestMethod.GET)
	public VINRevoke revVINGET(@RequestParam(value="vin", defaultValue="0") Long vin) {
		if(vin==null||vin.longValue()<=0) {
			return new VINRevoke(0L,"Failed","Invalid vin",sdf.format(new Date(System.currentTimeMillis())));
		}else {
			//db maintain
		return new VINRevoke(vin.longValue(),"OK","VIN Revoked Successfully",sdf.format(new Date(System.currentTimeMillis())));
		}
	}
	
	
	
	@RequestMapping(value="/uin/reprint" ,method=RequestMethod.POST)
	public UINReprintResponse requestReprintPOST(@RequestParam(value="uin", defaultValue="NA") String uin) {
		if(uin==null||uin.equalsIgnoreCase("NA")) {
			return new UINReprintResponse(0L,"Failed","Invalid UIN",sdf.format(new Date(System.currentTimeMillis())));
		}else {
			//db maintain
		return new UINReprintResponse(Long.parseLong(uin),"OK","Reprint Successfully",sdf.format(new Date(System.currentTimeMillis())));
		}
	}
	

	@RequestMapping(value="/uin/reprint" ,method=RequestMethod.GET)
	public UINReprintResponse requestReprintGET(@RequestParam(value="uin", defaultValue="NA") String uin) {
		if(uin==null||uin.equalsIgnoreCase("NA")) {
			return new UINReprintResponse(0L,"Failed","Invalid UIN",sdf.format(new Date(System.currentTimeMillis())));
		}else {
			//db maintain
		return new UINReprintResponse(Long.parseLong(uin),"OK","Reprint Successfully",sdf.format(new Date(System.currentTimeMillis())));
		}
	}
	
	@RequestMapping(value="/uin/update" ,method=RequestMethod.POST)
	public AddressResponse updateRequest(@RequestBody Address add) {
		AddressResponse resp=validateData(add);
		if(resp.getStatus().equalsIgnoreCase("Failed"))return resp;
		else {
			//db maintain
			
			return resp;
		}
		
	}
	//
	public AddressResponse validateData(Address add) {
		AddressResponse resp=new AddressResponse();
		resp.setUin(add.getUin());
		resp.setTimestamp(sdf.format(new Date(System.currentTimeMillis())));
		if(add.getName()==null||add.getName().length()<=0) {
			resp.setMessage("Invalid Name");
			resp.setStatus("Failed");
		}else if(add.getCountry()==null||add.getCountry().length()<=0) {
			resp.setMessage("Invalid Country");
			resp.setStatus("Failed");
		}else if(add.getDist()==null||add.getDist().length()<=0) {
			resp.setMessage("Invalid Distric");
			resp.setStatus("Failed");
		}else if(add.getUin()<=0) {
			resp.setMessage("Invalid UIN");
			resp.setStatus("Failed");
		}else {
			resp.setMessage("Request Recieved");
			resp.setStatus("Success");
		}
		return resp;
	}

}
