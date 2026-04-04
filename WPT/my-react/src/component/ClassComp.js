
import React, { Component } from "react";

class ClassComp extends Component{

    render(){
        return (<div>
            <h2>This is Class Component</h2>
           <p>My Name is: <strong>{this.props.myname}</strong>, I am:<strong> {this.props.post}</strong> </p>
        </div>)
    }
}
export default ClassComp;