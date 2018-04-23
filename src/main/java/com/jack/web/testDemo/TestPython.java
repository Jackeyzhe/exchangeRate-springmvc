package com.jack.web.testDemo;

import org.python.util.PythonInterpreter;

import java.io.IOException;

public class TestPython {
    public static void main(String[] args) throws IOException {
//        PythonInterpreter pythonInterpreter = new PythonInterpreter();
//        pythonInterpreter.execfile("/home/jackeyzhe/IdeaProjects/exchangeRate-springmvc/src/main/webapp/python/exchangerate.py");
        Runtime.getRuntime().exec("python /home/jackeyzhe/IdeaProjects/exchangeRate-springmvc/src/main/webapp/python/exchangerate.py");
    }
}
