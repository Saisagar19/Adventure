using FirstMVC.Models;
using Microsoft.AspNetCore.Mvc;

namespace FirstMVC.Controllers
{
    public class EmployeesController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        //Employees/List
        public IActionResult List()
        {
            var emp = new List<Employee>
            {
                new Employee { EmpId = 1,  EmpName = "Sagar",   Designation = "SDE 1", Salary = 58699 },
                new Employee { EmpId = 2,  EmpName = "Rohan",   Designation = "SDE 2", Salary = 78699 },
                new Employee { EmpId = 3,  EmpName = "Soham",   Designation = "SDE 3", Salary = 98699 },
                new Employee { EmpId = 4,  EmpName = "Amit",    Designation = "Software Engineer", Salary = 65000 },
                new Employee { EmpId = 5,  EmpName = "Rahul",   Designation = "Senior Developer", Salary = 85000 },
                new Employee { EmpId = 6,  EmpName = "Priya",   Designation = "QA Engineer", Salary = 55000 },
                new Employee { EmpId = 7,  EmpName = "Neha",    Designation = "Business Analyst", Salary = 70000 },
                new Employee { EmpId = 8,  EmpName = "Karan",   Designation = "Team Lead", Salary = 120000 },
                new Employee { EmpId = 9,  EmpName = "Sneha",   Designation = "Project Manager", Salary = 140000 },
                new Employee { EmpId = 10, EmpName = "Vishal",  Designation = "Architect", Salary = 180000 }
            };
            return View(emp);
        }
        //Employees/Card
        public IActionResult Card()
        {
           var emp = new List<Employee>
           {
                new Employee { EmpId = 1,  EmpName = "Sagar",   Designation = "SDE 1", Salary = 58699 },
                new Employee { EmpId = 2,  EmpName = "Rohan",   Designation = "SDE 2", Salary = 78699 },
                new Employee { EmpId = 3,  EmpName = "Soham",   Designation = "SDE 3", Salary = 98699 },
                new Employee { EmpId = 4,  EmpName = "Amit",    Designation = "Software Engineer", Salary = 65000 },
                new Employee { EmpId = 5,  EmpName = "Rahul",   Designation = "Senior Developer", Salary = 85000 },
                new Employee { EmpId = 6,  EmpName = "Priya",   Designation = "QA Engineer", Salary = 55000 },
                new Employee { EmpId = 7,  EmpName = "Neha",    Designation = "Business Analyst", Salary = 70000 },
                new Employee { EmpId = 8,  EmpName = "Karan",   Designation = "Team Lead", Salary = 120000 },
                new Employee { EmpId = 9,  EmpName = "Sneha",   Designation = "Project Manager", Salary = 140000 },
                new Employee { EmpId = 10, EmpName = "Vishal",  Designation = "Architect", Salary = 180000 }
            };
            return View(emp);
        }
    }
}
