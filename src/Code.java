public class Code {
    private int length;
    private String code;

    public Code(int length) {
        this.length = length;
    }

    private boolean validateCode(String code) {
        return code != null;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
