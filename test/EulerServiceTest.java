package com.example.euler.service;

import com.example.euler.model.SimulationRequest;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EulerServiceTest {

    @Test
    void testSimulacaoEuler() {
        EulerService service = new EulerService();
        SimulationRequest req = new SimulationRequest();
        req.setX0(0);
        req.setY0(1);
        req.setH(0.1);
        req.setN(10);
        req.setFunction("y - x^2 + 1");

        var resultados = service.simulate(req);
        assertEquals(11, resultados.size());
    }
}
