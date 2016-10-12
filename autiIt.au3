ControlFocus("File Upload","","Edit1")
/* Passing multile files place of $CmdLins[1]*/
ControlSetText("File Upload","","Edit1",$CmdLine[1])
ControlClick("File Upload","","Button1")

