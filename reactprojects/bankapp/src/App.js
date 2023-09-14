import './App.css';
import {Component} from "react";
import LOGO from './Logo/Logo'
import Menubar from './Menu/Menu'
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
        //console.log("Entering  constructor");
        //step 1 create state
        this.state={
            currentTime:new Date(),
        }

    }
    //step2
    timerEvent=()=>{
        this.setState({
            currentTime:new Date()
        })
    }



    componentWillUnmount() {
        //super.componentWillUnmount();
       // console.log("Entering  will mount");
    }
    render() {
        //console.log("Entering  render");
        return(
            <section>
                <header className="App-header">
                    <LOGO/>
                    <h1 className="multicolortext">HSBC Bank</h1>
                    <h3>{this.state.currentTime.toLocaleTimeString()}</h3>
                </header>
                <section >
                    <Menubar/>
                </section>
            </section>

        )
    }
    componentDidMount() {
        //super.componentDidMount();
       // console.log("Entering  did mount");
        //step 3 call once in a second
        setInterval(this.timerEvent,1000);

    }
}
