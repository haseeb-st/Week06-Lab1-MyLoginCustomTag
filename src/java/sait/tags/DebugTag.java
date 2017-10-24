/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.tags;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author 687159
 */
public class DebugTag extends SimpleTagSupport
{
    public void doTag() throws JspException, IOException 
    {
        PageContext context = (PageContext) getJspContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        // Output body of tag only if debug param is present.
        if (request.getParameter("debug") != null) 
        {
            getJspBody().invoke(null);
        }
    }
}
