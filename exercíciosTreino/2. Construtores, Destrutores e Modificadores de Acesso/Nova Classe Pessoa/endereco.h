#ifndef PESSOA_H
#define PESSOA_H
#include <stdio.h>
#include <string>

class endereco
{
private:
    std::string rua;
    std::string numero;
    std::string bairro;
    std::string cidade;
    std::string pais;
public:
   endereco(std::string rua,std::string numero,std::string bairro,std::string cidade,std::string pais);
   void printa();
};


#endif