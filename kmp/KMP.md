# KMP

## Objetivos

- Explicar o Método Kanban;
- Aplicar as práticas e princípios Kanban com a agenda ”Orientada a Serviços";
- Explicar o conceito central Kanban de "Puxar”, seus efeitos e como os sistemas puxados podem ser modelados;
- Aplicar o Método STATIK para projetar sistemas Kanban orientados a serviços;
- Aplicar insights do STATIK e padrões adequados para projetar um board Kanban que modele de perto o fluxo de trabalho (workflow), tipos de itens, classes de serviço e outros elementos.

## O que é

​	Método para gestão do trabalho do conhecimento com princípios e práticas guia, sempre visualizando seu fluxo através dos boards e respeitando a prática de terminar primeiro e começar depois (sempre respeitar a capacidade do time antes de iniciar o trabalho).

​	Kanban, em Kanji, significa "sinal" ou "grande placa visual" e, em Hiragana, "cartão de sinal". Já em chinês, significa "olhando para o *board*". Porém, na prática, kanban não é o *card* que transita pelo *board*, mas sim o *slot* que esse *card* preenche.

## Agendas Kanban

### Colaborações individuais (sustentabilidade):

- Alívio da sobrecarga;
- Produzir melhor qualidade;
- Gerar orgulho profissional e satisfação do cliente;

## Mitos e Fatos

​	O Kanban não possui um ciclo de vida de desenvolvimento de *software*, já que a ideia é utilizar de integração contínua. É um método de mudança evolutiva, não um método revolucionário. Seu foco é a melhora direta da entrega de serviços (não priorizando o rendimento de um time, por exemplo).

​	Puxar, quando citado no Kanban, não significa que o colaborador auto-selecionará seu próprio trabalho: ele terá, sim, uma série de *cards* para escolher um item entre eles. Porém, deve ser de forma controlada. Além disso, como todo método atual (e possivelmente como sempre será), a metodologia não garante que as pessoas estejam ocupadas.

## Serviço

​	O serviço, na visão do Kanban, é algo que surge de uma necessidade do cliente, com a solução solicitada pelo mesmo. Nesse ponto, é iniciada uma <u>série de atividades</u> que, no final, apresenta um resultado que pode ser aceito ou recusado pelo solicitante.

## Elementos do Kanban

### Princípios de gerencimaneto de mudança

- Comece com o que você já faz
  - Entenda os processos atuais da forma que realmente são utilizados;
  - Respeite os atuais papéis, responsabilidades e cargos.
- Obtenha acordo para buscar melhorias através da mudança evolutiva;
- Incentivar atos de liderança em todos os níveis.

### Princípios de entrega de serviços

- Entenda e foque nas necessidades e expectativas do cliente;
- Gerencie o trabalho e deixar que os colaboradores se auto-organizem baseando-se nas atividades pré-selecionadas;
- Faça revisões regulares da rede e de suas políticas para melhorar os resultados.

## Práticas do Kanban

### Visualizar

​	Um Board Kanban é uma forma de visualização do trabalho e do processo pelo qual ele passa. Nele, devem haver os pontos de compromisso e entrega devem ser definidos e os limites de WIP devem ser exibidos.

### Limitar o WIP

​	O limite WIP serve para tornar um sistema empurrado para um sistema puxado. Ou seja, o agendamento e a entrega do trabalho só acontece quando há demanda **e** capacidade de entrega disponível.

#### Sinais

​	A utilização de sinais para indicar o momento ideal para iniciar trabalhos é uma prática do Kanban. *Slots* vazios no WIP, por exemplo, indicam que há capacidade, porém não há demanda. *Slots* lotados ou "estourados", por outro lado, mostram que há mais demanda que capacidade.

### Gerenciar o fluxo

​	O fluxo deve maximizar a entrega de valor, minimizar prazos (*lead time*) e trazer suavidade (previsilibidade) para o trabalho. Dessa forma, torna-se de suma importância que o ponto de comprometimento seja respeitado. Um item pode, sim, ser abortado após ser iniciado; porém essa prática deve ser evitada.

#### Upstream Kanban

​	Trata-se do processo de refinamento e seleção das ideias disponíveis, realizado antes de "descer" para o *downstream*. O termo utilizado ao rejeitar um item no *upstream* é <u>descartar</u>.

