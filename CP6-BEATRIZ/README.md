# 🎵 Sistema de Streaming de Música

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), simulando uma plataforma de streaming de música com gerenciamento de usuários, playlists, reprodução e sistema de downloads.

---

# 📚 Objetivos do Projeto

Este projeto foi desenvolvido para aplicar os principais conceitos de POO estudados durante a disciplina:

- Encapsulamento
- Herança
- Polimorfismo
- Abstração
- Interfaces
- Organização em pacotes
- Boas práticas de programação Java

---

# 🚀 Funcionalidades

## 🎶 Gerenciamento de Músicas
- Cadastro de músicas
- Exibição de informações
- Controle de duração

## ▶️ Sistema de Reprodução
- Reproduzir músicas
- Pausar reprodução
- Parar reprodução
- Reprodução de playlists

## 📂 Playlists
- Criação de playlists
- Adição de músicas
- Cálculo de duração total

## 👤 Usuários
### Usuário Free
- Reprodução de músicas
- Criação de playlists

### Usuário Premium
- Todas as funções do usuário Free
- Download de músicas
- Gerenciamento de músicas baixadas

## 📊 Recursos Extras
- Formatação de tempo
- Validação de dados
- Estrutura organizada em pacotes

---

# 🏗️ Arquitetura do Projeto

## 📦 Estrutura de Pacotes

```text
src/
└── br/
    └── com/
        └── streaming/
            ├── modelo/
            ├── servico/
            ├── util/
            └── principal/
```

---

# 🧠 Conceitos de POO Aplicados

## 🔒 Encapsulamento
Os atributos das classes foram protegidos utilizando modificadores de acesso adequados e métodos getters/setters.

## 🧬 Herança
As classes `UsuarioFree` e `UsuarioPremium` herdam da classe abstrata `Usuario`.

## 🎭 Polimorfismo
Uso de sobrescrita de métodos (`@Override`) e implementação de interfaces.

## 🧱 Abstração
As classes abstratas `Usuario` e `ItemReproducao` representam comportamentos genéricos do sistema.

## 🔌 Interfaces
As interfaces `Reproduzivel` e `Baixavel` definem contratos para funcionalidades específicas.

---

# 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Git
- GitHub

---

# ▶️ Como Executar o Projeto

## 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

## 2️⃣ Abrir o projeto

Abra o projeto em uma IDE Java:

- IntelliJ IDEA
- Eclipse
- NetBeans

---

## 3️⃣ Executar

Execute a classe principal:

```text
StreamingMusica.java
```

Localização:

```text
br.com.streaming.principal
```

---

# 📌 Exemplo de Execução

```text
Reproduzindo música: Numb
Download realizado.
Downloads: 1
```

---

# 📁 Principais Classes

| Classe | Responsabilidade |
|---|---|
| ItemReproducao | Classe abstrata base |
| Musica | Representa uma música |
| Playlist | Gerencia playlists |
| Usuario | Classe abstrata de usuários |
| UsuarioFree | Usuário gratuito |
| UsuarioPremium | Usuário premium |
| Reproduzivel | Interface de reprodução |
| Baixavel | Interface de download |

---

# 📅 Histórico de Desenvolvimento

| Checkpoint | Conteúdo |
|---|---|
| CP1 | Estrutura inicial |
| CP2 | Classes e objetos |
| CP3 | Encapsulamento |
| CP4 | Herança |
| CP5 | Polimorfismo |
| CP6 | Interfaces e organização final |

---

# ✅ Status do Projeto

✔️ Projeto finalizado  
✔️ Código compilando sem erros  
✔️ Estrutura organizada em pacotes  
✔️ Conceitos de POO aplicados  

---

# 👩‍💻 Autor

**Beatriz Gonçalves**

- Curso: Ciência da Computação
- Disciplina: Programação Orientada a Objetos
- Projeto acadêmico desenvolvido em Java

---