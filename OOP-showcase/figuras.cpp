#include <bits/stdc++.h>
#include <cmath>
#include <iostream>
#include <string>

using namespace std;

class figura
{
protected:
    float area;
    float perimetro;
    string color;

public:
    void calcularArea();
    void calcularPerimetro();
    string getColor();
    string getPropiedades();
};

class circulo : public figura
{
private:
    int radio;

public:
    circulo(string c, int r)
    {
        color = c;
        radio = r;
        calcularArea();
        calcularPerimetro();
    }
    void calcularArea()
    {
        area = M_PI * pow(radio, 2);
    }
    void calcularPerimetro()
    {
        perimetro = M_PI * 2 * radio;
    }
    string getColor()
    {
        return color;
    }
    string getPropiedades()
    {
        return "Color: " + color + " Area: " + to_string(area) + " Perimetro: " + to_string(perimetro);
    }
};

class cuadrado : public figura
{
private:
    int lado;

public:
    cuadrado(string c, int l)
    {
        lado = l;
        color = c;
        calcularArea();
        calcularPerimetro();
    }
    void calcularArea()
    {
        area = pow(lado, 2);
    }
    void calcularPerimetro()
    {
        perimetro = 4.00 * float(lado);
    }
    string getColor()
    {
        return color;
    }
    string getPropiedades()
    {
        return "Color: " + color + " Area: " + to_string(area) + " Perimetro: " + to_string(perimetro);
    }
};

class triangulo : public figura
{
private:
    int lado;

public:
    triangulo(string c, int l)
    {
        lado = l;
        color = c;
        calcularArea();
        calcularPerimetro();
    }
    void calcularArea()
    {
        area = pow(3, 0.5) * float(lado) / 2;
    }
    void calcularPerimetro()
    {
        perimetro = 3.00 * float(lado);
    }
    string getColor()
    {
        return color;
    }
    string getPropiedades()
    {
        return "Color: " + color + " Area: " + to_string(area) + " Perimetro: " + to_string(perimetro);
    }
};

int main()
{
    circulo circ("rojo", 5);
    triangulo trian("verde", 3);
    cuadrado cuad("azul", 4);
    cout << circ.getPropiedades() << endl;
    cout << trian.getPropiedades() << endl;
    cout << cuad.getPropiedades() << endl;
}