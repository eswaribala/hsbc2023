import {Component} from "react";
import { Accordion, AccordionTab } from 'primereact/accordion';

function LoanAgainstProperty(props){
        return(
              <div className="card">
                    <Accordion activeIndex={0}>
                        <AccordionTab header="Mortgage">
                            <p className="m-0">
                                <h3>props?.firstName</h3>
                                <h3>props?.lastName</h3>
                                <h3>props?.dob</h3>
                             </p>
                        </AccordionTab>
                        <AccordionTab header="Home Loan">
                            <p className="m-0">
                                      </p>
                        </AccordionTab>
                        <AccordionTab header="Corporate Loan">
                            <p className="m-0">
                                                           </p>
                        </AccordionTab>
                    </Accordion>
            </div>
        )
}

export default LoanAgainstProperty;
