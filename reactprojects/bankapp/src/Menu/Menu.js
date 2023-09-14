import React from "react";
import {Menubar} from "primereact/menubar";
import {items} from "../models/menudata";
import './menu.css'
//stateless component
const menubar=()=>(
  <div className="menu">
      <Menubar model={items}   pt={{
          action: ({ props, state, context }) => ({
              className: context.active ? 'bg-primary-200 border-round-sm' : undefined
          })
      }}>

      </Menubar>
  </div>
);

export default menubar;
