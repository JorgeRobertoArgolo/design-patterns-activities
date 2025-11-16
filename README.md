# 📚 Atividades Práticas: Padrões de Projeto GoF
Este documento organiza as instruções detalhadas para as atividades práticas focadas nos Padrões de Criação (Singleton, Builder e Prototype).

## 🏗️ Questão 1: Padrão Singleton (Gerenciamento de Conexões de BD)
### Cenário Fictício
Uma empresa de tecnologia exige que seu sistema de gerenciamento financeiro utilize uma única instância de conexão ao banco de dados para evitar sobrecarga e garantir a eficiência das transações e relatórios.

### Objetivo
Implementar a classe ConexaoBD que siga o padrão Singleton, garantindo que apenas uma única instância de conexão seja criada, independentemente de quantas vezes seja solicitada durante a execução da aplicação.

### Instruções
Descrição do Problema: Garantir uma conexão única ao banco de dados para evitar sobrecarga, mesmo com múltiplas requisições de acesso.

### Requisitos Funcionais:

Implementar a classe ConexaoBD como Singleton.
A classe deve ter um método público getInstance() que retorna a instância única.
A criação da conexão deve ser realizada apenas se a instância ainda não existir.
Simular múltiplas solicitações para provar que a mesma instância é reutilizada.

### Estrutura Proposta e Critérios
Seção	Detalhes	Critérios de Avaliação
Classe Principal	Crie a classe ConexaoBD (responsável pelo Singleton).	Implementação correta do Singleton.
Teste	Crie a classe SistemaFinanceiro para simular requisições.	Uso correto de construtor privado e getInstance().
Saída Esperada	A saída deve mostrar que a conexão é criada apenas uma vez e reutilizada nas chamadas subsequentes.	Múltiplas solicitações devem retornar a mesma instância.

## 🧱 Questão 2: Padrão Builder (Criação de Relatórios Flexíveis)
### Cenário Fictício
Você deve criar um sistema flexível para gerar relatórios financeiros com estruturas variáveis (título, corpo, gráficos, rodapé) e suportar diferentes formatos de saída (PDF, HTML, Word). O padrão Builder será utilizado para gerenciar essa complexidade passo a passo.

### Objetivo
Implementar um sistema que utilize o padrão Builder para gerar relatórios financeiros personalizados, permitindo a criação estruturada de relatórios com diferentes seções e formatos.

### Instruções
Descrição do Problema: A empresa precisa de flexibilidade para gerar relatórios com diversas combinações de seções (Título, Corpo, Gráficos, Rodapé) e múltiplos formatos de saída (PDF, HTML, Word).

### Requisitos Funcionais:

Implementar a interface RelatorioBuilder (define os passos de construção).
Implementar classes Builders concretas para os formatos PDF, HTML e Word.
Implementar a classe Director para controlar e organizar o processo de construção.
Simular a criação de relatórios em diferentes formatos e combinações de seções.

### Estrutura Proposta e Critérios
Seção	Detalhes	Critérios de Avaliação
Interface	Crie a interface RelatorioBuilder.	Implementação correta do padrão Builder (passo a passo).
Builders Concretos	Crie classes Builder para Relatório PDF, HTML e Word.	Flexibilidade na criação de relatórios com diferentes combinações e formatos.
Director	Crie a classe Director para organizar o processo de construção.	Uso adequado da classe Director.
Saída Esperada	A saída deve mostrar os relatórios gerados em diferentes formatos.	Testes que demonstrem a criação de relatórios em diferentes formatos (PDF, HTML, Word).

## 📜 Questão 3: Padrão Prototype (Modelagem de Documentos)
### Cenário Fictício
Uma empresa precisa de um sistema rápido para criar novos documentos legais (contratos e propostas). Para evitar a criação do zero, o sistema deve permitir a clonagem de documentos base (protótipos) para que possam ser personalizados sem alterar o original.

### Objetivo
Implementar um sistema que utilize o padrão Prototype para criar cópias de documentos base (contratos), permitindo sua modificação sem afetar o objeto original.

### Instruções
Descrição do Problema: Otimizar a criação de novos contratos e propostas (que contêm Título, Corpo, Cláusulas e Rodapé) clonando versões pré-existentes e personalizando apenas as seções necessárias.

### Requisitos Funcionais:

Criar uma interface Documento com o método clone().
Implementar a classe concreta Contrato que implementa Documento e contém as seções a serem clonadas.
Simular a clonagem de documentos e a personalização de suas seções (título, corpo, cláusulas, rodapé).

### Estrutura Proposta e Critérios
Seção	Detalhes	Critérios de Avaliação
Interface	Crie a interface Documento com o método clone().	Implementação correta do padrão Prototype.
Protótipo Concreto	Crie a classe Contrato que implementa o método de clonagem.	Personalização dos documentos clonados sem alterar o documento base.
Teste	Crie a classe SistemaDocumentos para simular a clonagem.	Verificação de que as alterações nos clones não afetam o protótipo original.
Saída Esperada	A saída deve mostrar as informações do contrato base e dos clones personalizados.	Testes que simulam a criação de múltiplos contratos a partir de um protótipo base.