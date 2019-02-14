# Java-Efd-Icms [![Build Status](https://travis-ci.org/Samuel-Oliveira/Java-Efd-Icms.svg?branch=master)](https://travis-ci.org/Samuel-Oliveira/Java-Efd-Icms) [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java-Efd-Icms.svg) ](https://github.com/Samuel-Oliveira/Java-Efd-Icms/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-efd-icms.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-efd-icms/3.0.1.0/jar)
Projeto Para implementação de Efd-Icms(Escrituação Fiscal Digital Icms/Pis) em ambientes Java de Forma Facilitada.

## Dúvidas, Sugestões ou Consultoria
Entre no Discord do Projeto: https://discord.gg/ZXpqnaV

## Gostou do Projeto? Dê sua colaboração: [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=TX9K693QQYA6W)

A Lib abstrai toda a geração dos registros, sendo necessario apenas o preenchimento dos mesmos.
Os Registros de Quantidade de Linhas e quantidades de Registros(Bloco 9) são calculados e gerados automaticamente pela Lib.


Para Iniciar : 
- Caso use Libs baixe o java-efd-icms-3.0.1.0.jar (https://github.com/Samuel-Oliveira/Java-Efd-Icms/raw/master/java-efd-icms-3.0.1.0.jar) e o adicione às bibliotecas de Seu Projeto.

- Aqui Você encontra um Exemplo para preencher e Gerar (https://github.com/Samuel-Oliveira/Java-Efd-Icms/raw/master/Exemplo-Java-Efd-Icms.rar).

- Caso use Maven :
```
<dependency>
    <groupId>br.com.swconsultoria</groupId>
    <artifactId>java-efd-icms</artifactId>
    <version>3.0.1.0</version>
</dependency>
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java-Efd-Icms/wiki, para ter um Tutorial Completo.
________________________________________________________________________________________________

# Historico de Versões

## v3.0.1.0 - 13-02-2019
- Upgrade para versão 3.0.1

## v2.0.21.1 - 06-11-2017
- Corrigido Erro de COntador Statico no Bloco 9
- Adicionado Campos para Versão 2.0.21

## v2.0.20.1 - 20-09-2017
- Corrigido Erros De iteração de registros.
- Corrigido erro de espaços no final.

## v2.0.20.0 - 24-04-2017
- Versão Inicial
- Ja Engloba a Versão Atual(2.0.20) do Manual.