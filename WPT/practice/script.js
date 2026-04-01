function checkAll()
{
    let name = document.getElementById("name").value;
    let regname = "^[a-zA-Z ]{2,20}$";

    let email = document.getElementById("email").value;
    let regemail = "^[a-zA-Z0-9_%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$";


    if(name.trim() === "" || email.trim() === "")
    {
        window.alert("This feild is required");
        return false;
    }

    if(!email.match(regemail))
    {
        window.alert("Email must contains @ , .com");
        return false;
    }
    if(!name.match(regname))
    {
        window.alert("Full Name must contains character in between 2 to 20");
        return false;
    }
}