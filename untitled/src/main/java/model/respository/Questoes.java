package model.respository;

import java.io.*;

import model.exception.Exception;
import javax.swing.filechooser.FileSystemView;

public class Questoes {
        String[] lines = new String[]{
                "1 - Qual o nome e sobrenome do pet?",
                "2 - Qual o tipo do pet (Cachorro/Gato)?",
                "3 - Qual o sexo do animal?",
                "4 - Qual endereço e bairro que ele foi encontrado?",
                "5 - Qual a idade aproximada do pet?",
                "6 - Qual o peso aproximado do pet?",
                "7 - Qual a raça do pet?"
        };

        public void criar() {
            String documents = FileSystemView.getFileSystemView().getDefaultDirectory().getAbsolutePath();
            String path = documents + "/Documents/perguntas.txt";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                for (String perguntas : lines) {
                    bw.write(perguntas+"\n");
                }
            } catch (IOException e) {
                throw new Exception("Erro ao criar o arquivo. -- " + e.getMessage());
            }
        }

        public void lerRespostas(String path) {

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line = br.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            }
            catch (IOException e) {
                throw new Exception("Error: " + e.getMessage());
            }
        }
}