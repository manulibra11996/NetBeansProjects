
import java.util.HashMap;
import java.util.HashSet;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Web application lifecycle listener.
 *
 * @author Manuel
 */
@WebListener
public class CreateSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("registro", new HashMap<>());
        se.getSession().setAttribute("compras", new HashMap<>());
        se.getSession().setAttribute("articulos", new HashSet<>());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
