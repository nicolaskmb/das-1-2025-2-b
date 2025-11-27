package br.univille.microkernel_interface.service;

import java.util.HashMap;
import org.springframework.http.HttpStatusCode;

public interface DefaultService {
    HttpStatusCode doWork(HashMap<String, String> params);
    
    

}
