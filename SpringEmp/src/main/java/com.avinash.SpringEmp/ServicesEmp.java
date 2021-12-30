package com.avinash.SpringEmp;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
    public class ServicesEmp {

        private Map<String, String> EmployeeService = new HashMap<>();

        public void add(String id, String name) {
            EmployeeService.put(id, name);
        }

        public Map<String, String> getAll() {
            return EmployeeService;
        }

        public String get(String id) {
            return EmployeeService.get(id);
        }

        public String delete(String id) {
            return EmployeeService.remove(id);
        }

    }
