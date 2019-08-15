package tech.ndau.b32;

public class CorruptInputError extends Exception {
    private static final long serialVersionUID = 4709708771572879783L;

    public CorruptInputError(int errByte) {
        super(String.format("illegal base32 data at input byte %d", errByte));
    }
}
