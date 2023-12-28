package com.conduent.pbm.rebate.tasks.controller;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conduent.pbm.rebate.TasksConstants;
import com.conduent.pbm.rebate.manufacturerservice.model.Mfg;
import com.conduent.pbm.rebate.manufacturerservice.repository.MfgRepository;
import com.conduent.pbm.rebate.tasks.property.GeneratePdfReport;

@RestController
@RequestMapping(TasksConstants.APPLICATION_CONTEXT + TasksConstants.MODULE_PATH)
public class BekarController {
	@Autowired
	private MfgRepository mfgRepository;

	@PostMapping(path = TasksConstants.pdfonly, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> citiesReport() {

		List<Mfg> cities = (List<Mfg>) mfgRepository.getAllManufacturers();

		ByteArrayInputStream bis = GeneratePdfReport.AddingText(cities);

		var headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}

}
