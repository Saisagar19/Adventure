import {createBrowserRouter} from 'react-router-dom';
import MyImagesComp from '../component/MyImagesComp';
import SliderComp from '../component/SliderComp';
import ParentComp from '../component/ParentComp';
import PageNotFound from '../layout/PageNotFound';
import DashboardCom from '../layout/DashboardCom';
import ReactHooksComp from '../Hooks/ReactHooksComp'; 
import UseStateHookComp from '../Hooks/UseStateHookComp'; 
import UseEffectHookComp from '../Hooks/UseEffectHookComp'; 
import LoginComp from '../layout/LoginComp';
const router = createBrowserRouter([
    {path:"",element:<LoginComp/>},
    {path:"login",element:<LoginComp/>},
    {path:"dashboard",element:<DashboardCom/>, children:[
          // 2. default routing 
    {path:"",element:<SliderComp/>},
    // 1. naming routing 
    {path:"myimages",element:<MyImagesComp/>},
    {path:"slider",element:<SliderComp/>},
    // 3.parameterize routing 
    {path:"parent/:id",element:<ParentComp/>},
    // 4.child routing
    {path:"hooks",element:<ReactHooksComp/>, children:[
        {path:"",element:<UseStateHookComp/>},
        {path:"usestate",element:<UseStateHookComp/>},
        {path:"useeffect",element:<UseEffectHookComp/>},
    ]}, 
    ]},
    
    //5. whild card routing 
    {path:"*",element:<PageNotFound/>}
]);
export default router;