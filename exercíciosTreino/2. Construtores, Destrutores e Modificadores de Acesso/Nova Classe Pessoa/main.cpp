#include "endereco.h"
#include "data.h"
#include "pessoa.h"
#include <iostream>
int main()
{
    std::string rua,num,bairro,cidade,pais,nome,cpf,email;
    int dia,mes,ano;
    int atualizacoes;
    std::string alterado;
    std::string valAlteracao;

    std::cin >> dia>>mes>>ano>>rua>>num>>bairro>>cidade>>pais>>nome>>cpf>>email>>atualizacoes;
    data d(dia,mes,ano);
    endereco e(rua,num,bairro,cidade,pais);
    pessoa p(nome,cpf,email,d,e);

    for (int i = 0; i < atualizacoes; i++)
    {
        std::cin >>alterado>>valAlteracao;

        if (alterado == "CPF")
        {
            p.setCPF(valAlteracao);
        }
        if (alterado == "EMAIL")
        {
            p.setEmail(valAlteracao);
        }
    }
    

    

    p.print();
    return 0;
}