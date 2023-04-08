public abstract class FileConverterService {
    protected FileConverter fileConverter;

    public String convertToPdf(String filepath) {
        this.fileConverter = new PDFConverter();
        String convertedFile = fileConverter.convertFile(filepath);
        this.fileConverter = null;

        return convertedFile;
    }

    public String convertToDoc(String filepath) {
        this.fileConverter = new DOCConverter();
        String convertedFile = fileConverter.convertFile(filepath);
        this.fileConverter = null;

        return convertedFile;
    }

    public abstract String convert(String filepath);
}
