public class AccessLevel{
    public String canAccess(int[] rights, int minPermission) {
        String accessStatus = "";
        for(int i = 0; i < rights.length; i++){
            if (minPermission > rights[i]){
                accessStatus = accessStatus + "D";

            }
            else if(minPermission <= rights[i]){
                accessStatus = accessStatus + "A";
            }
            else {
                accessStatus = accessStatus;
            }
            }
        return accessStatus;
        }
    }
