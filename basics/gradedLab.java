package basics;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class gradedLab{

    public static String getMd5Digest(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());
        byte[] digest = md.digest();
        return toHexString(digest);
    }

    private static String toHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String message = "This is a message to be encoded using MD5";
        String md5Digest = getMd5Digest(message);
        System.out.println("MD5 Digest Code: " + md5Digest);
    }
}

