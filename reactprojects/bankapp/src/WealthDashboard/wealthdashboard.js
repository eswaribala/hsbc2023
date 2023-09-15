import {Component, useContext} from "react";
import {CountryContext} from "../WealthManagement/wealthmanagement";



function WealthDashboard(){

    const {countries,setCountries} = useContext(CountryContext);
    console.log(countries);
        return(
            <div>
                <h1>Wealth Dashboard</h1>

            </div>
        )

}

export default WealthDashboard;
