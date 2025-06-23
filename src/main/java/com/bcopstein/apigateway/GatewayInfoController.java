package com.bcopstein.apigateway;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GatewayInfoController {

    @GetMapping("/")
    public String gatewayInfo() {
        return """
            <h1>API Gateway - Projeto T2</h1>
            <p>Bem-vindo ao Gateway da Projarq!</p>
            <h2>Serviços Disponíveis:</h2>
            <ul>
                <li><strong>Vendas Service:</strong> <a href="/vendas">/vendas/**</a></li>
                <li><strong>Taxes Service:</strong> <a href="/taxes">/taxes/**</a></li>
                <li><strong>History Service:</strong> <a href="/history">/history/**</a></li>
            </ul>
            <h2>Endpoints Principais:</h2>
            <ul>
                <li>Produtos: <code>/vendas/produtos</code></li>
                <li>Estoque: <code>/vendas/estoque</code></li>
                <li>Novo Orçamento: <code>/vendas/novoOrcamento</code> (POST)</li>
                <li>Efetivar Orçamento: <code>/vendas/efetivaOrcamento/{id}</code></li>
                <li>Calcular Imposto: <code>/taxes/calculate</code> (POST)</li>
            </ul>
            """;
    }

    @GetMapping("/health")
    public String health() {
        return "Gateway is running!";
    }
} 