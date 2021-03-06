# Asal
Ejemplo simple de procesamiento en Android. Usa Android SDK y gradle.

Para entender mejor el código, se recomienda estudiar primero el proyecto https://github.com/gilpgnet/Amens.

Si tu computadora presenta problemas para compilar o ejecutar el código, puedes probar la versión para AIDE IDE:
https://github.com/gilpgnet/AideSal.

## Ejecución en Windows
1. Modifica la línea 5 del archivo _Asal.bat_ y asigna el nombre de la carpeta de tu cuenta a la variable **CUENTA**.
2. Abre el Símbolo del Sistema (cmd).
3. Prepara el dispositivo para ejecutar la app. Aquí se plantean 3 opciones:
   * [**Emulador Memu.**](https://www.memuplay.com/) Levanta el emulador. En los **Ajustes**, **Opciones de Desarrollo**,
     verifica que la **Depuración USB** esté activada. Desde una terminal teclea el siguiente comando.
  
     ```Batchfile
        call adb connect 127.0.0.1:21503
     ```
  
   * **Emulador normal.**  Levanta el emulador y desde una terminal teclea el siguiente comando.
  
     ```Batchfile
        call adb connect 127.0.0.1
     ```
  
   * **Dispositivo externo en modo desarrollador.** Conecta el dispositivo por USB a tu computadora. Si usas Windows 10, está listo.
     Si es una versión menor, necesitas descargar el driver para tu teléfono del sitio del fabricante, instalarlo y luego conectar tu
     dispositivo.
  
4. Cámbiate a la carpeta del ejemplo descompactado. Por ejemplo, si descompactas el proyecto en la carpeta
   _C:\ejemplos_, introduce el comando
   ```Batchfile
        cd C:\ejemplos\Asal-master
   ```
  
5. Ejecuta el comando
   ```Batchfile
        call Asal
   ```
   Si solicita una contraseña, usa **android**.

6. Si la aplicación aborta inesperadamente, introduce el siguiente comando
   ```Batchfile
        call adb logcat > logcat.txt
   ```
   
   Revisa el contenido del archivo _logcat.txt_. Es algo largo, pero revísalo desde el final hacia el inicio.
