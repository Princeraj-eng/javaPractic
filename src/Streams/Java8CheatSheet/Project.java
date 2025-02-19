package Streams.Java8;

public class Project {
    public Project(String projectCode, String buLeadName, String client, String name) {
        this.projectCode = projectCode;
        this.buLeadName = buLeadName;
        this.client = client;
        this.name = name;
    }



    private String projectCode;
    private String name ;
    private String client;
    private String buLeadName;



    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBuLeadName() {
        return buLeadName;
    }

    public void setBuLeadName(String buLeadName) {
        this.buLeadName = buLeadName;
    }
}
