package com.hrystem.payrollapi.payrollapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrystem.payrollapi.payrollapi.domain.Payroll;

@RestController
@RequestMapping(value = { "/api/payments" })
public class PayrollResource {

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
        return ResponseEntity.ok().body(
            new Payroll(
                "Willyan Ferdinando",
                payment.getDescription(),
                payment.getHourlyPrice(),
                200.0,
                payment.getHourlyPrice() * payment.getWorkedHours())
            );
    }

}
