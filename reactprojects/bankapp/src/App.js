import './App.css';
import {Component} from "react";

/*
function BankApp() {
  return (
    <div className="App">
      <h1>HSBC Bank</h1>

    </div>
  );
}
*/

//export default BankApp;
//life cycle methods
export class BankApp extends Component{
    constructor(props, context) {
        super(props, context);
        console.log("Entering  constructor");
    }
    componentWillUnmount() {
        //super.componentWillUnmount();
        console.log("Entering  will mount");
    }
    render() {
        console.log("Entering  render");
        return(
            <div>
                <h1>HSBC Bank</h1>
            </div>
        )
    }
    componentDidMount() {
        //super.componentDidMount();
        console.log("Entering  did mount");
    }
}
