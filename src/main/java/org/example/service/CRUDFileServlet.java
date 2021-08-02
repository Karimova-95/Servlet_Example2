package org.example.service;

import lombok.Data;
import org.example.entity.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Data
public class CRUDFileServlet {
    private File file;

    public CRUDFileServlet() {
        this.file = new File("C:\\Users\\hp\\IdeaProjects\\Servlet_Example2", "crud.json");
    }

    public File addToFile(List<User> users) {
        User[] array = users.toArray(new User[users.size()]);
        try(FileWriter writer = new FileWriter(file, false)) {
            writer.write(Arrays.toString(array));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
