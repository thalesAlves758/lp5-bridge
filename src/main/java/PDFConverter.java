public class PDFConverter implements FileConverter {
    public String convertFile(String filepath) {
        return filepath.split(".")[0] + ".pdf";
    }
}
