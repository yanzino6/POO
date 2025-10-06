#include "pessoa.h"
#include <iostream>

int pessoa::validaCPF(std::string CPF)
{
    int tam = CPF.length();

    for (int i = 0; i < tam; i++)
    {
        if (CPF[i]<48|| CPF[i]>57)
        {
            this->cpf="N/A";
            return 0;
        }
        
    }
    return 1;
}
int pessoa::validaEmail(std::string mail)
{
    int tam = mail.length();

    for (int i = 0; i < tam; i++)
    {
        if (mail[i]=='@'&&mail[tam-4]=='.'&&mail[tam-3]=='c'&&mail[tam-2]=='o'&&mail[tam-1]=='m')
        {
            return 1;
        }
        
        
    }
    this->email = "N/A";
    return 0;
}
pessoa::pessoa(std::string nome, std::string CPF, std::string email, data nascimento, endereco moradia): nome(nome),nascimento(nascimento), moradia(moradia)
{
    if (this->validaCPF(CPF)==1)
    {
        this->cpf=CPF;
    }
    if (this->validaEmail(email)==1)
    {
        this->email=email;
    }
}
void pessoa::setCPF(std::string CPF)
{
    if (this->validaCPF(CPF)==1)
    {
        this->cpf=CPF;
    }
    else
    {
        std::cout << "CPF INVALIDO" <<std::endl;
    }
    
}
void pessoa::setEmail(std::string mail)
{
    if (this->validaEmail(mail)==1)
    {
        this->email=mail;
    }
    else
    {
        std::cout << "EMAIL INVALIDO" << std::endl;
    }
    
}

//Pessoa(nome, cpf, email, Endereco(rua, numero, bairro, cidade, pais), Data(dia, mes, ano)).
void pessoa::print()
{
    std::cout << "Pessoa("<<this->nome<<", "<<this->cpf<<", "<<this->email <<", ";
    this->moradia.printa();
    std::cout << ", ";
    this->nascimento.print();
    std::cout <<")"<<std::endl;
    
}