import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Account> list = new HashMap<>();
        Account account = new Account("hoang", "abcdef", "123456");
        Account account1 = new Account("nhan", "admin", "123456");
        Account account2 = new Account("vy", "vyhuy", "123456");
        Account account3 = new Account("quang", "hoang", "123456");
        list.put(account.getUser(), account);
        list.put(account1.getUser(), account1);
        list.put(account2.getUser(), account2);
        list.put(account3.getUser(), account3);

        String username = request.getParameter("user");
        String password = request.getParameter("password");
        boolean isExist = list.containsKey(username);
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        if (isExist) {
            if (list.get(username).getPassword().equals(password)) {
                Account accounts = list.get(username);
                writer.println("<h1> Danh sach</h1>");
                writer.println("<h2>" + accounts.getFullname()+ "</h2>");
            } else {
                writer.println("Ban nhap sai mat khau");
            }
        } else {
            writer.println("tai khoan khong ton tai");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
