PartiturasApp
Descrição do Projeto

O PartiturasApp é um aplicativo Android desenvolvido para a Associação Musical Isidoro de Castro, com o objetivo de organizar, gerenciar e compartilhar partituras de forma digital.
O sistema substitui o arquivo físico de partituras, proporcionando acesso rápido, preservação de obras e maior eficiência durante ensaios e apresentações da banda.

Objetivos

Digitalizar e organizar o acervo de partituras da associação.

Facilitar o acesso às partituras por todos os integrantes.

Reduzir custos com impressão e armazenamento físico.

Melhorar a eficiência dos ensaios e apresentações musicais.

Funcionalidades

Cadastro de partituras com título, compositor e instrumento.

Visualização da lista de partituras cadastradas.

Busca e filtragem por instrumento ou compositor.

Atualização automática de dados via Firebase Realtime Database.

Tecnologias Utilizadas

Linguagem: Kotlin

IDE: Android Studio

Banco de Dados e Armazenamento: Firebase Realtime Database e Firebase Storage

Interface: XML e Material Design

Controle de Versão: Git e GitHub

Estrutura do Projeto
PartiturasApp/
│
├─ app/src/main/java/com/associacao/partiturasapp/
│    ├─ MainActivity.kt
│    ├─ AddPartituraActivity.kt
│    ├─ Partitura.kt
│    ├─ PartituraAdapter.kt
│    └─ FirebaseService.kt
│
├─ app/src/main/res/layout/
│    ├─ activity_main.xml
│    ├─ activity_add_partitura.xml
│    └─ item_partitura.xml
│
├─ app/src/main/res/values/
│    ├─ colors.xml
│    ├─ strings.xml
│    └─ styles.xml
│
└─ AndroidManifest.xml

Como Executar

Clonar o repositório:

git clone https://github.com/SEU_USUARIO/PartiturasApp.git


Abrir o projeto no Android Studio.

Configurar o Firebase (Realtime Database e Storage) e conectar o projeto.

Buildar e executar no emulador ou dispositivo Android.

Evidências do Desenvolvimento

Capturas de tela: Mostram a interface do app, lista de partituras e tela de cadastro.

Histórico de commits: Cada commit documenta etapas do desenvolvimento.

Vídeos: Demonstração de cadastro e visualização de partituras.

Exemplo de evidência documentada:

Tipo	Descrição	Data	Relevância
Captura de tela	Tela principal mostrando partituras cadastradas	01/09/2025	Demonstra a organização digital do acervo
Vídeo	Inserindo nova partitura	01/09/2025	Mostra o funcionamento completo do sistema
Commit Git	Adição da tela de cadastro	01/09/2025	Evidência do progresso do desenvolvimento
Contribuição

Este projeto foi desenvolvido como parte de uma atividade acadêmica, aplicando conhecimentos de:

Programação Android (Kotlin)

Design de software e interface (UI/UX)

Gestão de banco de dados Firebase

Test-Driven Development (TDD)

Licença

Este projeto é destinado exclusivamente para fins acadêmicos.
