import logo from './logo.svg';
import './App.css';
import FuncComp from './component/FuncComp';
import ClassComp from './component/ClassComp';
import MyStateComp from './component/MyStateComp';
import ConditionalRenComp from './component/ConditionalRenComp';
import ParentComp from './component/ParentComp';
import MyImagesComp from './component/MyImagesComp';
import UseStateHookComp from './Hooks/UseStateHookComp';
import UserComp from './component/UserComp';
import ErrorBoundaryComp from './component/ErrorBoudaryComp';
import ComponentLifeCycleComp from './component/ComponentLifeCycleComp';
import SliderComp from './component/SliderComp';
import CssComp from './component/CssComp';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
      <h1>Welcome You All in My React Sesion</h1>
      {/* <FuncComp myname="Panchashil Wankhede" post="Software Enginee" />
      <ClassComp myname="Kshitij Dongare" post="Manager" /> */}
      {/* <MyStateComp/> */}
      {/* <ConditionalRenComp/> */}
      {/* <ParentComp/> */}
      {/* <MyImagesComp/> */}
      {/* <UseStateHookComp/> */}

     {/* <ErrorBoundaryComp>
       <UserComp name="Abhishek"/>
     </ErrorBoundaryComp>
     <ErrorBoundaryComp>
       <UserComp name="Yash"/>
     </ErrorBoundaryComp>
    <ErrorBoundaryComp>
       <UserComp name="Ganesh"/>
     </ErrorBoundaryComp>
      <ErrorBoundaryComp>
       <UserComp name="Rushi"/>
     </ErrorBoundaryComp> */}

     {/* <ComponentLifeCycleComp mycolor="Pink"/> */}
     {/* <SliderComp/> */}
     <CssComp/>
    </div>
  );
}

export default App;
