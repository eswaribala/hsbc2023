import {Component, useEffect, useState} from "react";
import {fetchCountries} from "../SavingsAccount/fetchcountries";
import { useContext, createContext } from "react";
import WealthDashboard from "../WealthDashboard/wealthdashboard";

export const CountryContext = createContext("Unknown");

function WealthManagement({ children }){

    const [countries,setCountries]=[]=useState(["India","Nepal"]);
    useEffect(() => {
        fetchCountries().then(res=>{
            setCountries(res.data);
        })
    },[]);

        return(
            <div>
                <h1>Wealth Management</h1>
            <CountryContext.Provider value={{countries,setCountries}}>
              <WealthDashboard/>
            </CountryContext.Provider>
            </div>
        )

}
export default WealthManagement;
