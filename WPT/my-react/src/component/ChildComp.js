
const ChildComp = (props) => {
    return (<div>
        <h2>This is child component</h2>
        <div>Menue:<strong>{props.item}</strong></div>
        <div>Price:<strong>{props.price}</strong></div>
        <h2 onMouseOver={()=>props.myaction()}>Hove on me to Change data</h2>
    </div>)
}

export default ChildComp;