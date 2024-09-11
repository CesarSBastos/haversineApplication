# API de Cálculo de Distância Haversine
Este repositório contém uma API simples desenvolvida com Spring Boot para calcular a distância entre dois pontos geográficos utilizando a fórmula de Haversine. A fórmula é amplamente usada para determinar a distância mais curta na superfície da Terra, levando em consideração a curvatura do planeta e as coordenadas (latitude e longitude) dos dois pontos.

## 🚧 Status do Projeto: Em Desenvolvimento
Nota: Este projeto ainda está em fase de desenvolvimento, e algumas funcionalidades podem não estar totalmente implementadas. Melhorias futuras estão planejadas para expandir a funcionalidade e otimizar a API.

## 📚 Sumário
- [Visão Geral do Projeto](#visão-geral-do-projeto)
- [Instalação](#instalação)
- [Uso](#uso)
- [Tecnologias](#tecnologias)
- [Melhorias Planejadas](#melhorias-planejadas)
- [Contribuição](#contribuição)


### 🌍 Visão Geral do Projeto
Esta API oferece um endpoint para calcular a distância entre dois pontos geográficos com base nas suas latitudes e longitudes. Utiliza a fórmula de Haversine, que considera a curvatura da Terra, fornecendo uma estimativa mais precisa para distâncias longas.

### Funcionalidades Atuais:
- API REST com um endpoint para calcular a distância.
- Recebe entrada em formato JSON contendo latitude e longitude de dois pontos.
- Retorna a distância em quilômetros.
### 🚀 Instalação
Pré-requisitos:
- Java 11 ou superior
- Maven 3.6+
- Spring Boot
### Passos:
Clone o repositório:
```
bash
git clone https://github.com/seu-usuario/haversine-distance-api.git
cd haversine-distance-api
Compile o projeto usando Maven:
```
```
bash
mvn clean install
Execute a aplicação Spring Boot:
```
```
bash
mvn spring-boot:run
A API estará disponível em http://localhost:8080.
```
### 📦 Uso
Endpoint da API:
POST /api/distance/calculate
Corpo da Requisição (JSON):

```
json
{
  "lat1": -23.5505,
  "lon1": -46.6333,
  "lat2": -22.9068,
  "lon2": -43.1729
}
```
Resposta:
200 OK: Retorna a distância em quilômetros entre os dois pontos.
Exemplo de Resposta:

```
json
{
  "distance": 358.53
}
```
### Exemplo com cURL:
```
bash
curl -X POST http://localhost:8080/api/distance/calculate \
   -H "Content-Type: application/json" \
   -d '{"lat1": -23.5505, "lon1": -46.6333, "lat2": -22.9068, "lon2": -43.1729}'
```
### 🛠️ Tecnologias
- Java 11
- Spring Boot 3.3.3
- Maven
## 📝 Melhorias Planejadas
Este projeto está em desenvolvimento contínuo, e algumas melhorias estão planejadas para versões futuras:

1. Validação de Entrada: Adicionar validação para os valores de latitude e longitude.
2. Tratamento de Erros: Implementar tratamento de erros robusto com códigos de status HTTP adequados.
3. Testes Unitários e de Integração: Incluir testes para garantir a confiabilidade e precisão do cálculo.
4. Suporte a Docker: Containerizar a aplicação para facilitar o deployment.
5. Suporte para Múltiplas Unidades de Medida: Permitir cálculo da distância em milhas e outras unidades.
6. Documentação da API: Adicionar documentação detalhada da API utilizando Swagger.
7. Melhorias de Performance: Otimizar os cálculos para melhor desempenho em grande escala.
### 🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou discutir novas ideias. Faça um fork do repositório e crie um pull request com suas melhorias.

Como Contribuir:
Faça o fork deste repositório.
Crie uma branch para sua funcionalidade ou correção de bug.
Realize o commit de suas alterações.
Envie um push para a branch e abra um Pull Request.
