@echo off
tasklist /FI "IMAGENAME eq java.exe" | findstr "java.exe" >nul
if %ERRORLEVEL% == 1 goto runcode1
goto runcode2

:runcode1
echo ===================
echo Flamystic: Starting
echo ===================
start Flamystic.exe
echo ===================
echo Flamystic: Running
echo ===================
timeout /t 7200
echo ===================
echo Flamystic: Stopping
echo ===================
taskkill /f /t /im java.exe >nul
timeout /t 5 >nul
goto runcode1

:runcode2
echo ===================
echo Flamystic: Running
echo ===================
timeout /t 7200
taskkill /f /t /im java.exe >nul
timeout /t 5 >nul
goto runcode1