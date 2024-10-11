package _09_adapter_structural_design_patterns._02_solution;

public class PdfDocumentUploader implements DocumentUploader {


    @Override
    public void upload() {
        System.out.println("Preparing PDF document...");
        System.out.println("Uploading PDF document");
    }
}
