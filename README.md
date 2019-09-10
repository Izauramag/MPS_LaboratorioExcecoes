# mps_Laboratorios2019.1

Laboratórios para a cadeira de métodos de projetos de software.

# Primeiro laboratório
Laboratório de Exceções   1 - Crie um projeto de um programa em Java e divida-o em três pacotes: 
    a) camada que lida com a interface com o usuário (view);
    b) camada de negócio (business) com dois pacotes;
        b.1) subcamada que possui regras (gerente de usuário) de negócio (control)
        b.2) subcamada que possui entidades do negócio (model)
    c) camada que lida com a persistência/comunicação externa/etc (infra).
        
2 - Implemente a ADIÇÃO DE USUÁRIOS no sistema e, na camada " business.control", algoritmos para validar os cadastros de usuários. Crie e utilize exceções próprias para representar os erros abaixo:   

Login:     
    máximo 12 caracteres
        não pode ser vazio
        não pode ter números //  strWithNumber.matches(?.*\\d.*?)
Senha:         
    máximo 16 caracteres
    mínimo de 8 caracteres
    deve possuir letras e números e ao menos 2 números.
Dica: Pesquise o método matches da classe String ou os métodos da classe Character

3 - Armazene os usuários numa coleção (deve ser atributo da classe que gerencia os usuários na camada "control") e implemente a persistencia da lista utilizando arquivos binários na camada "infra") 

4 - Implemente a EXCLUSÃO DE UM USUÁRIO dado seu login.

5- Realize o tratamento de exceções em dois níveis: Capture as exceções java.io.IOExpcetion na camada "infra", relance-as (usando as exceções criadas na questão 2) para as camadas acima de modo que apresente uma mensagem para o usuário final amigável.

# Segundo Laboratório
1 - Altere o mapa utilizado no Laboratório de Exceções usar a classe TreeMap, onde os usuários sejam impressos ordenados pelo login. Utilize a abordagem java.lang.Comparable Insira os mesmos usuários da questão b. Imprima esse novo mapa e verifique a ordem em que foram impressos. OBS: Vejas os slides para saber qual classe implementa um mapa ordenado;

2 - Crie uma classe Data com os seguintes atributos dia, mês e ano todos do tipo int. A data deve ter o formato DD/MM/AA;

3 - Altera a classe Usuario e adicione o atributo data_nascimento do tipo Data, criada no item anterior; 4.Crie uma classe TestaComparator que deve conter duas TreeSet. A primeira ordena as usuários pelo login e se dois usuários têm login iguais, ordena pelo senha. A segunda ordena pela data de nascimento. Utilize a abordagem da interface java.util.Comparator e crie duas classes ComparadorNome e ComparadorData que implementam essa interface e contenham os algoritmos de ordenação propostos.

4 - Adicione código na classe TestaComparator para testar as implementações das ordenações

# Terceiro Laboratório
Padrões de Projeto 

1- Estude o DAO (Data Access Object):
https://www.oracle.com/technetwork/java/dataaccessobject-138824.html e identifique os
padrões de projeto utilizados. Cita o nome e as classes envolvidas.

2- Separe o seu projeto em três camadas view, business e infra. Implemente utilizando Factory
Method ou Abstract Factory a comunicação entre as camadas business e infra;

3- De acordo com o padrão Adapter, identifique e implemente um cenário de uso no seu
projeto;

4- Crie uma fachada (Facade) para os serviços de cadastro de uma entidade (diferente de
usuário) do seu projeto e implemente testes unitários para cada um de seus métodos;

5- Na camada business implemente, utilizando Template Method, aa geração de mais um tipo
de relatórios. Os relatórios devem gerar estatísticas de acesso dos usuários no sistema.

Respondendo perguntas sobre o laboratório 3:
            
Foi escolhido pelo grupo utilizar Factory Method, que aplicado a infra.DataRepository por meio de infra.RepositoryFactory, o  retorno é uma interface implementada pelo infra.DataRepository. Além disso, temos, Template Method, que foi aplicado em            business.model.Message, que é uma classe abstrata que tem duas classes que herdam, business.model.CommonMessage e                   business.model.VipMessage, que têm comportamentos diferentes para o método getColoredText. Foram implementados dois                     adapters, util.FileInputAdapter e util.FileOutputAdapter para facilitar a leitura e a escrita de objetos em arquivos. O                 padrão Command foi aplicado às operações com business.model.Wall. Há 3 operações, Create, Update e Remove, implementadas em             business.control.WallCommands, mesmo local onde está a interface do Command. Memento, também aplicado a business.model.Wall,             permite desfazer uma das 3 operações feitas com  padrão Command.

            
            
