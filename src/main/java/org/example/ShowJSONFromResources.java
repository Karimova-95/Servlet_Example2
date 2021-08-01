package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;

public class ShowJSONFromResources extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        InputStream file = ShowJSONFromResources.class.getResourceAsStream("/config/text.json");
        InputStreamReader inputReader = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(inputReader);
        String line = null;
        while ((line = br.readLine()) != null) {
            writer.write(line);
        }
    }
}
