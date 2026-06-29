namespace WebApiExam.Models
{
    public class Patient
    {
        public int PatientId { get; set; }
        public string PatientName { get; set; } = string.Empty;
        public string Disease { get; set; } = string.Empty;
        public int Age { get; set; }
        public string DoctorName { get; set; } = string.Empty;
    }
}
