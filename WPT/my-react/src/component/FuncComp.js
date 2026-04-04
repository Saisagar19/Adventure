
const FuncComp = (props) => {

    return (
        <div>
            <h2>This is Function Component</h2>
            <p>My Name is: <strong>{props.myname}</strong>, I am:<strong> {props.post}</strong> </p>
        </div>
    )
}

export default FuncComp;