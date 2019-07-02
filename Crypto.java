
/**
* The cryptography class
*/
public class Crypto {

  /**
   * A State object
   */
  public class State {
    public int b0;
    public int b1;
    public int b2;
    public int b3;
  }

  /**
	 * ?
	 * 
	 * @param b
	 *            ?
   * @param r
	 *            ?
	 * @return ?
	 */
  public static int rotl(int b, int r) {
    return ((b << r) & 0xff) | (b >> (8 - r));
  }

  /**
	 * ?
	 * 
	 * @param state
	 *            ?
	 * @return ?
	 */
  public static String permuteFwd(State state) {
    return null;
  }

  /**
	 * ?
	 * 
	 * @param state
	 *            ?
	 * @return ?
	 */
  public static String permuteBwd(State state) {
    return null;
  }

  /**
	 * ?
	 * 
	 * @param x
	 *            ?
   * @param y
	 *            ?
	 * @return ?
	 */
  public static String xor4(String key, String ip) {
    return "";
  }

  /**
	 * Encryption method
	 * 
	 * @param key
	 *            The encryption key
   * @param ip
	 *            The IP address to decrypt
	 * @return The encrypted IP address
	 */
  public static String encrypt(String key, String ip) {
    return "";
  }

  /**
	 * Decryption method
	 * 
	 * @param key
	 *            The decryption key
   * @param ip
	 *            The IP address to decrypt 
	 * @return The decrypted ip address
	 */
  public static String decrypt(String key, String ip) {
    return "";
  }

  /**
	 * Usage logs
	 */
  public static void usage() {

  }

  /**
	 * Encryption algorithm sanity chheck
	 */
  public static Boolean test() {

    return true;
  }

  /**
	 * Validate the IPV4 address
	 * 
	 * @param s
	 *            The IP address in string format
	 * @return Validation result boolean
	 */
  public static Boolean validateIp(String s) {

    return true;
  }

  /**
	 * Validate IP address 0.0.0.0
	 * 
	 * @param s
	 *            The IP address in string format
	 * @return Validation result boolean
	 */
  public static Boolean validateIpZeros(String s) {

    return true;
  }
  
  public static void main(String[] args) {
    // Ensure key is 16 bytes

    // Perform encryption algroithm sanity check

    // Load file

    // 

  }
} 