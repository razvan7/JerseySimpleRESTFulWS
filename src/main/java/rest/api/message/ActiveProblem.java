package rest.api.message;

public class ActiveProblem {

	private String locale;
	private long problemTypeId;
	private long taskId;
	private long assetTypeId;
	private String taskStr;

	public ActiveProblem(String locale, long problemTypeId, long taskId, long assetTypeId, String taskStr) {
		this.locale = locale;
		this.problemTypeId = problemTypeId;
		this.taskId = taskId;
		this.assetTypeId = assetTypeId;
		this.taskStr = taskStr;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public long getProblemTypeId() {
		return problemTypeId;
	}

	public void setProblemTypeId(long problemTypeId) {
		this.problemTypeId = problemTypeId;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public long getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(long assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public String getTaskStr() {
		return taskStr;
	}

	public void setTaskStr(String taskStr) {
		this.taskStr = taskStr;
	}

}
