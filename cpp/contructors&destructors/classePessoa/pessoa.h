#ifndef PESSOA_H
#define PESSOA_H
#include "data.h"
#include <string>
#include "endereco.h"
class pessoa
{
private:
    std::string nome;
    std::string cpf;
    std::string email;
    data nascimento;
    endereco moradia;
    int validaCPF(std::string CPF);
    int validaEmail(std::string mail);
public:
    pessoa(std::string nome, std::string CPF, std::string email, data nascimento, endereco moradia);
    void setCPF(std::string CPF);
    void setEmail(std::string mail);
    void print();
    
};

#endif