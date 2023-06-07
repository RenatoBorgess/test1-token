package com.test.tokenS.csvService;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

@Service
public class CsvService {

    public String[] csvToStringArray(MultipartFile file) throws IOException {
        BufferedReader fileReader = new BufferedReader(new
                InputStreamReader(file.getInputStream(), "UTF-8"));
        CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);

        Stream<CSVRecord> csvRecordStream = csvParser.getRecords().stream();

        String[] names = csvRecordStream
                .map(csvRecord -> csvRecord.values())
                .flatMap(Arrays::stream)
                .toArray(String[]::new);

        return names;
    }
}
