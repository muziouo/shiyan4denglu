package muzi;

import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DynaActionFormTestAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        DynaActionForm daf = (DynaActionForm) form;
        String username = (String) daf.get("username");
        Integer age = (Integer) daf.get("age");


        System.out.println("username=" + username);
        System.out.println("age=" + age);
        request.setAttribute("a",age);
        request.setAttribute("u",username);
       return mapping.findForward("success");

    }
}
