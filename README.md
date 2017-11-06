# Java-Efd-Icms [![Build Status](https://travis-ci.org/Samuel-Oliveira/Java-Efd-Icms.svg?branch=master)](https://travis-ci.org/Samuel-Oliveira/Java-Efd-Icms)
Projeto Para implementação de Efd-Icms(Escrituação Fiscal Digital Icms/Pis) em ambientes Java de Forma Facilitada.

JavaDoc -> https://samuel-oliveira.github.io/Java-Efd-Icms/

## Gostou do Projeto? Dê sua colaboração: [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=TX9K693QQYA6W)

A Lib abstrai toda a geração dos registros, sendo necessario apenas o preenchimento dos mesmos.
Os Registros de Quantidade de Linhas e quantidades de Registros(Bloco 9) são calculados e gerados automaticamente pela Lib.


Para Iniciar : 
- Baixe o java-efd-icms-2.0.21.1.jar (https://github.com/Samuel-Oliveira/Java-Efd-Icms/raw/master/java-efd-icms-2.0.21.1.jar) e o adicione às bibliotecas de Seu Projeto.
- Aqui Você encontra um Exemplo para preencher e Gerar (https://github.com/Samuel-Oliveira/Java-Efd-Icms/raw/master/Exemplo-Java-Efd-Icms.rar).

- Maven :
```
	    <repository>
			<name>Repositorio Autocom</name>
			<id>autocom</id>
			<url>http://www.autocomsistemas.com.br:8081/nexus/content/repositories/autocom/</url>
		</repository>
		<dependency>
			<groupId>br.com.samuelweb</groupId>
			<artifactId>java-efd-icms</artifactId>
			<version>2.0.21.1</version>
		</dependency>
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java-Efd-Icms/wiki, para ter um Tutorial Completo.

# Historico de Versões

## v2.0.21.1 - 06-11-2017
- Corrigido Erro de COntador Statico no Bloco 9
- Adicionado Campos para Versão 2.0.21

## v2.0.20.1 - 20-09-2017
- Corrigido Erros De iteração de registros.
- Corrigido erro de espaços no final.

## v2.0.20.0 - 24-04-2017
- Versão Inicial
- Ja Engloba a Versão Atual(2.0.20) do Manual.

Outras Duvidas Entrar em Contato samuk.exe@hotmail.com
