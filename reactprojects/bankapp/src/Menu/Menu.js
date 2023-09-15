import React from "react";
import {Menubar} from "primereact/menubar";
import {items} from "../models/menudata";
import { BrowserRouter as Router, Routes, Link, Route } from 'react-router-dom';

import {CashBackCard} from "../CashBackCard/CashBackcard";
import {VisaPlatinum} from "../VisaPlatinum/visaplatinum";
import {SmartCard} from "../SmartCard/smartcard";
import {CompareCard} from "../CompareCard/comparecard";
import {SimplyPay} from "../SimplyPay/simplypay";
import {Remittance} from "../Remittance/remittance";
import {OnlineTravel} from "../OnlineTravel/onlinetravel";
import {PersonalLoan} from "../PersonalLoan/personalLoan";
import {NRIHomeLoan} from "../NRIHomeLoan/nrihomeloan";
import SavingsAccount from "../SavingsAccount/savingsaccount";
import {FxDetails} from "../FXDetails/fxdetails";
import {FixedAccount} from "../FixedAccount/fixedaccount";
import './menu.css'
import {CardFeatures} from "../CardFeatures/cardfeatures";
import {DebitCard} from "../DebitCard/debitcard";
import LoanAgainstProperty from "../LoanAgainstProperty/loanagainstproperty";
import {WealthManagement} from "../WealthManagement/wealthmanagement";
import {WealthDashboard} from "../WealthDashboard/wealthdashboard";
import {Insights} from "../Insights/insights";


//stateless component
const menubar=()=>(
 <Router>
  <div className="menu">
      <Menubar model={items}   pt={{
          action: ({ props, state, context }) => ({
              className: context.active ? 'bg-primary-200 border-round-sm' : undefined
          })
      }}>

      </Menubar>
  </div>
     {
         <Routes>
             <Route path="/cashback-card" element={<CashBackCard/>}/>
             <Route path="/visa-platinum"  element={<VisaPlatinum/>}/>
             <Route path="/smart-card"  element={<SmartCard/>}/>
             <Route path="/compare-card" element={<CompareCard/>}/>
             <Route path="/card-features"  element={<CardFeatures/>}/>
             <Route path="/savings-account"  element={<SavingsAccount/>} />
             <Route path="/fixed-deposit" element={<FixedAccount/>} />
             <Route path="/debit-card"  element={<DebitCard/>}/>
             <Route path="/loan-against-property"  element={<LoanAgainstProperty/>}/>
             <Route path="/nri-home-loan" element={<NRIHomeLoan/>}/>
             <Route path="/personal-loan"  element={<PersonalLoan/>}/>
             <Route path="/wealth-management" element={<WealthManagement/>}/>
             <Route path="/wealth-dashboard" element={<WealthDashboard/>}/>
             <Route path="/insights"  element={<Insights/>}/>
             <Route path="/fx-details" element={<FxDetails/>}/>
             <Route path="/remittances" element={<Remittance/>}/>
             <Route path="/online-travel"  element={<OnlineTravel/>}/>
             <Route path="/simply-pay"  element={<SimplyPay />}></Route>

         </Routes>}

 </Router>
);

export default menubar;
