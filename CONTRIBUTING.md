# 🤝 Guia de Contribuição – Euler Simulator API

Bem-vindo! Este documento define o padrão de contribuição para o projeto **Euler Simulator API**. Ele inclui convenções para nome de branches, commits, pull requests, uso de emojis, testes e integração de código.

---

## 🧭 Estrutura de Branches

| Tipo              | Nome do padrão               | Exemplo                        |
|-------------------|------------------------------|--------------------------------|
| Principal         | `main` ou `master`           | `main`                         |
| Desenvolvimento   | `dev`                        | `dev`                          |
| Funcionalidade    | `feat/nome-funcionalidade`   | `feat/euler-simulation`        |
| Correção de bug   | `fix/nome-bug`               | `fix/erro-calculo`             |
| Refatoração       | `refactor/nome`              | `refactor/servico-euler`       |
| Documentação      | `docs/nome`                  | `docs/swagger-config`          |
| Testes            | `test/nome`                  | `test/euler-service-test`      |

---

## 📝 Padrão de Commits com Emojis

Utilize **tempo verbal no infinitivo**, frases curtas e sempre inicie com um emoji apropriado.

| Emoji | Tipo               | Exemplo                                                 |
|--------|--------------------|----------------------------------------------------------|
| ✨     | `feat:` Nova funcionalidade | `✨ Adicionar endpoint de simulação de Euler`         |
| 🐛     | `fix:` Correção de bug     | `🐛 Corrigir erro no cálculo de y no método de Euler` |
| 🔨     | `refactor:` Refatoração    | `🔨 Refatorar lógica de integração`                   |
| 📄     | `docs:` Documentação       | `📄 Adicionar instruções no README`                   |
| ✅     | `test:` Testes              | `✅ Criar teste unitário para EulerService`           |
| 🗑️     | `chore:` Limpeza            | `🗑️ Remover código não utilizado`                     |
| 🚀     | `build:` Deploy/build       | `🚀 Adicionar Dockerfile para deploy`                 |
| 🔧     | `config:` Configurações     | `🔧 Configurar Swagger para documentação`             |

---

## 🌿 Pull Requests

### Nome do PR:
- ✅ Atualizações: `✅ Atualizar método de simulação`
- ↪️ Rebranch: `↪️ Rebranch com base em dev`
- ↩️ Rebase: `↩️ Rebase da main`
- 📥 Merge: `📥 Merge de feat/xyz em dev`

### Corpo do PR:

```markdown
### ✅ O que foi feito:
- Implementação do endpoint POST /simulate/euler
- Cálculo via método de Euler com expressão dinâmica
- Adição de testes automatizados

### 🧪 Testes realizados:
- [x] Teste com y(0) = 1 e função `y - x^2 + 1`
- [x] Teste de estabilidade numérica com h = 0.01

### 🔁 Tipo de mudança:
- [x] Nova funcionalidade
- [ ] Bug fix
- [ ] Refatoração
- [ ] Documentação
