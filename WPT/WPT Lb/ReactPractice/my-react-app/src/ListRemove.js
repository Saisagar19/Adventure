import React, { Component } from "react";

class ListRemove extends Component {
  state = {
    items: ["Apple", "Banana", "Mango", "Orange"]
  };

  removeItem = (index) => {
    this.setState({
      items: this.state.items.filter((_, i) => i !== index)
    });
  };

  render() {
    return (
      <div>
        <h2>Fruits List</h2>
        {this.state.items.map((item, index) => (
          <div key={index}>{item}<button onClick={() => this.removeItem(index)}>Remove</button></div>
        ))}
      </div>
    );
  }
}

export default ListRemove;