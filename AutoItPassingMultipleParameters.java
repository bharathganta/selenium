package com.mavwealth;

import java.io.IOException;


public class passingMultipleParameters {
	
	public void uploadFile() throws IOException{
	/* AutoIt code for uploading multiple files*/
	
	/*
	ControlFocus("File Upload","","Edit1")
	ControlSetText("File Upload","","Edit1",$CmdLine[1])
	ControlClick("File Upload","","Button1") 
	*/
							 /* ---------Auto It Path------------*//*----- upload image/file path-- */
	Runtime.getRuntime().exec("E:\\mavWealth\\passingParameter.exe"+" "+"E:\\mavWealth\\2.jpg");
	Runtime.getRuntime().exec("E:\\mavWealth\\passingParameter.exe"+" "+"E:\\mavWealth\\3.jpg");
	
	}

}
