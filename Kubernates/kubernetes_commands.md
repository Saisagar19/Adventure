# Kubernetes Command History

Here are the successfully executed Kubernetes commands from your session, organized chronologically as steps.

1. **`kubectl version`**
   Displays the version information for both your local Kubernetes client and the cluster's server.

2. **`kubectl cluster-info`**
   Shows the active network addresses of the Kubernetes control plane and core services (like DNS).

3. **`kubectl get nodes`**
   Lists all the nodes (infrastructure servers/virtual machines) that are currently part of your Kubernetes cluster.

4. **`kubectl get pod -A`**
   Retrieves a list of all running pods across every namespace in the cluster.

5. **`kubectl get deployments`**
   Displays a list of all deployments running in the current default namespace along with their readiness status.

6. **`kubectl create deployment nginx1 --image=nginx`**
   Successfully creates a new deployment named "nginx1" using the official, correctly spelled NGINX image.

7. **`kubectl delete --help`**
   Opens the built-in help documentation and usage examples for deleting resources in Kubernetes.

8. **`kubectl delete pods --all`**
   Deletes all pods in the current namespace, forcing any active deployments to instantly recreate fresh ones.

9. **`kubectl expose deployment nginx1 --type=NodePort --port=80`**
   Creates a Service to expose the "nginx1" deployment so it can receive traffic on port 80.

10. **`kubectl get svc`**
    Lists all the Services (networking rules) currently created in the default namespace.

11. **`kubectl port-forward deployment/nginx1 8089:80`**
    Creates a temporary tunnel that forwards traffic from your computer's port 8089 directly to the deployment's port 80.
