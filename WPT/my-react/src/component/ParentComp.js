import React, { Component } from "react";
import ChildComp from "./ChildComp";

class ParentComp extends Component{
    constructor(){
        super();
        this.state={
            itemName:"Dosa",
            itemPrice:100
        }
    }
    changeData(){
        this.setState((prevState)=>({itemName:"Masala Dosa",itemPrice:prevState.itemPrice+10}));
    }
    render(){
        return (<div>
            <h2>This is Parent Comp</h2>
            <div>Menue:<strong>{this.state.itemName}</strong>
            </div>
            <div>Price:<strong>{this.state.itemPrice}</strong>
            </div>
           <button type="button" onClick={()=>this.changeData()}> change Emp Data</button> 
       <hr/>
         <ChildComp item={this.state.itemName} price={this.state.itemPrice} myaction={()=>this.changeData()}></ChildComp>
        </div>)
    }

}
export default ParentComp;