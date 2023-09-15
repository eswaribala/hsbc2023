import axios from "axios";
let countries=[];
let countryAPI="https://restcountries.com/v2/all"

export const fetchCountries = async () => {
    try {
        return await axios.get(`${countryAPI}`);
    } catch (e) {
        return [];
    }
};

