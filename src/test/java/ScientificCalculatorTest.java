import org.example.Tp1.ScientificCalculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class ScientificCalculatorTest {


    ScientificCalculator calc;


    @BeforeEach
    void setUp() {
        calc = new ScientificCalculator();
    }


    @Test
    void testAddition() {
        double resultado = calc.add(10.0, 5.0);
        assertEquals(15.0, resultado);
    }


    @Test
    void testSubtract() {
        double a = 10.0;
        double b = 4.0;
        double resultado = calc.subtract(a, b);
        assertEquals(6.0, resultado);


    }


    @Test
    void testSquareRootPositive() {
        double resultado = calc.squareRoot(25.0);
        assertEquals(5.0, resultado);
    }


    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-9.0);
        });
    }


    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10.0, 0.0);
        });
    }


    @Test
    void testLog() {
        double resultado = calc.log(Math.E);
        assertEquals(1.0, resultado, 0.0001); // margem de erro
    }


    @Test
    void testSin() {
        double resultado = calc.sin(90.0);
        assertEquals(1.0, resultado, 0.0001); // margem de erro
    }


    // Exercício 9: Priorizando testes
    // --> Análise textual abaixo:
   /*
   Análise da cobertura e priorização de testes:


   - Métodos que merecem mais atenção:
       Métodos como divide(), squareRoot() e log() merecem testes cuidadosos
       pois podem lançar exceções em cenários inválidos (como divisão por zero ou log de número negativo).


   - Como a cobertura ajuda:
       A cobertura de código mostra quais linhas e métodos foram exercitados pelos testes.
       Com isso, é possível identificar partes do código que ainda não foram testadas, ajudando a melhorar a robustez dos testes.
   */






    // - Testes de operações básicas -
    @Test void testMultiply() {
        assertEquals(20.0, calc.multiply(4.0, 5.0));
    }


    @Test void testDivide() {
        assertEquals(2.0, calc.divide(10.0, 5.0));
    }


    // - Testes de operações matemáticas avançadas -
    @Test void testPower() {
        assertEquals(8.0, calc.power(2.0, 3.0));
    }


    @Test void testCos() {
        assertEquals(1.0, calc.cos(0.0), 0.0001);
    }


    // - Testes de erro -
    @Test void testLogZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.log(0.0);
        });
    }
}

