#include "conta.h"
#include <iostream>
conta::conta(std::string numero, pessoa titular) : titular(titular)
{   
    this->titular = titular;
    this->numero = numero;
    this->saldo = 0;
}
float conta::getSaldo()
{
    return this->saldo;
}
void conta::depositar(float valor)
{
    if (valor<0)
    {
        std::cout << "VALOR INVALIDO" << std::endl;
    }
    else
    {
        this->saldo += valor;
    }
}
void conta::sacar(float valor)
{
    if (valor<0)
    {
        std::cout << "VALOR INVALIDO" << std::endl;
    }
    else if (valor>this->saldo)
    {
        std::cout << "SALDO INSUFICIENTE" << std::endl;
    }

    else
    {
        saldo-=valor;
    }
    
}

//Conta(778102, 5.00, Pessoa(Anaximandro, 10371022))
void conta::print()
{
    printf("Conta(%s, %.2f, Pessoa(%s, %s))\n", this->numero.c_str(), this->saldo, this->titular.getNome().c_str(), this->titular.getCpf().c_str());
}