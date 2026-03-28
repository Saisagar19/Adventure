function getData()
{
    let xmlhttp =new XMLHttpRequest();
    xmlhttp.onload= function()
    {
        let data = JSON.parse(this.responseText)
        let parentE1=document.getElementById("d1")
        for(let i = 0; i<data.length; i++)
        {
            let newTR = document.createElement("tr");
            newTR.innerHTML = `<td>${data[i].id}</td><td>${data[i].name}</td><td>${data[i].age}</td><td>${data[i].email}</td><td>${data[i].city}</td>`;
            parentE1.appendChild(newTR)
        }
    }
    xmlhttp.open("GET",`http://localhost:8888/users`);
    xmlhttp.send();
}

function deleteRecord()
{
    let id = document.getElementById("uid").value;
    if(window.confirm(`Are you sure you want to delete this id:${id}`))
    {
        let xmlhttps =new XMLHttpRequest()
        xmlhttps.onload = function()
        {
            alert("Record deleted Successfully")
        };
        xmlhttps.open("DELETE", `http://localhost:8888/users/${id}`)
        xmlhttps.send();
    }
}