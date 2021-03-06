package com.cb.generator.models;

import java.net.URL;

/**
 * Define a repository to be represented in the generated project if a dependency refers
 * to it.
 */
public class Repository {

	private String name;
	private URL url;
	private boolean snapshotsEnabled;

	public Repository() {
	}

	public Repository(String name, URL url, boolean snapshotsEnabled) {
		this.name = name;
		this.url = url;
		this.snapshotsEnabled = snapshotsEnabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public boolean isSnapshotsEnabled() {
		return snapshotsEnabled;
	}

	public void setSnapshotsEnabled(boolean snapshotsEnabled) {
		this.snapshotsEnabled = snapshotsEnabled;
	}

	@Override
	public String toString() {
		return "Repository [" + (name != null ? "name=" + name + ", " : "")
				+ (url != null ? "url=" + url + ", " : "") + "snapshotsEnabled="
				+ snapshotsEnabled + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (snapshotsEnabled ? 1231 : 1237);
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repository other = (Repository) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		if (snapshotsEnabled != other.snapshotsEnabled)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		}
		else if (!url.equals(other.url))
			return false;
		return true;
	}

}
