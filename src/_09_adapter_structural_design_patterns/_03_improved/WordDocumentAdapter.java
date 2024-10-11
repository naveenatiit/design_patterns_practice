package _09_adapter_structural_design_patterns._03_improved;

public class WordDocumentAdapter extends WordDocumentUploader implements DocumentUploader {

    @Override
    public void upload() {
        uploadWordDocument();
    }

    @Override
    public void uploadWordDocument() {
        System.out.println("Preparing Word document...");
        System.out.println("Uploading Word document");
    }
}
