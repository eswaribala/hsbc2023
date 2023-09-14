import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import {BankApp} from './App';
import reportWebVitals from './reportWebVitals';
import "primereact/resources/themes/lara-dark-indigo/theme.css";  //theme
import "primereact/resources/primereact.min.css";                  //core css
import "primeicons/primeicons.css";

const root = ReactDOM.createRoot(document.getElementById('bank-root'));
root.render(
  <React.StrictMode>
    <BankApp />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
