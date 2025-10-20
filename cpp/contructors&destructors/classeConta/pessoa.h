#ifndef PESSOA_H
#define PESSOA_H
#include <string>
class pessoa
{
private:
    std::string nome;
    std::string cpf;
public:
    pessoa(std::string nome, std::string cpf);
    std::string getNome();
    std::string getCpf();
};

#endif