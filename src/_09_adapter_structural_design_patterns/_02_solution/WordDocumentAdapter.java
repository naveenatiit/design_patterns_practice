package _09_adapter_structural_design_patterns._02_solution;

public class WordDocumentAdapter implements DocumentUploader {

    private final WordDocumentUploader wordDocumentUploader;

    public WordDocumentAdapter() {
        this.wordDocumentUploader = new WordDocumentUploader();
    }
    @Override
    public void upload() {
        wordDocumentUploader.uploadWordDocument();
    }
}
