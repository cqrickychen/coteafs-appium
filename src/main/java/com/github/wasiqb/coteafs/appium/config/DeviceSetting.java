package com.github.wasiqb.coteafs.appium.config;

/**
 * @author wasiq.bhamla
 * @since 12-Apr-2017 8:34:28 PM
 */
public class DeviceSetting {
	private String			agentPath;
	private String			appActivity;
	private String			appLocation;
	private String			appName;
	private String			appPackage;
	private ApplicationType	appType;
	private String			appWaitActivity;
	private AutomationName	automationName;
	private String			bootstrapPath;
	private String			bundleId;
	private int				defaultWait;
	private String			deviceName;
	private DeviceType		deviceType;
	private String			deviceVersion;
	private boolean			externalApp;
	private boolean			fullReset;
	private boolean			noReset;
	private String			udid;
	private int				waitForElementUntil;

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:21:26 PM
	 */
	public DeviceSetting () {
		this.automationName = AutomationName.APPIUM;
		this.deviceType = DeviceType.ANDROID;
		this.appType = ApplicationType.NATIVE;
		this.defaultWait = 30;
		this.waitForElementUntil = 30;
		this.noReset = false;
		this.fullReset = false;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the agentPath
	 */
	public String getAgentPath () {
		return this.agentPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:48 PM
	 * @return the appActivity
	 */
	public String getAppActivity () {
		return this.appActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:48 PM
	 * @return the appLocation
	 */
	public String getAppLocation () {
		return this.appLocation;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:29:30 PM
	 * @return the appName
	 */
	public String getAppName () {
		return this.appName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the appPackage
	 */
	public String getAppPackage () {
		return this.appPackage;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the appType
	 */
	public ApplicationType getAppType () {
		return this.appType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 17-Apr-2017 9:23:00 PM
	 * @return the appWaitActivity
	 */
	public String getAppWaitActivity () {
		return this.appWaitActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the automationName
	 */
	public AutomationName getAutomationName () {
		return this.automationName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the bootstrapPath
	 */
	public String getBootstrapPath () {
		return this.bootstrapPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the bundleId
	 */
	public String getBundleId () {
		return this.bundleId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:27 PM
	 * @return the defaultWait
	 */
	public int getDefaultWait () {
		return this.defaultWait;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the deviceName
	 */
	public String getDeviceName () {
		return this.deviceName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the deviceType
	 */
	public DeviceType getDeviceType () {
		return this.deviceType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the deviceVersion
	 */
	public String getDeviceVersion () {
		return this.deviceVersion;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the udid
	 */
	public String getUdid () {
		return this.udid;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:27 PM
	 * @return the waitForElementUntil
	 */
	public int getWaitForElementUntil () {
		return this.waitForElementUntil;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 30-Apr-2017 8:00:43 PM
	 * @return the externalApp
	 */
	public boolean isExternalApp () {
		return this.externalApp;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @return the fullReset
	 */
	public boolean isFullReset () {
		return this.fullReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @return the noReset
	 */
	public boolean isNoReset () {
		return this.noReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param agentPath
	 *            the agentPath to set
	 */
	public void setAgentPath (final String agentPath) {
		this.agentPath = agentPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:48 PM
	 * @param appActivity
	 *            the appActivity to set
	 */
	public void setAppActivity (final String appActivity) {
		this.appActivity = appActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param appLocation
	 *            the appLocation to set
	 */
	public void setAppLocation (final String appLocation) {
		this.appLocation = appLocation;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:29:30 PM
	 * @param appName
	 *            the appName to set
	 */
	public void setAppName (final String appName) {
		this.appName = appName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param appPackage
	 *            the appPackage to set
	 */
	public void setAppPackage (final String appPackage) {
		this.appPackage = appPackage;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param appType
	 *            the appType to set
	 */
	public void setAppType (final ApplicationType appType) {
		this.appType = appType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 17-Apr-2017 9:23:00 PM
	 * @param appWaitActivity
	 *            the appWaitActivity to set
	 */
	public void setAppWaitActivity (final String appWaitActivity) {
		this.appWaitActivity = appWaitActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param automationName
	 *            the automationName to set
	 */
	public void setAutomationName (final AutomationName automationName) {
		this.automationName = automationName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param bootstrapPath
	 *            the bootstrapPath to set
	 */
	public void setBootstrapPath (final String bootstrapPath) {
		this.bootstrapPath = bootstrapPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param bundleId
	 *            the bundleId to set
	 */
	public void setBundleId (final String bundleId) {
		this.bundleId = bundleId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:27 PM
	 * @param defaultWait
	 *            the defaultWait to set
	 */
	public void setDefaultWait (final int defaultWait) {
		this.defaultWait = defaultWait;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param deviceName
	 *            the deviceName to set
	 */
	public void setDeviceName (final String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param deviceType
	 *            the deviceType to set
	 */
	public void setDeviceType (final DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param deviceVersion
	 *            the deviceVersion to set
	 */
	public void setDeviceVersion (final String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 30-Apr-2017 8:00:43 PM
	 * @param externalApp
	 *            the externalApp to set
	 */
	public void setExternalApp (final boolean externalApp) {
		this.externalApp = externalApp;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @param fullReset
	 *            the fullReset to set
	 */
	public void setFullReset (final boolean fullReset) {
		this.fullReset = fullReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @param noReset
	 *            the noReset to set
	 */
	public void setNoReset (final boolean noReset) {
		this.noReset = noReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param udid
	 *            the udid to set
	 */
	public void setUdid (final String udid) {
		this.udid = udid;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:28 PM
	 * @param waitForElementUntil
	 *            the waitForElementUntil to set
	 */
	public void setWaitForElementUntil (final int waitForElementUntil) {
		this.waitForElementUntil = waitForElementUntil;
	}
}