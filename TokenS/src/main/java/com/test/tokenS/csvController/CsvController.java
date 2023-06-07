package com.test.tokenS.csvController;

import com.test.tokenS.csvService.CsvService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;



@RestController
public class CsvController {

    @Autowired
    CsvService csvService;

    @PostMapping("/uploadCsv")
    public String[] uploadCSV(@RequestParam("file") MultipartFile file) throws IOException {
        return csvService.csvToStringArray(file);
    }
}





