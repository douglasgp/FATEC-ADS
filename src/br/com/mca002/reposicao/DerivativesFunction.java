package br.com.mca002.reposicao;
/*
 * Conjunto de bibliotecas que realiza c�lculos matem�ticos complexos.
 * A sua manute��o e disponibilidade � feito pela comunidade de forma espont�nea.
 * Para desenvolver este exemplo foi usado a biblioteca do seguinte usu�iro:
 * Abhishek Nigam (https://github.com/abhisheknigam/Java-Calculus-Library)
 * Cr�ditos by https://stackoverflow.com/users/952648/tom
 */
import java.util.Scanner;
import javacalculus.core.CALC;
import javacalculus.core.CalcParser;
import javacalculus.evaluator.CalcSUB;
import javacalculus.exception.CalcSyntaxException;
import javacalculus.struct.CalcDouble;
import javacalculus.struct.CalcObject;
import javacalculus.struct.CalcSymbol;

public class DerivativesFunction {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter expression: ");
		String expression = scan.nextLine();
		// 
		expression = expression.replaceAll("sin", "SIN");
		expression = expression.replaceAll("cos", "COS");

		System.out.println("Diferenciar em rela��o a ");
		String variable = scan.nextLine();

		// Diferenciar
		String comando = "DIFF(" + expression + ", " + variable + ")";
		CalcParser parser = new CalcParser();
		CalcObject parsed = parser.parse(comando);
		CalcObject resultado = parsed.evaluate();

		// Calcula valor num�rico
		resultado = subst(resultado, "a1", 0.0);
		resultado = subst(resultado, "a2", 10.0);
		resultado = CALC.SYM_EVAL(resultado);

		System.out.println("Resuldado: ");
		System.out.println(resultado);
	}

	static CalcObject subst(CalcObject input, String var, double number) {
		CalcSymbol symbol = new CalcSymbol(var);
		CalcDouble value = new CalcDouble(number);
		return CalcSUB.numericSubstitute(input, symbol, value);
	}

}
