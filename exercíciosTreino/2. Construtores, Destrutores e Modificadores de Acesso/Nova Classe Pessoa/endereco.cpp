#include "endereco.h"
#include <iostream>
endereco::endereco(std::string rua,std::string numero,std::string bairro,std::string cidade,std::string pais)
{
    this->rua=rua;
    this->numero=numero;
    this->bairro=bairro;
    this->cidade=cidade;
    this->pais=pais;
}
//Endereco(RuaA, 123, BairroB, CidadeC, PaisD), Data(15, 8, 1990)
void endereco::printa()
{
    std::cout << "Endereco(" << this->rua << ", " << this->numero << ", " << this->bairro << ", " << this->cidade << ", " << this->pais << ")" << std::endl;
    
}
