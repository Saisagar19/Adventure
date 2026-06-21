namespace Ques5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string pathFile = @"C:\Users\saisagar\Desktop\textSample.txt";
            string copyPath = @"C:\Users\saisagar\Desktop\textCopy.txt";

            File.WriteAllText(pathFile, "Hello, Guys I am Sagar");
            if (File.Exists(pathFile))
            {
                Console.WriteLine("File Exists");

                string content = File.ReadAllText(pathFile);
                Console.WriteLine(content);

                File.Copy(pathFile, copyPath, true);
                Console.WriteLine("File copied");

                File.Delete(copyPath);
                Console.WriteLine("Copied File Deleted");
            }
            else
            {
                Console.WriteLine("File Not Found");
            }
        }
    }
}
