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
    }

    componentWillUnmount() {
        super.componentWillUnmount();
    }

    render() {
    }

    componentDidMount() {
        super.componentDidMount();
    }
}
