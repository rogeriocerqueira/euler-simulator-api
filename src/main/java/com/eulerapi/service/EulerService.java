package com.example.euler.service;

import com.example.euler.model.EulerResult;
import com.example.euler.model.SimulationRequest;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EulerService {
    public List<EulerResult> simulate(SimulationRequest request) {
        double x = request.getX0();
        double y = request.getY0();
        double h = request.getH();
        int n = request.getN();

        List<EulerResult> results = new ArrayList<>();
        results.add(new EulerResult(x, y));

        for (int i = 0; i < n; i++) {
            Expression e = new ExpressionBuilder(request.getFunction())
                    .variables("x", "y")
                    .build()
                    .setVariable("x", x)
                    .setVariable("y", y);

            double dydx = e.evaluate();

            y = y + h * dydx;
            x = x + h;

            results.add(new EulerResult(x, y));
        }

        return results;
    }
}
