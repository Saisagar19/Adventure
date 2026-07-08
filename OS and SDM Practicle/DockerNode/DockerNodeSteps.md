# Docker Node.js Practical Commands

This document summarizes the Docker commands used during the practical.

## Step 1: Login

``` bash
docker login
```

**Purpose:** Authenticate with Docker Hub.

------------------------------------------------------------------------

## Step 2: Build Image

``` bash
docker build -t dockerUser/nodeapp.0.0.1.release .
```

**Purpose:** Build the Docker image.

**Explanation** - `-t` : Assign image name and tag. - `.` : Current
directory is the build context.

------------------------------------------------------------------------

## Step 3: List Images

``` bash
docker image ls
```

Displays all locally available Docker images.

------------------------------------------------------------------------

## Step 4: Run Container

``` bash
docker container run -d -p 3000:9999 dockerUser/nodeapp.0.0.1.release:latest
```

**Explanation** - `-d` : Run in detached mode. - `-p 3000:9999` : Map
host port 3000 to container port 9999.

------------------------------------------------------------------------

## Step 5: List Running Containers

``` bash
docker container ls
```

Shows only running containers.

------------------------------------------------------------------------

## Step 6: View Logs

``` bash
docker logs <container_id>
```

Displays the application's output.

------------------------------------------------------------------------

## Step 7: List All Containers

``` bash
docker container ls -a
```

Shows both running and stopped containers.

------------------------------------------------------------------------

## Step 8: Stop Container

``` bash
docker container stop <container_id>
```

Stops a running container.

------------------------------------------------------------------------

## Step 9: Remove Container

``` bash
docker container rm <container_id>
```

Removes a stopped container.

------------------------------------------------------------------------

## Step 10: Remove Image

``` bash
docker image rmi <image_name>
```

Deletes a Docker image.

------------------------------------------------------------------------

# Common Errors

  ------------------------------------------------------------------------------------------
  Incorrect                          Correct                            Reason
  ---------------------------------- ---------------------------------- --------------------
  docker conatiner ls                docker container ls                Typo

  docker container -a                docker container ls -a             `-a` works with `ls`

  docker container rm -r             docker container rm `<id>`{=html}  No `-r` option
  `<id>`{=html}                                                         

  docker images ls                   docker image ls                    Correct Docker
                                                                        syntax

  docker build -t                    docker build -t                    Use lowercase
  dockerUser/nodeapp.0.0.1.RELEASE . dockerUser/nodeapp.0.0.1.release . repository/tag names
  ------------------------------------------------------------------------------------------

# Complete Workflow

``` bash
docker login
docker build -t dockerUser/nodeapp.0.0.1.release .
docker image ls
docker container run -d -p 3000:9999 dockerUser/nodeapp.0.0.1.release:latest
docker container ls
docker logs <container_id>
docker container ls -a
docker container stop <container_id>
docker container rm <container_id>
docker image rmi <image_name>
docker image ls
```
