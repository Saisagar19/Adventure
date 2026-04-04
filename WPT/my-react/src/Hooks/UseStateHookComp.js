import React, { useState } from 'react';

const UseStateHookComp = () => {
       const [count,setCount] = useState(0);
       const [myName,setMyName] = useState("Panchashil");
       const [items,setItems] = useState([
        {id:1,name:"Samosa"},
        {id:2,name:"Dosa"},
        {id:3,name:"Vadapav"},
        {id:4,name:"Idali"}
       ]);

  return (
    <div>
        <h2>UseStateHookComp</h2>
        <div>Count:{count}</div>
        <button type='button' onClick={()=>setCount(count+1)}>count++</button>
        <button type='button' onClick={()=>setCount(count-1)}>count--</button><hr/>
        <div>My Name Is: <strong>{myName}</strong></div>
        <h3 onMouseOver={()=>setMyName("Panchashil Wankhede")}>Hover on me to update name</h3>
       <ul>
        {
          items.map((val,index)=>{
            return <li key={val.id}>{val.id}-{val.name}</li>
          })  
        }
       </ul>
    </div>
  )
}

export default UseStateHookComp