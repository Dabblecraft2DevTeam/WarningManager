package io.github.synapz1.warningmanager.storage;

import org.bukkit.plugin.Plugin;

public class OfflineWarningsFile extends WarningManagerFile {

    public OfflineWarningsFile(Plugin wm) {
        super(wm, "cache.yml");
    }

    /*

    Ways of getting paths

     */
    public String getPath(String... paths) {
        String path = "";

        for (String part : paths)
            path += "." + part;

        path = path.replaceFirst("\\.", "");

        return path;
    }

    /*

    Abstract getting and setting values

     */
    public void setValue(String path, Object object) {
        file.set(path, object);
        saveFile();
    }

    public Object getValue(String path) {
        return file.get(path);
    }
}
