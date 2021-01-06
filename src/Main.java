import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            String path = args[0];

            // 检查文件是否存在
            File f = new File(path);
            if (f.exists() && !f.isDirectory()) {
                String res = new PdfToWord().pdftoword(path);
                System.out.println("\n" + path + "\n -> " + res);
            } else {
                System.out.println("错误：文件 '" + path + "' 不存在");
            }

        } else {
            System.out.println("请传入一个 PDF 文件的路径！");
        }
    }
}
