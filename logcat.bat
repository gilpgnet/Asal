@echo off
PATH=%PATH%;C:\AndroidSdk\platform-tools
cd /d %0\..
call adb logcat > logcat.txt
pause