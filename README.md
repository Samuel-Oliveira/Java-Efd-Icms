# Java-Efd-Icms [![Build Status](https://travis-ci.org/Samuel-Oliveira/Java-Efd-Icms.svg?branch=master)](https://travis-ci.org/Samuel-Oliveira/Java-Efd-Icms) [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java-Efd-Icms.svg) ](https://github.com/Samuel-Oliveira/Java-Efd-Icms/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-efd-icms.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-efd-icms/3.08.2/jar)
Projeto Para implementação de Efd-Icms(Escrituação Fiscal Digital Icms/Pis) em ambientes Java de Forma Facilitada.

## Dúvidas, Sugestões ou Consultoria
[![Java Brasil](https://discordapp.com/api/guilds/519583346066587676/widget.png?style=banner2)](https://discord.gg/ZXpqnaV)

## Gostou do Projeto? Dê sua colaboração pelo Pix: 01713390108
<img src="https://swconsultoria.com.br/pix.png" width="200">

A Lib abstrai toda a geração dos registros, sendo necessario apenas o preenchimento dos mesmos.
Os Registros de Quantidade de Linhas e quantidades de Registros(Bloco 9) são calculados e gerados automaticamente pela Lib.

Para Iniciar : 
- Caso use Libs baixe o
  java-efd-icms-3.08.2.jar (https://github.com/Samuel-Oliveira/Java-Efd-Icms/raw/master/java-efd-icms-3.08.2.jar) e o
  adicione às bibliotecas de Seu Projeto.

- Aqui Você encontra um Exemplo para preencher e Gerar (https://github.com/Samuel-Oliveira/teste-efd-icms).
- Link Com video explicativo no Youtube: https://www.youtube.com/watch?v=IXUld0HW3A0

- Caso use Maven :
```
<dependency>
  <groupId>br.com.swconsultoria</groupId>
  <artifactId>java-efd-icms</artifactId>
  <version>3.08.2</version>
</dependency>
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java-Efd-Icms/wiki, para ter um Tutorial Completo.
________________________________________________________________________________________________

# Historico de Versões

## v3.08.2 - 20-01-2022

- Adicionado Correções e novos registros relacionado ao manual 3.0.8

## v3.06.2 - 15-01-2021

- Adiciona equals e Hashcode

## v3.06.1 - 21-01-2020

- Adicionado Correções e novos registros relacionado ao manual 3.0.6

## v3.03.1 - 21-01-2020

- Adicionado Correções e novos registros relacionado ao manual 3.0.3

## v3.01.2 - 25-03-2019

- Corrigido erro Registro K250
- Adicionado ao Maven Central

## v3.01.1 - 13-02-2019
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
