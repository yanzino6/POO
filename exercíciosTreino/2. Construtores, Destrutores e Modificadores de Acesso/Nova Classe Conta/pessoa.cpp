#include "pessoa.h"

pessoa::pessoa(std::string nome, std::string cpf)
{
    this->nome = nome;
    this->cpf = cpf;
}
std::string pessoa::getNome()
{
    return nome;
}
std::string pessoa::getCpf()
{
    return cpf;
}
