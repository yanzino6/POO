#ifndef PESSOA_H
#define PESSOA_H
#include "data.h"
#include "endereco.h"
#include <string>

class pessoa
{
private:
    std::string nome;
    std::string cpf;
    std::string email;
    data nascimento;
    
public:
    pessoa(/* args */);
    
};


#endif