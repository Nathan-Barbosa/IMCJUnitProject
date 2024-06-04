package control;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {

        double imc = peso / (altura * altura);
        String categoriaImc = "";

        if (idade >= 20 && idade <= 65) {
            if (imc < 16) {
                categoriaImc = "Baixo peso muito grave";
            } else if (imc >= 16 && imc < 17) {
                categoriaImc = "Baixo peso grave";
            } else if (imc >= 17 && imc < 18.5) {
                categoriaImc = "Baixo peso";
            } else if (imc >= 18.5 && imc < 25) {
                categoriaImc = "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                categoriaImc = "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                categoriaImc = "Obesidade grau I";
            } else if (imc >= 35 && imc <= 40) {
                categoriaImc = "Obesidade grau II";
            } else {
                categoriaImc = "Obesidade grau III (obesidade mórbida)";
            }
        } else if (idade > 65) {
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 21.9) {
                    categoriaImc = "Baixo peso";
                } else if (imc >= 21.9 && imc <= 27) {
                    categoriaImc = "Peso normal";
                } else if (imc > 27 && imc <= 32) {
                    categoriaImc = "Sobrepeso";
                } else if (imc > 32 && imc <= 37) {
                    categoriaImc = "Obesidade grau I";
                } else if (imc > 37 && imc < 42) {
                    categoriaImc = "Obesidade grau II";
                } else {
                    categoriaImc = "Obesidade grau III (obesidade mórbida)";
                }
            } else {
                if (imc < 21.9) {
                    categoriaImc = "Baixo peso";
                } else if (imc >= 21.9 && imc <= 27) {
                    categoriaImc = "Peso normal";
                } else if (imc > 27 && imc <= 30) {
                    categoriaImc = "Sobrepeso";
                } else if (imc > 30 && imc <= 35) {
                    categoriaImc = "Obesidade grau I";
                } else if (imc > 35 && imc < 40) {
                    categoriaImc = "Obesidade grau II";
                } else {
                    categoriaImc = "Obesidade grau III (obesidade mórbida)";
                }
            }
        } else {
            categoriaImc = "Interpretação do IMC para crianças e adolescentes não implementada.";
        }

        return categoriaImc;
    }
}