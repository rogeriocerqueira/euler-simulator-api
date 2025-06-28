package com.example.euler.controller;

import com.example.euler.model.EulerResult;
import com.example.euler.model.SimulationRequest;
import com.example.euler.service.EulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulate")
public class EulerController {

    @Autowired
    private EulerService eulerService;

    @PostMapping("/euler")
    public List<EulerResult> simulate(@RequestBody SimulationRequest request) {
        return eulerService.simulate(request);
    }
}
