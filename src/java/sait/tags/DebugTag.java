/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.tags;

import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author 687159
 */
public class DebugTag extends TagSupport
{
    @Override
    public int doStartTag() throws JspException 
    {
        ServletRequest request = pageContext.getRequest();
        String domain = request.getServerName();
        if (domain.startsWith("test") || domain.equals("localhost"))
        {
            String debug = request.getParameter("debug");
            if (debug != null)
            {
                return EVAL_BODY_INCLUDE;
            }
            else
            {
                return SKIP_BODY;
            }  
        }
        return SKIP_BODY;
    }
}
