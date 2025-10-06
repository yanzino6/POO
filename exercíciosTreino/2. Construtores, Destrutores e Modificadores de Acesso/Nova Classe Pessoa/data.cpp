#include "data.h"
#include <iostream>
data::data(int dia, int mes, int ano)
{
    this->dia=dia;
    this->mes=mes;
    this->anos=ano;

}
void data::print()
{
    std::cout << "Data("<< this->dia<<", "<< this->mes<<", "<<this->anos<<")";
}