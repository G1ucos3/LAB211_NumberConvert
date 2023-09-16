package common;

/**
 *
 * @author ASUS
 */
public class Change {

    final static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                      'A', 'B', 'C', 'D', 'E', 'F'};

    public String binToDec(String bin) {
        int dec = Integer.parseInt(bin, 2);
        return Integer.toString(dec);
    }

    public int hexToDec(String hex) {
        int dec = Integer.parseInt(hex, 16);
        return dec;
    }

    public String decToBin(String dec) {
        String bin = Integer.toBinaryString(Integer.parseInt(dec));
        return bin;
    }

    public String hexToBin(String hex) {
        String bin = Integer.toBinaryString(hexToDec(hex));
        return bin;
    }

    public String decToHex(String dec) {
        String hex = "";
        int d = Integer.parseInt(dec);
        while (d != 0) {
            hex = hexDigits[d % 16] + hex;
            d /= 16;
        }
        return hex;
    }
    
    public String binToHex(String bin) {
        String dec = binToDec(bin);
        String hex = decToHex(dec);
        return hex;
    }
}
