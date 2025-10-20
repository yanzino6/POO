#include <stdio.h>
#include "conta.h"
#include <iostream>

int main()
{
    std::string nome, cpf, numero;
    int operacoes;

    std::cin >> nome >> cpf >> numero;

    pessoa titular(nome, cpf);
    conta c(numero, titular);
    scanf("%d\n", &operacoes);
    for (int i = 0; i < operacoes; i++)
    {
        char operacao;
        float valor;
        std::cin >> operacao >> valor;
        if (operacao == 'D')
        {
            c.depositar(valor);
        }
        else if (operacao == 'S')
        {
            c.sacar(valor);
        }
    }
    c.print();

    return 0;
}