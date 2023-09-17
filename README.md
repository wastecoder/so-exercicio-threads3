# 3º Exercício de Threads
Compara o desempenho do for normal e for each

## Descrição do exercício
Criar em Java um projeto com uma Thread chamada ThreadVetor, que receba um valor numérico e vetor como parâmetros. <br>
Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor. <br>
Caso o valor numérico seja ímpar, a thread deve percorrer o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. <br>
No final, ambas as possibilidades devem apresentar o tempo em segundos. <br>
A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o número 2 e o mesmo vetor
