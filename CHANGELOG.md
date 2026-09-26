# Notas de versão

- Correção de thread-safety: as classes `GerarBloco0/1/9/B/C/D/E/G/H/K` guardavam o acumulador de saída e o contador de linhas do Bloco 9 em campos `static`, compartilhados entre chamadas. Duas gerações concorrentes na mesma JVM podiam corromper o `StringBuilder` uma da outra e trocar a contagem de `QTD_LIN_9`. O conserto é refatoração pura: o campo `static` foi removido e passou a ser usado o parâmetro recebido em `gerar(...)`.
- **Para uso sequencial (o único cenário anterior), a saída não muda em nenhum byte** — a suíte de testes compara a geração com o arquivo de referência publicado e continua idêntica. A única mudança de comportamento é sob concorrência, que passa a produzir arquivos corretos em vez de corrompidos.
- Nenhuma assinatura pública mudou.
- Registro D730 passa a emitir o campo `VL_RED_BC`. O campo já existia em `RegistroD730` (com getter), mas o gerador da linha não o escrevia, enquanto D190, D300, D590, D610, D690 e D696 já o emitiam. Contribuição de @MauricioCarrion (PR #10).
