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

# 🧩 Padrões Estruturais e Comportamentais GoF

Esta seção agrupa as atividades focadas em padrões de organização de classes e objetos (Estruturais) e de comunicação entre objetos (Comportamentais).

## 🔗 Questão 1: Padrão Adapter (Integração de Pagamentos)

### Cenário Fictício

Um e-commerce precisa integrar novas APIs de pagamento (PayPal, Stripe) que possuem interfaces incompatíveis com o sistema interno existente.

### Objetivo

Utilizar o padrão Adapter para converter as interfaces externas (PayPal e Stripe) para a interface interna do sistema (Pagamento), sem modificar o código existente.

### Requisitos Funcionais:

- Criar a interface Pagamento (Target).
- Simular as APIs externas APIServicePayPal e APIServiceStripe (Adaptees).
- Implementar as classes PayPalAdapter e StripeAdapter para traduzir as chamadas das APIs externas para a interface Pagamento.

### Estrutura Proposta:

O sistema de teste (SistemaPagamento) deve interagir apenas com a interface Pagamento, comprovando que os adaptadores permitem o uso das APIs externas de forma transparente.

## 🌉 Questão 2: Padrão Bridge (Controle de Automação Residencial)

### Cenário Fictício

Um sistema de automação residencial precisa controlar diversos Dispositivos (lâmpadas, ventiladores, câmeras) por múltiplos Meios de Controle (app, controle remoto, painel).

### Objetivo

Aplicar o padrão Bridge para desacoplar a Abstração (os Meios de Controle) da Implementação (os Dispositivos), permitindo que novas funcionalidades sejam adicionadas independentemente em qualquer hierarquia.

### Requisitos Funcionais:

- Criar a hierarquia de Implementações (Interface Dispositivo e classes concretas como Lâmpada, Ventilador).
- Criar a hierarquia de Abstrações (Classe base Controle e classes concretas como AplicativoMovel, ControleRemoto).
- A classe Controle deve conter uma referência à interface Dispositivo (a "ponte").

### Estrutura Proposta:

O teste (SistemaAutomacaoResidencial) deve simular o controle de diferentes dispositivos por diferentes meios, provando a flexibilidade e o desacoplamento.

## 🎬 Questão 3: Padrão Facade (Sistema de Cinema Online)

### Cenário Fictício

Um sistema de streaming de filmes possui subsistemas complexos (Login, Pagamento, Reprodução de Vídeo). É necessário criar uma interface simplificada para o usuário realizar a ação completa de "Assistir Filme".

### Objetivo

Implementar o padrão Facade para criar uma interface unificada (CinemaFacade) que agrupe e orquestre as operações dos subsistemas internos, escondendo sua complexidade.

### Requisitos Funcionais:

- Criar os subsistemas separados: SubSistemaLogin, SubSistemaPagamento e SubSistemaReproducao.
- Implementar a classe CinemaFacade que compõe esses subsistemas.
- O Facade deve oferecer um único método (assistirFilme) para executar a sequência completa de operações (login $\rightarrow$ pagamento $\rightarrow$ reprodução).

### Estrutura Proposta:

O teste (SistemaStreaming) deve demonstrar que o processo completo (login, pagamento, reprodução) pode ser iniciado com uma única chamada ao método da Fachada.

## 🃏 Questão 4: Padrão Flyweight (Jogo de Cartas Online)

### Cenário Fictício

Um jogo de cartas online envolve um grande volume de cartas idênticas (mesmo Valor e Naipe) que se repetem em vários baralhos e mãos de jogadores. É necessário otimizar a memória.

### Objetivo

Implementar o padrão Flyweight para garantir que cartas idênticas sejam compartilhadas e reutilizadas (estado intrínseco), em vez de criar múltiplas instâncias repetidas, otimizando o uso de memória.

### Requisitos Funcionais:

- Criar a classe Carta (Flyweight Concreto), contendo o estado intrínseco (Valor e Naipe).
- Implementar a CartaFactory (Flyweight Factory) para gerenciar o pool de instâncias, reutilizando cartas existentes.
- A simulação deve provar que a fábrica cria novas instâncias de cartas apenas quando uma combinação única é solicitada pela primeira vez.

### Estrutura Proposta:

O teste (JogoDeCartas) deve mostrar que, ao requisitar a mesma carta para diferentes jogadores, a fábrica retorna a mesma instância, resultando em um baixo número total de objetos de Carta criados.

