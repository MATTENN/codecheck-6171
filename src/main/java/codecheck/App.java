package codecheck;

public class App {
	public static void main(String[] args) {
        File inf = new File("base64.txt");
        FileInputStream fi = new FileInputStream(inf);
        byte[] indata = new byte[(int) inf.length()];
        fi.read(indata);
        fi.close();
	}
}
