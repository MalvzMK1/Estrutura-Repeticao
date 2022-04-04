# Estrutura-Repeticao

## Laços/loop

## Java 

    for         [para]
    while       [enquanto]
    do while

# Laço ``for``

    -> É mais adequado utilizar o laço for, quando sabemos antecipadamente a quantidade de repetições.

    ### sintaxe do laço for

        for (inicialização ; teste ; atualização) {

        }

        -> inicialização: Determina o início da contagem
        -> teste: Determina o final da contagem
        -> atualização: Determina o passo [razão] da contagem

    ### Exemplo

        1, 4, 7, 10, 13

        for (int i=1 ; i <= 13 ; i=i+3) {
            
        }
        
* Laço ``While``

    ### Sintaxe: 
        
        while (expressão de teste) {

        }

    ### Exemplo: 

        while (i <= 10) {
            System.out.println(i);
        }
