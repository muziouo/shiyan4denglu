package muzi;

import org.apache.struts.upload.FormFile;

public class File {
    private String title;
    private FormFile myfile;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public FormFile getMyfile(){
        return myfile;
    }

    public void setMyfile(FormFile myfile) {
        this.myfile = myfile;
    }
}
