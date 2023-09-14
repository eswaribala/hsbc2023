import React from "react";
import {Menubar} from "primereact/menubar";
import {items} from "../models/menudata";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import {Routes} from "react-router";
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

 </Router>
);

export default menubar;
