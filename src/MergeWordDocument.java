
import java.io.File;
import java.util.Locale;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class MergeWordDocument {

    public static boolean merge(String docPath,String desPath){

        // 0、将语言设置为中文，以处理 PDF 中可能存在的中文字符
        Locale locale = new Locale("zh", "CN");
        Locale.setDefault(locale);

        File[] fs = getSplitFiles(docPath);
        System.out.println(docPath);
        Document document = new Document(docPath+"test0.docx");

        for(int i=1;i<fs.length;i++) {
             document.insertTextFromFile(docPath+"test"+i+".docx",FileFormat.Docx_2013);
        }
        //第四步：对合并的doc进行保存2
        document.saveToFile(desPath);
        return true;
    }
    // 取得某一路径下所有的pdf
    private static File[] getSplitFiles(String path) {
        File f = new File(path);
        File[] fs = f.listFiles();
        if (fs == null) {
            return null;
        }
        return fs;
    }

}
