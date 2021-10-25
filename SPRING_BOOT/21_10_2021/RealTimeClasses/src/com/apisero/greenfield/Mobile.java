package com.apisero.greenfield;

public class Mobile {
	private String Name;
	private String model_no;
	private String release_date;
	private int ram;
	private int rom;
	private String processor;

	public Mobile(String name, String model_no, String release_date, int ram, int rom, String processor) {
		super();
		Name = name;
		this.model_no = model_no;
		this.release_date = release_date;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Mobile [Name=" + Name + ", model_no=" + model_no + ", release_date=" + release_date + ", ram=" + ram
				+ ", rom=" + rom + ", processor=" + processor + "]";
	}

}
