package muzi;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadTestAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception{
        UploadActionForm uaf =(UploadActionForm) form;
        File file = new File();
        UploadMag uploadMag = new UploadMag();
        BeanUtils.copyProperties(file, uaf);
        System.out.println("title="+ uaf.getTitle());
        System.out.println("filename="+uaf.getMyfile().getFileName());
        uploadMag.Upload(file);

        return mapping.findForward("success");
    }
}
