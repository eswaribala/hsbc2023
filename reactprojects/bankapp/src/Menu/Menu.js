import React from "react";
import {Menubar} from "primereact/menubar";
import {items} from "../models/menudata";
import {BrowserRouter as Router, Link, Route} from "react-router-dom";
import {Routes} from "react-router";
import {CashBackCard} from "../CashBackCard/CashBackcard";
import './menu.css'

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
             <Route path="/cashback-card" element={<CashBackCard />} />
             <Route path="/visa-platinum" element={<CashBackCard />} />
             <Route path="/smart-card" element={<CashBackCard />} />
             <Route path="/compare-card" element={<CashBackCard />} />
             <Route path="/card-features" element={<CashBackCard />} />
             <Route path="/savings-account" element={<CashBackCard />} />
             <Route path="/fixed-deposit" element={<CashBackCard />} />
             <Route path="/debit-card" element={<CashBackCard />} />
             <Route path="/loan-against-property" element={<CashBackCard />} />
             <Route path="/nri-home-loan" element={<CashBackCard />} />
             <Route path="/personal-loan" element={<CashBackCard />} />
             <Route path="/wealth-management" element={<CashBackCard />} />
             <Route path="/wealth-dashboard" element={<CashBackCard />} />
             <Route path="/insights" element={<CashBackCard />} />
             <Route path="/fx-details" element={<CashBackCard />} />
             <Route path="/remittances" element={<CashBackCard />} />
             <Route path="/online-travel" element={<CashBackCard />} />
             <Route path="/simply-pay" element={<CashBackCard />} />
           
         </Routes>
     }
 </Router>
);

export default menubar;