#### Downstream Kanban

​	Trata-se da entrega do trabalho com o qual se comprometeu. O termo utilizado ao rejeitar um item no *downstream* é <u>abortar</u>.

#### Reabastecimento/replenishment

​	Deve ser considerada, para realizar o reabastecimento, a taxa de chegada de informações e os custos de transação e coordenação de realizá-lo. O reabastecimento sob demanda, que é contínuo, é a forma mais ágil; porém a mais custosa.

#### Frequência de entrega

​	Devem ser considerados, para realizar as entregas, os custos de transação e coordenação da entrega e os custos e tolerância do cliente para recebê-las. O entrega sob demanda, que é contínuo, é a forma mais ágil; porém a mais custosa.

#### Métricas

##### *Lead Time*

​	O *lead time* do <u>sistema</u> é o tempo do comprometimento até a primeira coluna de limite infinito, que representa a primeira coluna cuja qual o time não possui controle. Temos, ainda, o *lead time* do <u>cliente</u>, que conta do tempo de comprometimento até a entrega final.

##### Little's Law

​	*Little's law* é uma relação de médias, consistindo na WIP média aproximada sobre a *delivery rate* média. A fórmula em questão é: *<u>lead time</u>* = <u>WIP</u> / *<u>delivery rate</u>*.

##### Eficiência do fluxo

​	A fórmula desta métrica se dá pelo *touch time* / *lead time*. O *touch time* representa a soma de todo o tempo em que um item está sendo desenvolvido ativamente (colunas doing). Já o *lead time* do <u>sistema</u> representa todo o tempo em que um item passou do ponto de comprometimento até a primeira coluna cuja qual o time não possui controle.

##### Outras métricas

- **Demanda de falha:** auto demanda causada por uma falha ou por entrega de algo errado ao cliente (*bug* ou *erro de versão*);
- **Qualidade inicial:** defeitos que "escapam" e gerarão no futuro demanda de falha (*bug client*);
- **Impedimentos** e seu impacto;
- **Níveis de WIP:** número de itens no sistema em geral ou em determinados estágios;
- **Taxas de descarte:** itens que foram descartados antes e depois do ponto de comprometimento.
- **Distribuição (histograma):** mostra a real capacidade do *lead time*, ajudando a determinar as expectativas de SLA;
- **Gráfico de execução:** mostra o *lead time* ou *throughput* ao longo do tempo e verifica as tendências e o impacto das mudanças do sistema;
- **Cumulative Flow Diagram (CFD):** mostra os níveis de WIP ao longo do tempo e a capacidade de demanda, WIP, *lead time* aproximado e de taxa de entrega.

### Tornar as políticas explícitas



### Implementar ciclos de feedback

​	São uma parte essencial de qualquer processo controlado.

## Processos

### Replenishment Meeting

​	Permita que o time de serviço selecionem solicitações de trabalho e preencha a coluna "Próximo" a iniciar para que não fiquem sem trabalho no próximo período.

- Observações que resultam em mudanças de comportamento ou políticas na Replenishment Meeting;
- Mudanças de políticas ou portfólio;
- Decisões sobre o que puxar;
- Mudanças no sistema (para Kanban Meeting).

#### Observações

- **Participantes:** líderes ou representantes dos times envolvidos do fluxo de trabalho;
- Certifique-se de que o trabalho solicitado está claramente definido;
- Considere os aspectos técnicos e dependências entre os times de serviço.

#### Sob demanda ou eventos regulares?

​	O *replenishment* sob demanda pode ser possível onde o esforço de coordenação é baixo e os *business owners* estão disponíveis instantâneamente. Porém, em casos de eventos regulares, pode ocorrer semanalmente, variando de acordo com a taxa de chegada de informações.

#### Timebox

​	Semanalmente, dependendo da taxa de chegada de informações, durando de 20 a 30 minutos.

### Workflow Kanban Meeting (similar à reunião diária)

​	Envolva os times de serviço em uma conversa colaborativa sobre o status do trabalho, filas entre os estágios do fluxo de trabalho e problemas que afetam o fluxo de trabalho.

