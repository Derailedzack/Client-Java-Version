package net.client.Utils;

public class Version {
    private int major;
    private int minor;
    private int patch;
    private String build_type;
    public Version(int ver_major,int ver_minor,int ver_patch,String ver_build_type){
       this.major = ver_major;
       this.minor = ver_minor;
       this.patch = ver_patch;
       this.build_type = ver_build_type;
    }
    public String GetVersionInfo(Version version){
            return String.format("%b",version.major) + "." + String.format("%b",version.minor) + "." + String.format("%b",version.patch) + "-" + version.build_type;
    }
}
