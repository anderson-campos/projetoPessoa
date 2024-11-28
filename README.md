<h1>Documentação do Projeto Pessoa e Aluno</h1>
    <section>
        <h2>Descrição</h2>
        <p>Este projeto em Java é um exemplo didático que explora conceitos fundamentais da <strong>programação orientada a objetos (POO)</strong>, como <em>encapsulamento</em>, <em>herança</em> e <em>sobrescrita de métodos</em>. Ele contém três classes principais:</p>
        <ul>
            <li><strong>Pessoa</strong>: Representa uma entidade genérica com atributos básicos como nome e idade.</li>
            <li><strong>Aluno</strong>: Uma subclasse de <code>Pessoa</code> que adiciona o atributo matrícula.</li>
            <li><strong>Main</strong>: Responsável pela interação com o usuário.</li>
        </ul>
    </section>
    <section>
        <h2>Estrutura do Projeto</h2>
        <h3>Classe Pessoa</h3>
        <p>Representa uma entidade genérica com os seguintes atributos e métodos:</p>
        <ul>
            <li><strong>Atributos:</strong> <code>nome</code> (String) e <code>idade</code> (int).</li>
            <li><strong>Encapsulamento:</strong> Uso de métodos <code>get</code> e <code>set</code> para acesso aos atributos privados.</li>
            <li><strong>Construtor:</strong> Inicializa os valores de <code>nome</code> e <code>idade</code>.</li>
            <li><strong>Método:</strong> <code>mensagem()</code>, retorna uma representação textual dos atributos.</li>
        </ul>
        <h3>Classe Aluno</h3>
        <p>Herda da classe <code>Pessoa</code> e adiciona os seguintes elementos:</p>
        <ul>
            <li><strong>Atributo:</strong> <code>matricula</code> (double).</li>
            <li><strong>Construtor:</strong> Utiliza o construtor da superclasse para inicializar os atributos herdados e adiciona o atributo <code>matricula</code>.</li>
            <li><strong>Sobrescrita:</strong> O método <code>mensagem()</code> é redefinido para incluir a matrícula.</li>
        </ul>
        <h3>Classe Main</h3>
        <p>Gerencia a interação com o usuário, criando instâncias de <code>Pessoa</code> e <code>Aluno</code>. Permite que o usuário insira informações via terminal e exibe os dados processados.</p>
    </section>
    <section>
        <h2>Fluxo de Execução</h2>
        <ol>
            <li>O programa solicita ao usuário o nome e a idade de uma pessoa.</li>
            <li>Cria uma instância de <code>Pessoa</code> e exibe as informações.</li>
            <li>Solicita ao usuário o nome, idade e matrícula de um aluno.</li>
            <li>Cria uma instância de <code>Aluno</code> e exibe as informações formatadas.</li>
        </ol>
    </section>
    <section>
        <h2>Requisitos para Execução</h2>
        <ul>
            <li>JDK 8 ou superior.</li>
            <li>Um editor ou IDE como IntelliJ IDEA, Eclipse ou VS Code.</li>
            <li>Configuração do <code>PATH</code> para o compilador <code>javac</code>.</li>
        </ul>
        <p><strong>Passos:</strong></p>
        <ol>
            <li>Compile o programa com <code>javac Main.java</code>.</li>
            <li>Execute o programa com <code>java Main</code>.</li>
        </ol>
    </section>
    <section>
        <h2>Possíveis Melhorias</h2>
        <ul>
            <li>Adicionar validação para entradas do usuário.</li>
            <li>Implementar persistência de dados usando arquivos ou banco de dados.</li>
            <li>Introduzir uma interface gráfica com JavaFX ou Swing.</li>
            <li>Escrever testes unitários com frameworks como JUnit.</li>
            <li>Adicionar outras subclasses de <code>Pessoa</code>, como <code>Professor</code>, para explorar polimorfismo.</li>
        </ul>
    </section>
    <footer>
        <p>&copy; 2024 Projeto Pessoa e Aluno - Desenvolvido em Java</p>
    </footer>
