import React, { Component } from 'react'

class MyStateComp extends Component {

    constructor() {
        super();
        this.state = {
            name: "Panchashil",
            salary: 50000
        }
    }
    changeState(){
    //   this.setState({name:"Panchashil Wankhede",salary:this.state.salary+5000});  
    this.setState((prevState)=>({name:"Panchashil Wankhede",salary:prevState.salary+5000}));
    }

    greeting(){
        window.alert("Good Morning Every One");
    }
    render() {
        return (
            <div>MyStateComp
                {/* access state property  */}
                <p>My Name:{this.state.name} and Salary:{this.state.salary}</p>
                  {/* call event  */}
                <button type='button' onClick={()=>this.greeting()}>call greeting</button>
                
                <button type='button' onClick={()=>this.changeState()}>Update State</button>

                <button type='button' onClick={()=> this.setState((prevState)=>({name:"Panchashil Wankhede",salary:prevState.salary+5000}))}>Update State data</button>
            </div>

        )
    }
}

export default MyStateComp;