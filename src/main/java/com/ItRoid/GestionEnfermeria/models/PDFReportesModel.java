package com.ItRoid.GestionEnfermeria.models;

import org.springframework.http.HttpHeaders;

public class PDFReportesModel {

    private byte[] contents;
    private HttpHeaders headers;

    public PDFReportesModel() {
    }

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }
}
