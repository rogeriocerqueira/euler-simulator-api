# Euler Simulator API

API REST em Java com Spring Boot para resolver equações diferenciais ordinárias (EDOs) usando o **método de Euler**. Permite enviar uma função matemática e obter a simulação numérica dos valores da solução.

---

## 🚀 Funcionalidades

- Recebe uma EDO da forma `dy/dx = f(x, y)` via JSON
- Calcula a solução aproximada usando o método de Euler
- Retorna os pares `(x, y)` em JSON
- Testes unitários básicos
- Documentação via Swagger (configuração futura)

---

## 💻 Tecnologias

- Java 17
- Spring Boot 3.x
- Maven
- exp4j (para interpretar expressões matemáticas)
- JUnit 5 (testes)
- Swagger (documentação API, a implementar)

---

## 🛠️ Como rodar localmente

### Pré-requisitos

- Java 17 instalado
- Maven instalado

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/euler-simulator-api.git
cd euler-simulator-api
