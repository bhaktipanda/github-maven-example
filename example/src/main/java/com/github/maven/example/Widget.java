package com.github.maven.example;

/**
 * Simple wigdet class that can be enabled or disabled
 */
public class Widget {

	private boolean enabled;
	private boolean disabled;

	/**
	 * Create new enabled widget
	 */
	public Widget() {
		enabled = false;
		disabled=true;
	}

	/**
	 * Is the widget currently enabled?
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * Set the widget enable state
	 * 
	 * @param enabled
	 * @return this widget
	 */
	public Widget setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}
	public Widget setDisabled(boolean disabled) {
		this.disabled = disabled;
		return this;
	}
}
