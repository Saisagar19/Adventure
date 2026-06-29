using Microsoft.AspNetCore.Mvc;
using WebApiExam.Models;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace HospitalWebApiExam.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PatientController : ControllerBase
    {
        private readonly List<Patient> _patients;
        public PatientController()
        {
            _patients = new List<Patient>() {
            new Patient(){ PatientId = 1, PatientName = "Sahil", Age=23, Disease="Fever", DoctorName="Dr. Santosh"},
            new Patient(){ PatientId = 2, PatientName = "Ankit", Age=22, Disease="Fever", DoctorName="Dr. Santosh"},
            new Patient(){ PatientId = 3, PatientName = "Akshay", Age=33, Disease="Cold", DoctorName="Dr. Rathi"},
            new Patient(){ PatientId = 4, PatientName = "Siddharth", Age=19, Disease="Diabetes", DoctorName="Dr. Parmar"},
            new Patient(){ PatientId = 5, PatientName = "Naval", Age=43, Disease="Asthma", DoctorName="Dr. Shinde"}
            };
        }

        // GET: api/<PatientController>
        [HttpGet]
        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]

        public ActionResult<List<Patient>> GetPatients()
        {
            if (_patients.Count > 0)
            {
                return Ok(_patients);
            }
            else
            {
                return NoContent();
            }
        }

        // GET: api/Patient/{id}
        [HttpGet("{id:int}")]
        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]

        public ActionResult<Patient> GetPatientById(int id)
        {
            if (_patients.Count > 0)
            {
                return Ok(_patients.Find(p => p.PatientId == id));
            }
            else
            {
                return NoContent();
            }
        }

        // GET: api/Patient/disease/{disease}
        [HttpGet("disease/{disease:alpha}")]
        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]

        public ActionResult<Patient> GetPatientByDisease(string disease)
        {
            var diseasePatient = _patients.Where(p => p.Disease.ToLower().Equals(disease.ToLower())).ToList();
            if (diseasePatient.Count > 0)
            {
                return Ok(diseasePatient);
            }
            else
            {
                return NoContent();
            }
        }

        // GET: api/Patient/doctor/{doc}
        [HttpGet("doctor/{doc}")]
        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]

        public ActionResult<Patient> GetPatientByDoctor(string doc)
        {
            var docPatient = _patients.Where(p => p.DoctorName.ToLower().Equals(doc.ToLower())).ToList();
            if (docPatient.Count > 0)
            {
                return Ok(docPatient);
            }
            else
            {
                return NoContent();
            }
        }



    }
}
