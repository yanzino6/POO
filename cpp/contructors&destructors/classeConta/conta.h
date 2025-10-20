#ifndef CONTA_H
#define CONTA_H
#include "pessoa.h"

class conta
{
private:
    pessoa titular;
    std::string numero;
    float saldo;
public:
    conta(std::string numero, pessoa titular);
    void depositar(float valor);
    void sacar(float valor);
    float getSaldo();
    void print();
};


#endif