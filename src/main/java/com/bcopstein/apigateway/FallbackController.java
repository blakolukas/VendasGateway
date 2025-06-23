package com.bcopstein.apigateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    
    @GetMapping("/vendas")
    public ResponseEntity<String> vendasFallback() {
        return ResponseEntity
            .status(HttpStatus.SERVICE_UNAVAILABLE)
            .body("Serviço de Vendas temporariamente indisponível. Tente novamente em alguns instantes.");
    }
    
    @GetMapping("/taxes")
    public ResponseEntity<String> taxesFallback() {
        return ResponseEntity
            .status(HttpStatus.SERVICE_UNAVAILABLE)
            .body("Serviço de Impostos temporariamente indisponível. Tente novamente em alguns instantes.");
    }
    
    @GetMapping("/history")
    public ResponseEntity<String> historyFallback() {
        return ResponseEntity
            .status(HttpStatus.SERVICE_UNAVAILABLE)
            .body("Serviço de Histórico temporariamente indisponível. Tente novamente em alguns instantes.");
    }
}