- Compromissos;
- Decisões sobre novas iniciativas e alocação de capacidade;
- Mudanças de políticas;
- Compreensão compartilhada de como melhor fluir o trabalho atual;
- Sugestões de melhoria.

#### Observações

- **Participantes:** grupo de serviço imediato ou time fazendo o trabalho (entre 4 e 50 pessoas);
- **Escopo:** fluxo de trabalho ponta a ponta de um serviço;
- Os problemas identificados são resolvidos após a reunião por membros do time com conhecimentos e habilidades relevantes.

#### Como executá-la?

​	A reunião sempre possui um facilitador, que percorrerá o *board* da direita para a esquerda, gerenciando o trabalho em cada coluna baseado em ordem de conclusão (conceito de começar a terminar e parar de começar) e WIP. Nesse ponto, o facilitador pode solicitar mais informações sobre um *card* que esteja ou não no *board*.

​	É possível, baseando-se no nível de maturidade da equipe e da organização, que somente sejam citados *cards* com impedimento. Também há discussões sobre quais itens das colunas *done* devem ser puxados.

#### Timebox

​	Semanalmente (baseado no custo de coordenação), durando de 10 a 20 minutos.

### Risk Review [REVISAO]

### Flow Review (similar à retrospectiva)

​	Desenvolver uma compreensão quantitativa inicial do serviço entregue, facilitando o planejamento do trabalho e melhorando a previsibilidade.

- Progresso e dados de capacidade do sistema da Kanban Meeting e rastreamento do sistema;
- Ações a partir da revisão dos riscos;
- Ações definidas para melhorar a capacidade;
- Comunicação de decisões.

#### Observações

- **Participantes:** parte do time de entrega de serviços, opcionalmente *team leads*;
- Compare a capacidade atual com as condições de destino definidas;
- Discutir possíveis ações de melhoria.

#### Timebox

​	Duas vezes por mês, durando em torno de 30 minutos.

# Como implementar o sistema Kanban?

## STATIK (Systems Thinking Approach To Introducing Kanban)

​	Trata-se de uma maneira repetível e humana de introduzir o Kanban, devendo ser aplicado a cada serviço e resultando em um <u>design de sistema Kanban</u>. Possui 8 passos:

1. Entenda o que faz o serviço "*fit for purpose*";
2. Entenda as fontes de insatisfação em relação à entrega atual;
3. Analise as fontes e a natureza da demanda;
4. Analise a capacidade de entrega atual (<u>opcional</u>);
5. Modele o fluxo de trabalho de entrega de serviços;
6. Identifique e defina as classes de serviço;
7. Projete o sistema Kanban;
8. Socialize o design & negocie a implementação.

### Fontes de insatisfação

​	Consistem na motivação para mudança, que é a chave para uma iniciativa bem sucedida de Kanban.

# Kanban Boardgame

> **Background**
>
> Your company offers a subscription-based software product. You begin the game on day 9 of a project that is already underway. As you complete work in the form of stories you add to your product's capabilities, and attract new subscribers. Your company has a <u>three-day billing cycle</u>. Every three days, you charge each subscriber $100 for using your product. In order to grow your revenue stream, you want to attract as many subscribers as quickly as you can.
>
> **Objective**
>
> Your objective is to maximize profit. You earn revenue every three days for each deployed story.
>
> **Gettings started**
>
> Assign your team members by dragging them to the story you want them to work on for the day and when all your members are assigned, click the "Start work" button to have them start their work day. Each team member have specialties indicated by their color. Every day a random number between one and six is used to determine how much work they complete. If the member works in its area of specialization this number is doubled.
>
> The game ends when **day 21** is complete.
>
> **Stories**
>
> Standard(S) stories are yellow and are for product features which attract subscribers and hence revenue.
>
> Fixed Delivery Date(F) stories are purple. We want to deliver these before their due dates, but not too early or we will sacrifice too many standard stories.
>
> Intangible(I) stories are green and are for work that needs to be done, but that does not directly attract subscribers, but will help your members to work more efficient.
>
> Expedite(E) stories are blue that will come into play during the game. These stories will use the Expedite lane to move the stories through as quickly as possible.

URL de acesso ao mini-game: http://www.kanbanboardgame.com/