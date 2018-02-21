import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by GRUPOLINK on 21/2/2018.
 */
public class OperacionesTest {

    //ordersShouldBeCreated
    //Given[ExplainYourInput]When[WhatIsDone]Then[ExpectedResult]

    private Operaciones operaciones;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void initialize() {
        operaciones = new Operaciones();
    }

    @Test
    public void suma() {
        assertEquals(8, operaciones.suma(5, 2), 1);
    }

    @Test
    public void resta() throws Exception {
        assertEquals(6, operaciones.resta(8, 2), 0);
    }

    @Test
    public void multiplicacion() {
    }

    @Test
    //Given[ExplainYourInput]When[WhatIsDone]Then[ExpectedResult]
    public void divisionPara0() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("Zero not allowed");
        assertEquals(0, operaciones.division(0, 0), 0);
    }

    @Test
    public void operacionToString() {
        assertEquals("La suma de: 3.0 + 2.0 es: 5.0",
                operaciones.operacionToString("suma", 3, 2)
        );
    }

}