package _09_adapter_structural_design_patterns._02_solution;

public class App {

    public static void main(String[] args) {
        var pdfDocumentUploader = new PdfDocumentUploader();
        var onlineApplication = new OnlineApplication(pdfDocumentUploader);
        onlineApplication.uploadDocument();

        var wordDocumentUploader = new WordDocumentAdapter();
        var onlineApplication2 = new OnlineApplication(wordDocumentUploader);
        onlineApplication2.uploadDocument();
    }

}
