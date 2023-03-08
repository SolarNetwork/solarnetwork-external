package com.serotonin.bacnet4j.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FilePersistence implements IPersistence {
    private final File file;
    private final Properties props;

    public FilePersistence(final File file) throws IOException {
        this.file = file;

        props = new Properties();
        try {
            try (FileReader in = new FileReader(file)) {
                props.load(in);
            }
        } catch (@SuppressWarnings("unused") final FileNotFoundException e) {
            // no op.
        }
    }

    @Override
    public void save(final String key, final String value) {
        props.setProperty(key, value);
        store();
    }

    @Override
    public String load(final String key) {
        return props.getProperty(key);
    }

    @Override
    public void remove(final String key) {
        props.remove(key);
        store();
    }

    private void store() {
        try {
            try (FileWriter out = new FileWriter(file)) {
                props.store(out, "");
            }
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public File[] getFiles() {
        return new File[] { file };
    }
}
