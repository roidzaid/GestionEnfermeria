package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.PDFReportesModel;
import com.ItRoid.GestionEnfermeria.models.PracticaModel;
import com.ItRoid.GestionEnfermeria.models.ResaproModel;
import com.ItRoid.GestionEnfermeria.services.PracticaService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("pdf")
public class JasperController {

    Logger logger = LoggerFactory.getLogger(LoteController.class);

    @Autowired
    private PracticaService practicaService;


    // Method to create the pdf report via jasper framework.
    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/recuperos/{fechaDesde}/{fechaHasta}")
    public ResponseEntity<?> ReportRecuperos(@PathVariable("fechaDesde")String fechaDesde, @PathVariable("fechaHasta")String fechaHasta)  {
        logger.info("se genera pdf para recuperos");

        try {

            PDFReportesModel pdfReportesModel  = createPdfReport(this.practicaService.findPracticasXRecuperoModel(fechaDesde, fechaHasta));

            logger.info("PDF generado");
            return new ResponseEntity<PDFReportesModel>(pdfReportesModel, HttpStatus.OK);

        } catch (Exception e) {
            logger.error("error al generar PDF");

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

     private PDFReportesModel createPdfReport(final List<PracticaModel> practicas) throws JRException, FileNotFoundException {

        PDFReportesModel pdfReportesModel = new PDFReportesModel();

        try {

            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(practicas);

            JasperDesign pathReports = JRXmlLoader.load(this.getClass().getResourceAsStream("/reports/Recuperos.jrxml"));
            JasperReport compileReport = JasperCompileManager.compileReport(pathReports);
            Map<String, Object> map = new HashMap<>();

            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);

            byte[] contents = JasperExportManager.exportReportToPdf(report);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            String filename = "Recuperos.pdf";
            headers.setContentDispositionFormData(filename, filename);
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

            pdfReportesModel.setContents(contents);
            pdfReportesModel.setHeaders(headers);


        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return pdfReportesModel;
    }


    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/resapro/{fechaDesde}/{fechaHasta}")
    public ResponseEntity<?> ReportResapro(@PathVariable("fechaDesde")String fechaDesde, @PathVariable("fechaHasta")String fechaHasta)  {
        logger.info("se genera pdf para resapro");

        try {

            PDFReportesModel pdfReportesModel  = createPdfResapro(this.practicaService.findResapro(fechaDesde, fechaHasta));

            logger.info("PDF generado");
            return new ResponseEntity<PDFReportesModel>(pdfReportesModel, HttpStatus.OK);

        } catch (Exception e) {
            logger.error("error al generar PDF");

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    private PDFReportesModel createPdfResapro(final List<ResaproModel> resapros) throws JRException, FileNotFoundException {

        PDFReportesModel pdfReportesModel = new PDFReportesModel();

        try {

            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(resapros);

            JasperDesign pathReports = JRXmlLoader.load(this.getClass().getResourceAsStream("/reports/Ressapro.jrxml"));
            JasperReport compileReport = JasperCompileManager.compileReport(pathReports);
            Map<String, Object> map = new HashMap<>();

            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);

            byte[] contents = JasperExportManager.exportReportToPdf(report);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            String filename = "Resapro.pdf";
            headers.setContentDispositionFormData(filename, filename);
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

            pdfReportesModel.setContents(contents);
            pdfReportesModel.setHeaders(headers);


        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return pdfReportesModel;
    }

}
