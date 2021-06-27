/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package com.onushi.springtestrecorder.demo.example1;

import com.onushi.springtestrecorder.aspect.RecordTest;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SampleService {
    @RecordTest
    public Date minDate(Date date1, Date date2) {
        if (date1 == null) {
            throw new IllegalArgumentException("date1");
        }
        if (date2 == null) {
            throw new IllegalArgumentException("date2");
        }
        return date1.before(date2) ? date1 : date2;
    }
}
