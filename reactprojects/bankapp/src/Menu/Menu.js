import React from "react";
import {Menubar} from "primereact/menubar";
import {items} from "../models/menudata";

//stateless component
const menubar=()=>(
  <div>
      <Menubar model={items}></Menubar>
  </div>
);

export default menubar;
