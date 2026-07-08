# Docker Java Application -- Command Reference

## Step 1: Login to Docker Hub

``` bash
docker login
```

**Purpose:** Authenticates your local Docker CLI with your Docker Hub
account so you can push and pull images.

------------------------------------------------------------------------

## Step 2: Build the Docker Image

``` bash
docker build -t dockerUser/javaapp:0.0.1.RELEASE .
```

**Explanation** - `docker build` -- Builds a Docker image. - `-t` --
Assigns a name (tag) to the image. - `dockerUser/javaapp` -- Docker Hub
username and repository name. - `0.0.1.RELEASE` -- Image version
(tag). - `.` -- Uses the current directory as the build context.

------------------------------------------------------------------------

## Step 3: List Available Images

``` bash
docker image ls
```

**Purpose:** Displays all images stored on your local machine.

------------------------------------------------------------------------

## Step 4: Run the Container

### Detached Mode

``` bash
docker container run -d dockerUser/javaapp:0.0.1.RELEASE
```

**Explanation** - `docker container run` -- Creates and starts a
container. - `-d` -- Runs the container in the background. -
`dockerUser/javaapp:0.0.1.RELEASE` -- Image to execute.

For a simple Java program, the container exits automatically after the
program finishes.

------------------------------------------------------------------------

## Step 5: View Running Containers

``` bash
docker container ls
```

**Purpose:** Shows only currently running containers.

If nothing is displayed, the application has already finished.

------------------------------------------------------------------------

## Step 6: View All Containers

``` bash
docker container ls -a
```

**Purpose:** Displays both running and stopped containers.

Example status:

``` text
Exited (0)
```

means the program completed successfully.

------------------------------------------------------------------------

## Step 7: Display Application Output

``` bash
docker logs <container_id>
```

Example:

``` bash
docker logs b2671b1e8415
```

Output:

``` text
Hello World
```

**Purpose:** Shows everything printed by the application.

------------------------------------------------------------------------

# Complete Workflow

``` bash
docker login

docker build -t dockerUser/javaapp:0.0.1.RELEASE .

docker image ls

docker container run -d dockerUser/javaapp:0.0.1.RELEASE

docker container ls

docker container ls -a

docker logs <container_id>
```

# Notes

-   `docker container ls` shows only running containers.
-   `docker container ls -a` shows all containers.
-   `Exited (0)` indicates successful execution.
-   Use `docker logs <container_id>` to view program output after the
    container exits.
-   Repository names in Docker image tags must be lowercase.
