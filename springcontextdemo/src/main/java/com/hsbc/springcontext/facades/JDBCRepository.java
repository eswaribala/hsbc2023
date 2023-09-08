package com.hsbc.springcontext.facades;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JDBCRepository implements InvoiceRepository{

}
