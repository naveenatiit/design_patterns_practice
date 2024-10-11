package _09_adapter_structural_design_patterns._02_solution;

public class OnlineApplication {

    private final DocumentUploader documentUploader;

    public OnlineApplication(DocumentUploader documentUploader) {
        this.documentUploader = documentUploader;
    }

    public void uploadDocument() {
        documentUploader.upload();
    }


}
