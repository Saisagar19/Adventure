namespace ConsoleDirectory
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Directory Data ");
        
            try
            {
                foreach (var drive in DriveInfo.GetDrives())
                {
                    if (drive.DriveType != DriveType.Network)
                    {
                        Console.WriteLine($"Drive Name : {drive.Name}");
                    }
                }
            }
            catch (UnauthorizedAccessException uae)
            {
                Console.WriteLine(uae.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine("-------------------------------------------------------------");

            //For specific directory
            string dirName = @"C:\";
            DirectoryInfo directoryInfo = new DirectoryInfo(dirName);
            Console.WriteLine($"Currently in DriveName:  {directoryInfo.Root}");
            foreach (var directory in directoryInfo.GetDirectories())
            {

                Console.WriteLine($"\t\t FolderName: {directory.Name}");
                try
                {
                    foreach (var files in directory.GetFiles())
                    {
                        Console.WriteLine($"\t\t\t\tFile Name: {files.Name}");
                    }
                }
                catch (UnauthorizedAccessException uae)
                {
                    Console.WriteLine(uae.Message);
                }
            }
        }
    }
}
