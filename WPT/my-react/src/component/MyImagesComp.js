import React, { Component } from 'react'
import samosa from '../shared/images/samosa.jpg';
import staticData from '../shared/constant/constantData';

class MyImagesComp extends Component {

  render() {
    return (
      <div>
        MyImagesComp <br/>
        {/* <img src={samosa} alt='' /> */}
        <img src={staticData.samoa} alt='samosa' width="150px" height="150px"/>
        <img src={staticData.vadapav} alt='samosa' width="150px" height="150px"/>
        <img src={staticData.dosa} alt='samosa' width="150px" height="150px"/>
         <br/>
         <video controls width="300px" height="300px">
            <source src={staticData.vdo}  />
         </video>
        </div>
    )
  }
}

export default MyImagesComp