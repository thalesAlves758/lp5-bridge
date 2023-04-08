public class DOCConverter implements FileConverter {
    public String convertFile(String filepath) {
        return filepath.split(".")[0] + ".doc";
    }
}
