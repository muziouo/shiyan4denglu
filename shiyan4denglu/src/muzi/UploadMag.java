package muzi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class UploadMag {
    public void Upload(File file){
        File file1 = file;
        try {
            FileOutputStream fos = new FileOutputStream("/Users/muzi/Documents/IDEA/"+file1.getMyfile().getFileName());
            fos.write(file1.getMyfile().getFileData());
            fos.flush();
            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
