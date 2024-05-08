import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class WordFrequencyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int count =0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Kirill\\Desktop\\text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s,.!?;]+");
                for (String word : words) {
                    if (word!=null && word.equalsIgnoreCase(request.getParameter("word"))) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Поиск частоты слова в тексте</h1>");
        response.getWriter().println("Частота слова в тексте:"+count);
        response.getWriter().println("</body></html>");

    }
}